package com.nadezda.diplom.controller;

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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
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
            if (tfLogin.getText().equals(user.getUs_login()) && pfPassword.getText().equals(user.getUs_pass())) {
                lbl1.setText("Login successful");
                loginStatus = true;
                try {
                    dummy(e);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
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

    private void dummy(Event e) throws IOException {
        ((Node) e.getSource()).getScene().getWindow().hide();
        Stage stage = new Stage();
        Parent parent = FXMLLoader.load(getClass().getResource("/com/nadezda/diplom/view/sbMain.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Slujba bezopasnosti");
        stage.getIcons().add(new Image("com/sinky/photobit/img/photologo.png"));
        stage.show();
    }

}