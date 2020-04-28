package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class DataBaseConnect extends Configs {
    Connection DBConnection;

    public Connection getDBConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":"
                + dbPort + "/" + dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");
        DBConnection = DriverManager.getConnection(connectionString, dbUser,
                dbPass);
        return DBConnection;
    }

    public void signUpUser(User user) {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" +
                Const.USER_FIRSTNAME + "," + Const.USER_NAME + "," + Const.USER_PATRONYMIC + "," + Const.USER_LOGIN + ","
                + Const.USER_PASSWORD + "," + Const.USER_POST + ")" + "VALUES(?,?,?,?,?,?)";
        try {

            PreparedStatement prSt = getDBConnection().prepareStatement(insert);
            prSt.setString(1, user.getFirstname());
            prSt.setString(2, user.getName());
            prSt.setString(3, user.getPatronymic());
            prSt.setString(4, user.getLogin());
            prSt.setString(5, user.getPassword());
            prSt.setString(6, user.getPost());


            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void signUpPatient(Patient patient) {
        String insert2 = "INSERT INTO " + Const.PATIENT_TABLE + "(" + Const.PATIENT_FIRSTNAME + "," + Const.PATIENT_NAME + ","
                + Const.PATIENT_PATRONYMIC + "," + Const.PATIENT_BIRTHDATE + "," + Const.PATIENT_INSURANCE + "," + Const.PATIENT_DIAGNOSE
                + ","  + Const.PATIENT_ANAMNESIS + "," + Const.PATIENT_DIAGNOSTICS + ","
                + Const.PATIENT_TREATMENT + "," + Const.PATIENT_GENDER + ")" + "VALUES(?,?,?,?,?,?,?,?,?,?)";


        try {
            PreparedStatement prSt2 = getDBConnection().prepareStatement(insert2);

            prSt2.setString(1, patient.getFirstname());
            prSt2.setString(2, patient.getName());
            prSt2.setString(3, patient.getPatronymic());
            prSt2.setString(4, patient.getBirthdate());
            prSt2.setString(5, patient.getInsurance());
            prSt2.setString(6, patient.getfDiagnose());
            prSt2.setString(7, patient.getAnamnesis());
            prSt2.setString(8, patient.getDiagnostics());
            prSt2.setString(9, patient.getTreatment());
            prSt2.setString(10, patient.getGender());
            prSt2.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public ResultSet getUser(User user){
        ResultSet resultSet = null;
        String select = "SELECT * FROM " + Const.USER_TABLE +" WHERE " +
                Const.USER_NAME + "=? AND " + Const.USER_PASSWORD + "=?";

        try {

            PreparedStatement prSt = getDBConnection().prepareStatement(select);
            prSt.setString(1, user.getLogin());
            prSt.setString(2, user.getPassword());



           resultSet = prSt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

}

