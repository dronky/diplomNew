package com.nadezda.diplom.controller;

import com.nadezda.diplom.AlertMessenger;
import com.nadezda.diplom.DataBaseRequestHelper;
import com.nadezda.diplom.SingletonData;
import com.nadezda.diplom.tables.User;
import com.nadezda.diplom.tables.UserConverter;
import com.nadezda.diplom.tables.UserModel;
import com.nadezda.diplom.tables.ViewUtility;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

public class SbController implements Initializable {

    private ObservableList<UserModel> dataModel = FXCollections.observableArrayList();
    @FXML
    TableView<UserModel> tvUser;
    @FXML
    private TableColumn<UserModel, Number> us_id, us_id_Role;
    @FXML
    private TableColumn<UserModel, String> us_sluzhba, us_name, us_dolj, us_tel, us_login, us_pass;
    @FXML
    ChoiceBox<String> cBox;
    private ObservableList<String> stringRoleList = FXCollections.observableArrayList();
    boolean cBoxClicked;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cBoxClicked = false;
        SingletonData.getInstance().fillRoleListFromDB();
        stringRoleList.addAll(SingletonData.getInstance().getStringRoleList());
        cBox.getItems().addAll(stringRoleList);
        cBox.getSelectionModel().clearSelection();
        cBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                UserModel selectedUser = tvUser.getSelectionModel().getSelectedItem();
                //If user not null and you clicked at cbox(manually cnanged role(not programm)) AND YOU NOT CHANGING YOUR'S ROLE AND YOU CANT CHANGE ROLE TO ADMIN AND YOU CAN'T CHANGE ADMIN'S ROLE
                if (selectedUser != null
                        && oldValue != null
                        && cBoxClicked == true) {
                    if (selectedUser.getUs_id() == SingletonData.getInstance().getCurrentUser().getUs_id()) {
                        AlertMessenger.showSimpleError("You can't change your role");
                        clearSelection();
                        cBoxClicked = false;
                    } else if (newValue.equals("administrator")) {
                        AlertMessenger.showSimpleError("You can't set this type of role");
                        clearSelection();
                        cBoxClicked = false;
                    } else if (selectedUser.getUs_id_Role() == 1) {
                        AlertMessenger.showSimpleError("You can't change Administrator's role");
                        clearSelection();
                        cBoxClicked = false;
                    } else if (AlertMessenger.showChangeRoleConfirmation("Are you sure want to change "
                            + selectedUser.getUs_name() + "'s role from " + SingletonData.getInstance().getRolesById(selectedUser.getUs_id_Role()).getRole_name()
                            + " to " + newValue + "?")) {
                        DataBaseRequestHelper helper = new DataBaseRequestHelper();
                        PreparedStatement statement = helper.getPreparedStatement(DataBaseRequestHelper.SQL_UPDATE_USER_ID_ROLE);
                        helper.updateUserIdRole(statement, UserConverter.userModelToUser(selectedUser), SingletonData.getInstance().getRoleByName(newValue).getRole_id());
                        clearSelection();
                        updateTable();

                    }
                }
            }
        });
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
        //dich
        ViewUtility.autoFitTable(tvUser);
    }

    private void clearSelection() {
        tvUser.getSelectionModel().clearSelection();
        cBox.getSelectionModel().clearSelection();
        cBoxClicked = false;
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

    public void usersOnMouseClicked(MouseEvent mouseEvent) {
        cBoxClicked = false;
        if (tvUser.getSelectionModel().getSelectedItem() != null) {
            cBox.getSelectionModel().select(SingletonData.getInstance().getRolesById(tvUser.getSelectionModel().getSelectedItem().getUs_id_Role()).getRole_name());
        }
    }

    public void cBoxOnMouseClicked(MouseEvent mouseEvent) {
        if (tvUser.getSelectionModel().getSelectedItem() == null){
            AlertMessenger.showSimpleError("Select user, please");
        }
        cBoxClicked = true;
    }
}
