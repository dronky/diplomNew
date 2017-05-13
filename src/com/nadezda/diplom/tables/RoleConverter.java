package com.nadezda.diplom.tables;

import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by Alan on 11.05.2017.
 */
public class RoleConverter {
    public static void fillRoleObservableList(ArrayList<Role> roleFullList,
                                              ObservableList<RoleModel> roleModelList) {
        if (!roleFullList.isEmpty()) {
            roleModelList.addAll(roleFullList.stream().map(role -> new RoleModel(
                    role.getRole_id(),
                    role.getRole_name()
            )).collect(Collectors.toList()));
        }
    }

    public static Role roleModelToRole(RoleModel cm) {
        Role c = new Role(0,"");
        c.setRole_id(cm.getRole_id());
        c.setRole_name(cm.getRole_name());
        return c;
    }
}
