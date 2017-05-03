package com.nadezda.diplom.controller;

import com.nadezda.diplom.ConnectorDB;
import com.nadezda.diplom.SingletonData;
import com.nadezda.diplom.tables.User;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ResourceBundle;

/**
 * Created by Nadezda on 02.02.2017.
 */
public class LoginController implements Initializable {
    private boolean loginStatus;
    @FXML
    TextField tfLogin;
    @FXML
    PasswordField pfPassword;
    @FXML
    Button btnLogin;
    @FXML
    Label lbl1;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loginStatus = false;
    }

    private void login(Event e) {
        SingletonData.getInstance().fillUserListFromDB();
        for (User user : SingletonData.getInstance().getUserList()) {
            if (tfLogin.getText().equals(user.getLogin()) && pfPassword.getText().equals(user.getPass())) {
                lbl1.setText("Login successful");
                loginStatus = true;
            }
        }
        if (loginStatus == false)
            lbl1.setText("Login Error");
    }

    public void btnClick(ActionEvent actionEvent) {
        login(actionEvent);
    }

    public void enterPressed(KeyEvent keyEvent) {
        KeyCode key = keyEvent.getCode();
        if (key.toString().equals("ENTER"))
            login(keyEvent);
    }


}