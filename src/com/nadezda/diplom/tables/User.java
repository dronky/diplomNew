package com.nadezda.diplom.tables;

/**
 * Created by Nadezda on 26.02.2017.
 */
public class User {
<<<<<<< HEAD
    private int us_id;
    private int us_id_Role;
    private String us_sluzhba;
    private String us_name;
    private String us_dolj;
    private String us_tel;
    private String us_login;
    private String us_pass;

    public User(int us_id, int us_id_Role, String us_sluzhba, String us_name, String us_dolj, String us_tel, String us_login, String us_pass) {
        this.us_id = us_id;
        this.us_id_Role = us_id_Role;
        this.us_sluzhba = us_sluzhba;
        this.us_name = us_name;
        this.us_dolj = us_dolj;
        this.us_tel = us_tel;
        this.us_login = us_login;
        this.us_pass = us_pass;
    }


    public int getUs_id_Role() {
        return us_id_Role;
    }

    public void setUs_id_Role(int us_id_Role) {
        this.us_id_Role = us_id_Role;
    }

    public int getUs_id() {
        return us_id;
    }

    public void setUs_id(int us_id) {
        this.us_id = us_id;
    }

    public String getUs_sluzhba() {
        return us_sluzhba;
    }

    public void setUs_sluzhba(String us_sluzhba) {
        this.us_sluzhba = us_sluzhba;
    }

    public String getUs_name() {
        return us_name;
    }

    public void setUs_name(String us_name) {
        this.us_name = us_name;
    }

    public String getUs_dolj() {
        return us_dolj;
    }

    public void setUs_dolj(String us_dolj) {
        this.us_dolj = us_dolj;
    }

    public String getUs_tel() {
        return us_tel;
    }

    public void setUs_tel(String us_tel) {
        this.us_tel = us_tel;
    }

    public String getUs_login() {
        return us_login;
    }

    public void setUs_login(String us_login) {
        this.us_login = us_login;
    }

    public String getUs_pass() {
        return us_pass;
    }

    public void setUs_pass(String us_pass) {
        this.us_pass = us_pass;
    }

=======
    private int id;
    private String sluzhba;
    private String name;
    private String doljnost;
    private String tel;
    private String login;
    private String pass;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", sluzhba='" + sluzhba + '\'' +
                ", name='" + name + '\'' +
                ", doljnost='" + doljnost + '\'' +
                ", tel='" + tel + '\'' +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", role_id='" + role_id + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSluzhba() {
        return sluzhba;
    }

    public void setSluzhba(String sluzhba) {
        this.sluzhba = sluzhba;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoljnost() {
        return doljnost;
    }

    public void setDoljnost(String doljnost) {
        this.doljnost = doljnost;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public User(int id, String sluzhba, String name, String doljnost, String tel, String login, String pass, String role_id) {

        this.id = id;
        this.sluzhba = sluzhba;
        this.name = name;
        this.doljnost = doljnost;
        this.tel = tel;
        this.login = login;
        this.pass = pass;
        this.role_id = role_id;
    }

    private String role_id;

>>>>>>> Initial commit
}
