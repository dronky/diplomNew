package com.nadezda.diplom.tables;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Nadezda on 07.05.2017.
 */
public class HistoryModel {
    private IntegerProperty his_id;
    private StringProperty his_stat;
    private StringProperty his_date;
    private StringProperty his_comm;
    private IntegerProperty his_id_usr;
    private IntegerProperty his_id_Req;

    public HistoryModel(int his_id, String his_stat,String his_date, String his_comm, int his_id_usr, int his_id_Req) {
        this.his_id = new SimpleIntegerProperty(his_id);
        this.his_stat = new SimpleStringProperty(his_stat);
        this.his_date = new SimpleStringProperty(his_date);
        this.his_comm = new SimpleStringProperty(his_comm);
        this.his_id_usr = new SimpleIntegerProperty(his_id_usr);
        this.his_id_Req = new SimpleIntegerProperty(his_id_Req);
    }
    public void setHis_id(int his_id) {this.his_id.set(his_id);}
    public void setHis_stat(String his_stat) {this.his_stat.set(his_stat);}
    public void setHis_date(String his_date) {this.his_date.set(his_date);}
    public void setHis_id_usr(int his_id_usr) {this.his_id_usr.set(his_id_usr);}
    public void setHis_comm(String his_comm) {this.his_comm.set(his_comm);}
    public void setHis_id_Req(int his_id_Req) {this.his_id_Req.set(his_id_Req);}

    public int getHis_id() {
        return his_id.get();
    }

    public IntegerProperty his_idProperty() {
        return his_id;
    }

    public String getHis_stat() {
        return his_stat.get();
    }

    public StringProperty his_statProperty() {
        return his_stat;
    }

    public String getHis_date() {
        return his_date.get();
    }

    public StringProperty his_dateProperty() {
        return his_date;
    }

    public String getHis_comm() {
        return his_comm.get();
    }

    public StringProperty his_commProperty() {
        return his_comm;
    }

    public int getHis_id_usr() {
        return his_id_usr.get();
    }

    public IntegerProperty his_id_usrProperty() {
        return his_id_usr;
    }

    public int getHis_id_Req() {
        return his_id_Req.get();
    }

    public IntegerProperty his_id_ReqProperty() {
        return his_id_Req;
    }

}

