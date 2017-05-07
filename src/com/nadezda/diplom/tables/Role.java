package com.nadezda.diplom.tables;

/**
 * Created by Nadezda on 07.05.2017.
 */
public class Role {
    public int getRole_id() {
        return role_id;
    }

    public Role(int role_id, String role_name) {
        this.role_id = role_id;
        this.role_name = role_name;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int Role_id) {
        this.Role_id = Role_id;
    }

    public String getRole_name() {
        return Role_name;
    }

    public void setRole_name(String Role_name) {
        this.Role_name = Role_name;
    }
}
