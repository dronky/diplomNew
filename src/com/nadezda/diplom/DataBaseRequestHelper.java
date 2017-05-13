package com.nadezda.diplom;

import com.nadezda.diplom.tables.Role;
import com.nadezda.diplom.tables.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Sinky on 03.05.2017.
 */
public class DataBaseRequestHelper {
    private Connection connection;
    public final static String SQL_GET_USERS_LIST = "SELECT * FROM [dbo].[User]";
    public static final String SQL_GET_ROLES_LIST = "SELECT * FROM [dbo].[Role]";
    public static final String SQL_UPDATE_USER_ID_ROLE = "UPDATE [dbo].[User] " +
            "SET [us_id_Role] = ? " +
            "WHERE us_id = ?";

    public void DataBaseRequestHelper() throws SQLException {
        ConnectorDB c = new ConnectorDB();
        connection = c.getConnection();
    }

    public PreparedStatement getPreparedStatement(String sqlQuery) {
        ConnectorDB c = new ConnectorDB();
        connection = c.getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }

    public ArrayList<User> getUserList(PreparedStatement ps) {
        ArrayList<User> userList = new ArrayList<>();
        try {
            ResultSet rs = ps.executeQuery();
            //HashSet<Integer> userIdSet = new HashSet<>();
            while (rs.next()) {
                int idUser = rs.getInt("us_id");
                int roleId = rs.getInt("us_id_Role");
                String sluzhba = rs.getString("us_sluzhba");
                String name = rs.getString("us_name");
                String dolj = rs.getString("us_dolj");
                String tel = rs.getString("us_tel");
                String login = rs.getString("us_login");
                String pass = rs.getString("us_pass");

                userList.add(new User(
                        idUser,
                        roleId,
                        sluzhba,
                        name,
                        dolj,
                        tel,
                        login,
                        pass));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public boolean updateUserIdRole(PreparedStatement ps, User user, int roleId) {
        boolean flag = false;
        try {
            ps.setInt(1, roleId);
            ps.setInt(2, user.getUs_id());
            int status = ps.executeUpdate();
            flag = status != 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }


    public ArrayList<Role> getRoleList(PreparedStatement ps) {
        ArrayList<Role> roleList = new ArrayList<>();
        try {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int roleId = rs.getInt("role_id");
                String roleName = rs.getString("role_name");
                roleList.add(new Role(
                        roleId,
                        roleName));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roleList;
    }

    public void closeStatement(PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
