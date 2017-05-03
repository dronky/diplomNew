package com.nadezda.diplom;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
<<<<<<< HEAD
import javafx.scene.image.Image;
=======
>>>>>>> Initial commit
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        InitLoginLayout(primaryStage);
    }

    public void InitLoginLayout(Stage s) {
        Stage primaryStage=s;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/nadezda/diplom/view/login.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Login");
            primaryStage.show();
<<<<<<< HEAD
            primaryStage.getIcons().add(new Image("com/nadezda/diplom/img/photologo.png"));
=======
>>>>>>> Initial commit
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void showMainMenu(Stage s) { //список заявок
        Stage primaryStage=s;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/nadezda/diplom/view/main.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Login");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
