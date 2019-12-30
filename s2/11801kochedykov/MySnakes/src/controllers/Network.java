package controllers;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import models.Game;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Network {
    private static Network currentNetwork;
    private Socket socket;
    private OutputStream writer;
    private InputStream reader;
    private BooleanProperty gameIsGoing = new SimpleBooleanProperty(false);
    private BooleanProperty hasRoom = new SimpleBooleanProperty(false);
    public static BooleanProperty hasConnection = new SimpleBooleanProperty(false);
    public static BooleanProperty yourMove = new SimpleBooleanProperty(false);

    public boolean isHasRoom() {
        return this.hasRoom.get();
    }

    public static void setYourMove(boolean yourMove) {
        yourMove.setValue(yourMove);
    }

    public Network(String ip, int port) throws IOException {
        this.socket = new Socket(ip, port);
        System.out.println("Connected: " + this.socket.getInetAddress() + ":" + this.socket.getPort());
        currentNetwork = this;
        this.writer = this.socket.getOutputStream();
        this.reader = this.socket.getInputStream();
        this.hasRoom.setValue(false);
        hasConnection.setValue(true);
        this.gameIsGoing.setValue(false);
    }

    public BooleanProperty gameIsGoingProperty() {
        return this.gameIsGoing;
    }

    public void setGameIsGoing(boolean gameIsGoing) {
        this.gameIsGoing.set(gameIsGoing);
    }

    public static Network getCurrentNetwork() {
        return currentNetwork;
    }

    public void randomGame() {
        try {
            this.writer.write(5);
            this.hasRoom.setValue(true);
            int response = this.reader.read();
            if (response == 0) {
                new Game(Team.WHITE, GameController.getImages());
            } else {
                new Game(Team.BLACK, GameController.getImages());
                this.setGameIsGoing(true);
            }

            GameController.getMessageLabel().textProperty().bind(Game.getCurrentGame().messageProperty());
            if (response == 1) {
                Game.getCurrentGame().setMessage("Enemy`s move");
            }

            System.out.println("new game");
            (new NetWorkThread(this.socket)).start();
        } catch (Exception var2) {
            this.disconnected();
        }

    }

    public void createGame() {
        try {
            this.writer.write(0);
            int key = this.reader.read();
            this.hasRoom.setValue(true);
            new Game(Team.WHITE, GameController.getImages());
            GameController.getMessageLabel().textProperty().bind(Game.getCurrentGame().messageProperty());
            Game.getCurrentGame().setMessage("Waiting of second player: your code " + key);
            System.out.println("new game");
            (new NetWorkThread(this.socket)).start();
        } catch (Exception var2) {
            this.disconnected();
        }
    }


    public void roomNotExist() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("The room does not exist");
        alert.setContentText("Connection error");
        Stage stage = Main.getPrimaryStage();

        try {
            stage.setScene(new Scene((Parent) FXMLLoader.load(Main.class.getResource("views/Menu.fxml")), 880.0D, 880.0D));
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        alert.show();
    }

    public void connectGame(int key) {
        try {
            this.writer.write(1);
            this.writer.write(key);
            if (this.reader.read() == 1) {
                this.hasRoom.setValue(true);
                new Game(Team.BLACK, GameController.getImages());
                GameController.getMessageLabel().textProperty().bind(Game.getCurrentGame().messageProperty());
                Game.getCurrentGame().setMessage("Enemy`s move");
                this.setGameIsGoing(true);
                System.out.println("new game");
                (new NetWorkThread(this.socket)).start();
            } else {
                this.roomNotExist();
            }
        } catch (Exception var3) {
            this.disconnected();
        }

    }
}

