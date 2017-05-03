package com.nadezda.diplom;

import com.nadezda.diplom.tables.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Sinky on 03.05.2017.
 */
public class DataBaseRequestHelper {
    private Connection connection;
    public final static String SQL_GET_USERS_LIST = "SELECT * FROM [dbo].[User]";

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
                String sluzhba = rs.getString("us_sluzhba");
                String name = rs.getString("us_name");
                String dolj = rs.getString("us_dolj");
                String tel = rs.getString("us_tel");
                String login = rs.getString("us_login");
                String pass = rs.getString("us_pass");
                String roleId = rs.getString("us_id_Role");

                userList.add(new User(
                        idUser,
                        sluzhba,
                        name,
                        dolj,
                        tel,
                        login,
                        pass,
                        roleId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
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
