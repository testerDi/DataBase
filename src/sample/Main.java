package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("Patients Base");
        primaryStage.setScene(new Scene(root, 750, 450));
        primaryStage.show();
        //System.out.println(System.getProperty("javafx.runtime.version"));
    }


    public static void main(String[] args) {

        //System.out.println(System.getProperty("java.version"));
        launch(args);
    }
}
