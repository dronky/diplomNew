package com.nadezda.diplom.tables;

import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by Alan on 11.05.2017.
 */
public class RequestConverter {
    public static void fillRequestObservableList(ArrayList<Request> requestFullList,
                                              ObservableList<RequestModel> requestModelList) {
        if (!requestFullList.isEmpty()) {
            requestModelList.addAll(requestFullList.stream().map(request -> new RequestModel(
                    request.getReq_id(),
                    request.getReq_otdel(),
                    request.getReq_kab(),
                    request.getReq_purpose(),
                    request.getReq_date_visit(),
                    request.getReq_date_create(),
                    request.getReq_date_change(),
                    request.getReq_status(),
                    request.getReq_comment(),
                    request.getReq_id_User(),
                    request.getReq_id_Visit()
            )).collect(Collectors.toList()));
        }
    }
    public static Request requestModelToRequest(RequestModel cm) {
        Request c = new Request(0,0,0,"",0,"","","","","","");
        c.setReq_id(cm.getReq_id());
        c.setReq_otdel(cm.getReq_otdel());
        c.setReq_kab(cm.getReq_kab());
        c.setReq_purpose(cm.getReq_purpose());
        c.setReq_date_visit(cm.getReq_date_visit());
        c.setReq_date_create(cm.getReq_date_create());
        c.setReq_date_change(cm.getReq_date_change());
        c.setReq_status(cm.getReq_status());
        c.setReq_comment(cm.getReq_comment());
        c.setReq_id_User(cm.getReq_id_User());
        c.setReq_id_Visit(cm.getReq_id_Visit());
        return c;
    }
}
