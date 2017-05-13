package com.nadezda.diplom;

import com.nadezda.diplom.tables.Role;
import com.nadezda.diplom.tables.User;

import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 * Created by Sinky on 03.05.2017.
 */

public class SingletonData {
    private static volatile SingletonData instance;
    private ArrayList<User> userList = null;
    private ArrayList<String> stringRoleList = null;
    private ArrayList<Role> roleList = null;
    private User currentUser = null;

    SingletonData() {
        userList = new ArrayList<>();
        roleList = new ArrayList<>();
        stringRoleList = new ArrayList<>();
    }

    //Login User DATA
    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    //ROLES

    public void fillRoleListFromDB() {
        DataBaseRequestHelper helper = null;
        PreparedStatement statement = null;
        try {
            helper = new DataBaseRequestHelper();
            statement = helper.getPreparedStatement(DataBaseRequestHelper.SQL_GET_ROLES_LIST);
            roleList.clear();
            roleList.addAll(helper.getRoleList(statement));

            //converting to string list for choiceBox
            stringRoleList.clear();
            for (Role role : roleList) {
                stringRoleList.add(role.getRole_name());
            }

        } finally {
            if (helper != null) {
                helper.closeStatement(statement);
            }
        }
    }

    public Role getRolesById(int id) {
        if (roleList != null && roleList.size() > 0) {
            for (Role role : roleList) {
                if (id == role.getRole_id()) return role;
            }
        }
        return null;
    }

    public Role getRoleByName(String roleName) {
        if (roleList != null && roleList.size() > 0) {
            for (Role role : roleList) {
                if (roleName == role.getRole_name()) return role;
            }
        }
        return null;
    }

    public ArrayList<Role> getRoleList() {
        return roleList;
    }

    public ArrayList<String> getStringRoleList() {
        return stringRoleList;
    }

    // USERS
    public void fillUserListFromDB() {
        DataBaseRequestHelper helper = null;
        PreparedStatement statement = null;
        try {
            helper = new DataBaseRequestHelper();
            statement = helper.getPreparedStatement(DataBaseRequestHelper.SQL_GET_USERS_LIST);
            userList.clear();
            userList.addAll(helper.getUserList(statement));
        } finally {
            if (helper != null) {
                helper.closeStatement(statement);
            }
        }
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public User getUserById(int id) {
        if (userList != null && userList.size() > 0) {
            for (User user : userList) {
                if (id == user.getUs_id()) return user;
            }
        }
        return null;
    }

    // INSTANCE
    public static SingletonData getInstance() {
        SingletonData localInstance = instance;
        if (localInstance == null) {
            synchronized (SingletonData.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new SingletonData();
                }
            }
        }
        return localInstance;
    }

}
