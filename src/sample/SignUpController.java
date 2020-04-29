package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton Admin;

    @FXML
    private RadioButton Doc;

    @FXML
    private RadioButton Registr;

    @FXML
    private RadioButton Nurse;

    @FXML
    private TextField Patronymic;

    @FXML
    private TextField Name;

    @FXML
    private TextField Login;

    @FXML
    private TextField Password;

    @FXML
    private TextField Firstname;

    @FXML
    private Button SignUp;

    @FXML
    private Button BackButton;

    @FXML
    void initialize() {
        BackButton.setOnAction(actionEvent -> {
            BackButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Login.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot ();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } );
        SignUp.setOnAction(event -> {
            signUpNewUser();
    });
    }
        private void signUpNewUser (){
        DataBaseConnect DBConnect = new DataBaseConnect();

            String login = Login.getText();
            String password = Password.getText();
            String firstname = Firstname.getText();
            String name = Name.getText();
            String patronymic = Patronymic.getText();
            String post = "";
            if (Admin.isSelected())
                post = "Admin";
            else if (Doc.isSelected())
                post = "Doctor";
            else if (Nurse.isSelected())
                post = "Nurse";
            else if (Registr.isSelected())
                post = "Registrator";

            User user = new User(firstname, name, patronymic, login, password, post);

            DBConnect.signUpUser(user);


    }
}