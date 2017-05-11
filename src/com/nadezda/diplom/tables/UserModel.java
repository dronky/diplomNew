package com.nadezda.diplom.tables;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Nadezda on 07.05.2017.
 */
public class UserModel {
    private IntegerProperty us_id;
    private StringProperty us_sluzhba;
    private StringProperty us_name;
    private StringProperty us_doljnost;
    private StringProperty us_tel;
    private StringProperty us_login;
    private StringProperty us_pass;
    private IntegerProperty us_id_Role;


    public UserModel(int us_id, String us_sluzhba, String us_name, String us_doljnost, String us_tel, String us_login, String us_pass, int us_id_Role){
        this.us_id = new SimpleIntegerProperty(us_id);
        this.us_sluzhba = new SimpleStringProperty(us_sluzhba);
        this.us_name = new SimpleStringProperty(us_name);
        this.us_doljnost = new SimpleStringProperty(us_doljnost);
        this.us_tel = new SimpleStringProperty(us_tel);
        this.us_login = new SimpleStringProperty(us_login);
        this.us_pass = new SimpleStringProperty(us_pass);
        this.us_id_Role = new SimpleIntegerProperty(us_id_Role);
    }
    public void setUs_id(int us_id) {this.us_id.set(us_id);}
    public void setUs_sluzhba(String us_sluzhba) {this.us_sluzhba.set(us_sluzhba);}
    public void setUs_name(String us_name) {this.us_name.set(us_name);}
    public void setUs_doljnost(String us_doljnost) {this.us_doljnost.set(us_doljnost);}
    public void setUs_tel(String us_tel) {this.us_tel.set(us_tel);}
    public void setUs_login(String us_login) {this.us_login.set(us_login);}
    public void setUs_pass(String us_pass) {this.us_pass.set(us_pass);}
    public void setUs_id_Role(int us_id_Role) {this.us_id_Role.set(us_id_Role);}

    public int getUs_id() {
        return us_id.get();
    }

    public IntegerProperty us_idProperty() {
        return us_id;
    }

    public String getUs_sluzhba() {
        return us_sluzhba.get();
    }

    public StringProperty us_sluzhbaProperty() {
        return us_sluzhba;
    }

    public String getUs_name() {
        return us_name.get();
    }

    public StringProperty us_nameProperty() {
        return us_name;
    }

    public String getUs_doljnost() {
        return us_doljnost.get();
    }

    public StringProperty us_doljnostProperty() {
        return us_doljnost;
    }


    public String getUs_tel() {
        return us_tel.get();
    }

    public StringProperty us_telProperty() {
        return us_tel;
    }

    public String getUs_login() {
        return us_login.get();
    }

    public StringProperty us_loginProperty() {
        return us_login;
    }


    public String getUs_pass() {
        return us_pass.get();
    }

    public StringProperty us_passProperty() {
        return us_pass;
    }


    public int getUs_id_Role() {
        return us_id_Role.get();
    }

    public IntegerProperty us_id_RoleProperty() {
        return us_id_Role;
    }

}
