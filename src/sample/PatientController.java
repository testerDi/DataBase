package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

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
    private TextField SDiagnose;

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
    void initialize() {
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
        String fDiagnose = FDiagnose.getText();
        String sDiagnose = SDiagnose.getText();
        String anamnesis = Anamnesis.getText();
        String diagnostics = Diagnostics.getText();
        String treatment = Treatment.getText();
        String gender = "";
        if (Male.isSelected()) gender = "Мужчина";
        else  if (Female.isSelected()) gender = "Женщина";
        Patient patient = new Patient(firstname, name, patronymic, birthdate, insurance,
                fDiagnose, sDiagnose, anamnesis, diagnostics, treatment, gender);
        DBConnect.signUpPatient(patient);
    }

}
