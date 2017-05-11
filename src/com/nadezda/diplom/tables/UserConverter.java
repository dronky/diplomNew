package com.nadezda.diplom.tables;

import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by Sinky on 08.05.2017.
 */
public class UserConverter {
    public static void fillUserObservableList(ArrayList<User> userFullList,
                                              ObservableList<UserModel> userModelList) {
        if (!userFullList.isEmpty()) {
            userModelList.addAll(userFullList.stream().map(user -> new UserModel(
                    user.getUs_id(),
                    user.getUs_sluzhba(),
                    user.getUs_name(),
                    user.getUs_dolj(),
                    user.getUs_tel(),
                    user.getUs_login(),
                    user.getUs_pass(),
                    user.getUs_id_Role()
            )).collect(Collectors.toList()));
        }
    }

    public static User userModelToUser(UserModel cm) {
        User c = new User(0, 0, "", "", "", "", "", "");
        c.setUs_id(cm.getUs_id());
        c.setUs_id_Role(cm.getUs_id_Role());
        c.setUs_name(cm.getUs_name());
        c.setUs_sluzhba(cm.getUs_sluzhba());
        c.setUs_dolj(cm.getUs_doljnost());
        c.setUs_tel(cm.getUs_tel());
        c.setUs_login(cm.getUs_login());
        c.setUs_pass(cm.getUs_pass());
        return c;
    }
}
