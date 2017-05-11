package com.nadezda.diplom.tables;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Nadezda on 07.05.2017.
 */
public class Reject_reqModel {
    private IntegerProperty rej_id;
    private StringProperty rej_prichina;
    private IntegerProperty rej_id_Req;

    public Reject_reqModel(int rej_id, String rej_prichina, int rej_id_Req) {
        this.rej_id = new SimpleIntegerProperty(rej_id);
        this.rej_prichina = new SimpleStringProperty(rej_prichina);
        this.rej_id_Req = new SimpleIntegerProperty(rej_id_Req);
    }

    public void setRej_id(int rej_id) {
        this.rej_id.set(rej_id);
    }

    public void setRej_prichina(String rej_prichina) {
        this.rej_prichina.set(rej_prichina);
    }

    public void setRej_id_Req(int rej_id_Req) {
        this.rej_id_Req.set(rej_id_Req);
    }

    public int getRej_id() {
        return rej_id.get();
    }

    public String getRej_prichina() {
        return rej_prichina.get();
    }

    public int getRej_id_Req() {
        return rej_id_Req.get();
    }

    public IntegerProperty rej_idProperty() {
        return rej_id;
    }

    public StringProperty rej_prichinaProperty() {
        return rej_prichina;
    }

    public IntegerProperty rej_id_ReqProperty() {
        return rej_id_Req;
    }
}

