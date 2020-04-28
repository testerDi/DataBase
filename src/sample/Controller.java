package sample;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SignUpButton;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button SignIn_button;

    @FXML
    void initialize() {
        SignUpButton.setOnAction(event -> {
            SignUpButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("SignUp.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });

        SignIn_button.setOnAction(actionEvent -> {
            String login = login_field.getText();
            String password = password_field.getText();

            if (!login.equals("") && !password.equals(""))
                loginUser(login, password);
            else
                System.out.println("Login and password is empty");
        });


    }

    private void loginUser(String login, String password) {
        DataBaseConnect dbConnect = new DataBaseConnect();
        User user1= new User();
        user1.setLogin(login);
        user1.setPassword(password);
        ResultSet result = dbConnect.getUser(user1);

        int counter = 0;

            try {
                while (result.next()) {
                    counter++;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


            if (counter < 1) {
                System.out.println("Success!");}

        }
    }
