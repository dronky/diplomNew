package com.nadezda.diplom.tables;

/**
 * Created by Nadezda on 07.05.2017.
 */
public class History {

    private int his_id;
    private String his_stat;
    private String his_date;
    private String his_comm;
    private int his_id_usr;
    private int his__id_Req;

    public History(int his_id, String his_stat, String his_date, String his_comm, int his_id_usr, int his__id_Req) {
        this.his_id = his_id;
        this.his_stat = his_stat;
        this.his_date = his_date;
        this.his_comm = his_comm;
        this.his_id_usr = his_id_usr;
        this.his__id_Req = his__id_Req;
    }
    public int getHis_id() {
        return his_id;
    }

    public void setHis_id(int his_id) {
        this.his_id = his_id;
    }

    public String getHis_stat() {
        return his_stat;
    }

    public void setHis_stat(String his_stat) {
        this.his_stat = his_stat;
    }

    public String getHis_date() {
        return his_date;
    }

    public void setHis_date(String his_date) {
        this.his_date = his_date;
    }

    public String getHis_comm() {
        return his_comm;
    }

    public void setHis_comm(String his_comm) {
        this.his_comm = his_comm;
    }

    public int getHis_id_usr() {
        return his_id_usr;
    }

    public void setHis_id_usr(int his_id_usr) {
        this.his_id_usr = his_id_usr;
    }

    public int getHis__id_Req() {
        return his__id_Req;
    }

    public void setHis__id_Req(int his__id_Req) {
        this.his__id_Req = his__id_Req;
    }

}
