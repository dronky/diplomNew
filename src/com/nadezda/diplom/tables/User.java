package com.nadezda.diplom.tables;

/**
 * Created by Nadezda on 26.02.2017.
 */
public class User {
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

}
