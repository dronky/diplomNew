package com.nadezda.diplom;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

/**
 * Created by Sinky on 13.05.2017.
 */
public class AlertMessenger {
    public static boolean showChangeRoleConfirmation(String str) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Role confirmation");
        alert.setHeaderText(null);
        alert.setContentText(str);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        IconHelper.iconConfirmSet(stage);
        Optional<ButtonType> result = alert.showAndWait();
        return result.get() == ButtonType.OK ? true : false;
    }

    public static void showSimpleError(String str) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText(str);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        IconHelper.iconRedCrossSet(stage);
        alert.showAndWait();
    }
}
