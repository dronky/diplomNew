package com.nadezda.diplom.tables;

import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by Alan on 11.05.2017.
 */
public class Reject_reqConverter {
    public static void fillReject_reqObservableList(ArrayList<Reject_req> reject_reqFullList,
                                              ObservableList<Reject_reqModel> reject_reqModelList) {
        if (!reject_reqFullList.isEmpty()) {
            reject_reqModelList.addAll(reject_reqFullList.stream().map(reject_req -> new Reject_reqModel(
                    reject_req.getRej_id(),
                    reject_req.getRej_prichina(),
                    reject_req.getRej_id_Req()
            )).collect(Collectors.toList()));
        }
    }

    public static Reject_req reject_reqModelToReject_req(Reject_reqModel cm) {
        Reject_req c = new Reject_req(0,"",0);
        c.setRej_id(cm.getRej_id());
        c.setRej_prichina(cm.getRej_prichina());
        c.setRej_id_Req(cm.getRej_id_Req());
        return c;
    }
}
