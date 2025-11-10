package TDD.User;

public class User {


    private String userName;
    private String passWord;


    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;


    }

    public String getPassword() {
        return passWord;

    }

    public void setPassWord(String newPassword) {

        this.passWord = newPassword;

    }

    public String getUserName() {
        return userName;

    }

    public void setUserName(String userName) {
        this.userName = userName;


    }

    public void setUsername(String userName) {


    }
}
