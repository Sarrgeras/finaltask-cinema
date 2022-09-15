package model;

import java.util.Date;

public class User {
    private Integer idUser;
    private String userName;
    private String userSecondName;
    private Date birthday;
    private String login;
    private String password;
    private String accessLevel;

    public User(Integer idUser, String userName, String userSecondName, Date birthday, String login, String password, String accessLevel) {
        this.idUser = idUser;
        this.userName = userName;
        this.userSecondName = userSecondName;
        this.birthday = birthday;
        this.login = login;
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public User() {
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSecondName() {
        return userSecondName;
    }

    public void setUserSecondName(String userSecondName) {
        this.userSecondName = userSecondName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }
}
