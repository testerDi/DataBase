package sample;

public class User {
    private String userID;
    private String firstname;
    private String name;
    private String patronymic;
    private String login;
    private String password;
    private String post;
    //public int counter = 5;

    public User(/*String userID,*/ String firstname, String name, String patronymic, String login, String password, String post) {
        //this.userID = userID; // user id in db
        this.firstname = firstname;
        this.name = name;
        this.patronymic = patronymic;
        this.login = login;
        this.password = password;
        this.post = post;
        //counter++;
    }

    public User() {}

    public String getUserID () {return userID; } //get id from user
    //public void setUserID () {this.userID = new String(String.valueOf(counter)); } //set the ID for User in DB
    public String getFirstname (){
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname=firstname;
    }
    public String getName (){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getPatronymic (){
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic=patronymic;
    }
    public String getLogin (){
        return login;
    }
    public void setLogin(String login) {
        this.login=login;
    }
    public String getPassword (){
        return password;
    }
    public void setPassword(String password) {
        this.password=password;
    }
    public String getPost (){
        return post;
    }
    public void setPost(String post) {
        this.post=post;
    }
}
