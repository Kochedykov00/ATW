package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import Main;

public class MenuController {


    public MenuController () {}

    @FXML
    private Button settingsBtn;
    @FXML
    private Button randomBtn;
    @FXML
    private Button createBtn;
    @FXML
    private Button connectBtn;
    @FXML
    private Label errorMessage;


    public void settings() throws Exception {
        Stage stage = Main.getPrimaryStage();
        stage.getScene().setRoot((Parent) FXMLLoader.load(Main.class.getResource("views/Settings.fxml")));
        stage.sizeToScene();
    }

    public void randomGame() throws Exception {
        Stage stage = Main.getPrimaryStage();
        stage.setScene(new Scene((Parent)FXMLLoader.load(Main.class.getResource("views/Game.fxml")), 880.0D, 970.0D));
        //NetWorkClient.getCurrentNetwork().randomGame();
    }



}
