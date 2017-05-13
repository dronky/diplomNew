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
    @FXML
    TextField tfLogin;
    @FXML
    PasswordField pfPassword;
    @FXML
    Button btnLogin;
    @FXML
    Label lbl1;

    //1 - administrator
    //2 - sb
    //3 - staff
    //4 - soglStaff
    //5 - inspector - operator

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
                roleName = "Administrator";
                break;
            case 2:
                viewName = "sb";
                roleName = "Slujba bezopasnosti";
                break;
            case 3:
                viewName = "staff";
                roleName = "Staff";
                break;
            case 4:
                viewName = "soglStaff";
                roleName = "Agree staff";
                break;
            case 5:
                viewName = "inspector";
                roleName = "Inspector";
                break;
            default:
                viewName = "staff";
                roleName = "Staff";
                break;
        }
        Parent parent = FXMLLoader.load(getClass().getResource("/com/nadezda/diplom/view/" + viewName + "Main.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Mos metro - " + roleName);
        stage.getIcons().add(new Image("com/nadezda/diplom/img/photologo.png"));
        stage.show();
    }

}