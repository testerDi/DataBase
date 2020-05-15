package ViewController;

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
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import sample.Patient;

public class PatientController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField FirstName;

    @FXML
    private TextField Patronymic;

    @FXML
    private TextField Name;

    @FXML
    private TextField BirthDate;

    @FXML
    private TextField Insurance;

    @FXML
    private TextField FDiagnose;

    @FXML
    private TextField Anamnesis;

    @FXML
    private TextField Diagnostics;

    @FXML
    private TextField Treatment;

    @FXML
    private Button AddPatient;

    @FXML
    private RadioButton Male;

    @FXML
    private ToggleGroup Status;

    @FXML
    private RadioButton Female;

    @FXML
    private Button BackButton;

    @FXML
    private Button Card;

    @FXML
    void initialize() {
        BackButton.setOnAction(event ->{
            BackButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Forms/Login.fxml"));
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
    AddPatient.setOnAction(event ->{
        signUpNewPatient();
    });
    }
    private void signUpNewPatient(){
        DataBaseConnect DBConnect = new DataBaseConnect();
        String firstname = FirstName.getText();
        String name = Name.getText();
        String patronymic = Patronymic.getText();
        String birthdate = BirthDate.getText();
        String insurance = Insurance.getText();
        String Diagnose = FDiagnose.getText();
        String anamnesis = Anamnesis.getText();
        String diagnostics = Diagnostics.getText();
        String treatment = Treatment.getText();
        String gender = "";
        if (Male.isSelected()) gender = "Male";
        else  if (Female.isSelected()) gender = "Female";
        Patient patient = new Patient(firstname, name, patronymic, birthdate, insurance,
                Diagnose, anamnesis, diagnostics, treatment, gender);
        DBConnect.signUpPatient(patient);
    }

}
