package ViewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class MainPageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button signOut;

    @FXML
    private Button AddPatient;

    @FXML
    private TextArea patient_name;

    @FXML
    void initialize() {
        signOut.setOnAction(actionEvent -> {
            signOut.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../Forms/Login.fxml"));
            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });

    }
}
