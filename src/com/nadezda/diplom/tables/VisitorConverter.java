package com.nadezda.diplom.tables;

import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by Alan on 11.05.2017.
 */
public class VisitorConverter {
    public static void fillVisitorObservableList(ArrayList<Visitor> visitorFullList,
                                              ObservableList<VisitorModel> visitorModelList) {
        if (!visitorFullList.isEmpty()) {
            visitorModelList.addAll(visitorFullList.stream().map(visitor -> new VisitorModel(
                    visitor.getVis_id(),
                    visitor.getVis_name(),
                    visitor.getVis_date(),
                    visitor.getVis_passport(),
                    visitor.getVis_pol(),
                    visitor.getVis_organizatsiya()
            )).collect(Collectors.toList()));
        }
    }
    public static Visitor visitorModelToVisitor(VisitorModel cm) {
        Visitor c = new Visitor(0,"", "", "", "", "");
        c.setVis_id(cm.getVis_id());
        c.setVis_name(cm.getVis_name());
        c.setVis_date(cm.getVis_date());
        c.setVis_passport(cm.getVis_passport());
        c.setVis_pol(cm.getVis_pol());
        c.setVis_organizatsiya(cm.getVis_organizatsiya());
        return c;
    }
}


