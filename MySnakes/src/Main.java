import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    public static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{

        stage = primaryStage;

        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("../views/Menu.fxml"));
        primaryStage.setTitle("MySnakes");
        primaryStage.setScene(new Scene(root, 1080.0D, 1080.0D));
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    /*public void stop() throws Exception {
        super.stop();

        try {
            NetWorkClient.getCurrentNetwork().giveUp();
        } catch (Exception e) {
            System.out.println("closed");
        }

    }
    */

    public static Stage getPrimaryStage () {
        return stage;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
