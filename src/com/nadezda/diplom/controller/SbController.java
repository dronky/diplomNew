package com.nadezda.diplom.controller;

import com.nadezda.diplom.SingletonData;
import com.nadezda.diplom.tables.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

/**
 * Created by Sinky on 07.05.2017.
 */
public class SbController implements Initializable {

    private ObservableList<User> data = FXCollections.observableArrayList();
    @FXML
    TableView<User> tvUser;
    @FXML
    TableColumn<User, Integer> us_id, us_id_Role;
    @FXML
    TableColumn<User, String> us_sluzhba, us_name, us_dolj, us_tel, us_login, us_pass;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        SingletonData.getInstance().fillUserListFromDB();
        data.addAll(SingletonData.getInstance().getUserList());

        // устанавливаем тип и значение которое должно хранится в колонке
        us_id.setCellValueFactory(new PropertyValueFactory<User, Integer>("us_id"));
        us_id_Role.setCellValueFactory(new PropertyValueFactory<User, Integer>("us_id_Role"));
        us_sluzhba.setCellValueFactory(new PropertyValueFactory<User, String>("us_sluzhba"));
        us_name.setCellValueFactory(new PropertyValueFactory<User, String>("us_name"));
        us_dolj.setCellValueFactory(new PropertyValueFactory<User, String>("us_dolj"));
        us_tel.setCellValueFactory(new PropertyValueFactory<User, String>("us_tel"));
        us_login.setCellValueFactory(new PropertyValueFactory<User, String>("us_login"));
        us_pass.setCellValueFactory(new PropertyValueFactory<User, String>("us_pass"));

        tvUser.setItems(data);
    }


}
