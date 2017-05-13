package com.nadezda.diplom.tables;

import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by Alan on 11.05.2017.
 */
public class HistoryConverter {
    public static void fillHistoryObservableList(ArrayList<History> historyFullList,
                                              ObservableList<HistoryModel> historyModelList) {
        if (!historyFullList.isEmpty()) {
            historyModelList.addAll(historyFullList.stream().map(history -> new HistoryModel(
                    history.getHis_id(),
                    history.getHis_stat(),
                    history.getHis_date(),
                    history.getHis_comm(),
                    history.getHis_id_usr(),
                    history.getHis__id_Req()
            )).collect(Collectors.toList()));
        }
    }

    public static History historyModelToHistory(HistoryModel cm) {
        History c = new History(0,"","","",0,0);
        c.setHis_id(cm.getHis_id());
        c.setHis_stat(cm.getHis_stat());
        c.setHis_date(cm.getHis_date());
        c.setHis_comm(cm.getHis_comm());
        c.setHis_id_usr(cm.getHis_id_usr());
        c.setHis__id_Req(cm.getHis_id_Req());
        return c;
    }
}
