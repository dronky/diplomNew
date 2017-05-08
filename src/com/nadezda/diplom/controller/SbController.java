package com.nadezda.diplom.controller;

import com.nadezda.diplom.SingletonData;
import com.nadezda.diplom.tables.UserConverter;
import com.nadezda.diplom.tables.UserModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Sinky on 07.05.2017.
 */
public class SbController implements Initializable {

    private ObservableList<UserModel> dataModel = FXCollections.observableArrayList();
    @FXML
    TableView<UserModel> tvUser;
    @FXML
    private TableColumn<UserModel, Number> us_id, us_id_Role;
    @FXML
    private TableColumn<UserModel, String> us_sluzhba, us_name, us_dolj, us_tel, us_login, us_pass;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        updateTable();
        tvUser.setItems(dataModel);
    }

    private void updateTable() {
        //Unselect current row
        tvUser.getSelectionModel().clearSelection();
        //Get fresh dataModel from DB
        SingletonData.getInstance().fillUserListFromDB();
        //Clear current dataModel if exist
        clearTable(tvUser, dataModel);
        //convert dataModel to model
        UserConverter.fillUserObservableList(SingletonData.getInstance().getUserList(), dataModel);
        fillTable();
        tvUser.setItems(dataModel);
    }

    //setting type and value for column
    private void fillTable() {
        us_id.setCellValueFactory(cellData -> cellData.getValue().us_idProperty());
        us_id_Role.setCellValueFactory(cellData -> cellData.getValue().us_id_RoleProperty());
        us_sluzhba.setCellValueFactory(cellData -> cellData.getValue().us_sluzhbaProperty());
        us_name.setCellValueFactory(cellData -> cellData.getValue().us_nameProperty());
        us_dolj.setCellValueFactory(cellData -> cellData.getValue().us_doljnostProperty());
        us_tel.setCellValueFactory(cellData -> cellData.getValue().us_telProperty());
        us_login.setCellValueFactory(cellData -> cellData.getValue().us_loginProperty());
        us_pass.setCellValueFactory(cellData -> cellData.getValue().us_passProperty());
    }

    private static void clearTable(TableView tv, ObservableList o) {
        tv.setDisable(false);
        tv.setOpacity(1);
        tv.setVisible(true);
        itemRemover(o);
    }

    private static void itemRemover(ObservableList data) {
        if (data.size() > 0) {
            int i = 0;
            while (data.size() > 0)
                data.remove(i);
            i++;
        }
    }
}
