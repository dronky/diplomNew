package com.nadezda.diplom.controller;

<<<<<<< HEAD
import com.nadezda.diplom.SingletonData;
import com.nadezda.diplom.tables.User;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
=======
import com.nadezda.diplom.ConnectorDB;
import com.nadezda.diplom.tables.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
>>>>>>> Initial commit
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
<<<<<<< HEAD
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
=======

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
>>>>>>> Initial commit

/**
 * Created by Nadezda on 02.02.2017.
 */
<<<<<<< HEAD
public class LoginController implements Initializable {
=======
public class LoginController {
>>>>>>> Initial commit
    @FXML
    TextField tfLogin;
    @FXML
    PasswordField pfPassword;
    @FXML
    Button btnLogin;
    @FXML
    Label lbl1;

<<<<<<< HEAD
    //1 - Admin
    //2 - SB
    //3 - staff
    //4 - soglStaff

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    private void login(Event e) throws IOException {
        SingletonData.getInstance().fillUserListFromDB();
        for (User user : SingletonData.getInstance().getUserList()) {
            if (tfLogin.getText().equals(user.getUs_login()) && pfPassword.getText().equals(user.getUs_pass()))
                SingletonData.getInstance().setCurrentUser(user);
        }
        if (SingletonData.getInstance().getCurrentUser() != null)
            load(e);
        else lbl1.setText("Login incorrect!");

    }

    public void btnClick(ActionEvent actionEvent) throws IOException {
        login(actionEvent);
    }

    public void enterPressed(KeyEvent keyEvent) throws IOException {
        KeyCode key = keyEvent.getCode();
        if (key.toString().equals("ENTER"))
            login(keyEvent);
    }

    private void load(Event e) throws IOException {
        ((Node) e.getSource()).getScene().getWindow().hide();
        Stage stage = new Stage();
        String viewName, roleName;
        switch (SingletonData.getInstance().getCurrentUser().getUs_id_Role()) {
            case 1:
                viewName = "adm";
                roleName = "administrator";
                break;
            case 2:
                viewName = "sb";
                roleName = "Slujba bezopasnosti";
                break;
            case 3:
                viewName = "staff";
                roleName = "staff";
                break;
            case 4:
                viewName = "soglStaff";
                roleName = "agree staff";
                break;
            default:
                viewName = "staff";
                roleName = "staff";
                break;
        }
        Parent parent = FXMLLoader.load(getClass().getResource("/com/nadezda/diplom/view/" + viewName + "Main.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle(roleName);
        stage.getIcons().add(new Image("com/nadezda/diplom/img/photologo.png"));
        stage.show();
    }

}
=======
    public final static String SQL_SELECT_USR = "SELECT * FROM [dbo].[User]";

    public void btnClick(ActionEvent actionEvent) {
        select();
     /*   if (tfLogin.getText().equals("gayfish") && pfPassword.getText().equals("barabashka"))
            lbl1.setText("all ok");
        else
            lbl1.setText("Неправильный логин или пароль.");*/
    }
    public static PreparedStatement getPreparedStatement(String sqlQuery) {
        Connection connection;
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
    public static void select(){
        ArrayList<User> userList = new ArrayList<>();
        PreparedStatement statement = null;
        statement = getPreparedStatement(SQL_SELECT_USR);
        userList.clear();
        userList.addAll(getUserList(statement));
        System.out.println(userList.get(0).toString());
    }

//ПРОВЕРИТЬ НА ПУСТУЮ ТАБЛУ
    public static ArrayList<User> getUserList(PreparedStatement ps) {
        ArrayList<User> userList = new ArrayList<>();
        try {
            ResultSet rs = ps.executeQuery();
            HashSet<Integer> userIdSet = new HashSet<>();
            while (rs.next()) {
                int idUser = rs.getInt("us_id");
                if (userIdSet.add(idUser)) {
// parse all stuff
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
                            pass,roleId));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
>>>>>>> Initial commit
