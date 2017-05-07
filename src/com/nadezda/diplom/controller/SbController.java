package com.nadezda.diplom.controller;

import com.nadezda.diplom.SingletonData;
import com.nadezda.diplom.tables.User;
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

    private ObservableList<User> data;
    @FXML
    TableView<User> tvUser;
    @FXML
    TableColumn<User, Integer> id, id_role;
    @FXML
    TableColumn<User, String> sluzhba, name, doljnost, tel, login, pass;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        SingletonData.getInstance().fillUserListFromDB();
        data.addAll(SingletonData.getInstance().getUserList());

        // устанавливаем тип и значение которое должно хранится в колонке
        id.setCellValueFactory(new PropertyValueFactory<User, Integer>("id"));
        id_role.setCellValueFactory(new PropertyValueFactory<User, Integer>("id_role"));
        sluzhba.setCellValueFactory(new PropertyValueFactory<User, String>("sluzhba"));
        name.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
        doljnost.setCellValueFactory(new PropertyValueFactory<User, String>("doljnost"));
        tel.setCellValueFactory(new PropertyValueFactory<User, String>("tel"));
        login.setCellValueFactory(new PropertyValueFactory<User, String>("login"));
        pass.setCellValueFactory(new PropertyValueFactory<User, String>("pass"));

        tvUser.setItems(data);
    }



}
