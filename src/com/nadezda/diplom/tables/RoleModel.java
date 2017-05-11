package com.nadezda.diplom.tables;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Nadezda on 07.05.2017.
 */
public class RoleModel {
    private IntegerProperty role_id;
    private StringProperty role_name;

    public RoleModel(int role_id, String role_name){
        this.role_id = new SimpleIntegerProperty(role_id);
        this.role_name = new SimpleStringProperty(role_name);}

    public void setRole_id(int role_id) {this.role_id.set(role_id);}
    public void setRole_name(String role_name) {this.role_name.set(role_name);}

    public int getRole_id() {
        return role_id.get();
    }

    public IntegerProperty role_idProperty() {
        return role_id;
    }

    public String getRole_name() {
        return role_name.get();
    }

    public StringProperty role_nameProperty() {
        return role_name;
    }
}
