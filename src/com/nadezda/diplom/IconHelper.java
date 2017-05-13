package com.nadezda.diplom;

import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Created by Sinky on 13.05.2017.
 */
public class IconHelper {
    public static void iconSet(Stage s) {
        s.getIcons().add(new Image("com/nadezda/diplom/img/photologo.png"));
    }

    public static void iconConfirmSet(Stage s) {
        s.getIcons().add(new Image("com/nadezda/diplom/img/confirm.png"));
    }

    public static void iconRedCrossSet(Stage s) {
        s.getIcons().add(new Image("com/nadezda/diplom/img/delete.png"));
    }
}
