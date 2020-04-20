package sample;

public class Patient {
    private String firstname;
    private String name;
    private String patronymic;
    private String birthdate;
    private String insurance_number;
    private String first_diagnose;
    private String second_diagnose;
    private String anamnesis;
    private String add_diagnostics;
    private String treatment;


    public Patient(String firstname, String name, String patronymic, String birthdate,
                   String insurance_number, String first_diagnose, String second_diagnose,
                   String anamnesis, String add_diagnostics, String treatment) {
        this.firstname = firstname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthdate = birthdate;
        this.insurance_number = insurance_number;
        this.first_diagnose = first_diagnose;
        this.second_diagnose = second_diagnose;
        this.anamnesis = anamnesis;
        this.add_diagnostics = add_diagnostics;
        this.treatment = treatment;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getInsurance_number() {
        return insurance_number;
    }

    public void setInsurance_number(String insurance_number) {
        this.insurance_number = insurance_number;
    }

    public String getFirst_diagnose() {
        return first_diagnose;
    }

    public void setFirst_diagnose(String first_diagnose) {
        this.first_diagnose = first_diagnose;
    }

    public String getSecond_diagnose() {
        return second_diagnose;
    }

    public void setSecond_diagnose(String second_diagnose) {
        this.second_diagnose = second_diagnose;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getAdd_diagnostics() {
        return add_diagnostics;
    }

    public void setAdd_diagnostics(String add_diagnostics) {
        this.add_diagnostics = add_diagnostics;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

}