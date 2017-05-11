package com.nadezda.diplom.tables;

/**
 * Created by Nadezda on 07.05.2017.
 */
public class Reject_req {
    private int rej_id;
    private String rej_prichina;
    private int rej_id_Req;

    public Reject_req(int rej_id, String rej_prichina, int rej_id_Req) {
        this.rej_id = rej_id;
        this.rej_prichina = rej_prichina;
        this.rej_id_Req = rej_id_Req;

    }

    public int getRej_id() {
        return rej_id;
    }

    public void setRej_id(int rej_id) {
        this.rej_id = rej_id;
    }

    public String getRej_prichina() {
        return rej_prichina;
    }

    public void setRej_prichina(String rej_prichina) {
        this.rej_prichina = rej_prichina;
    }

    public int getRej_id_Req() {
        return rej_id_Req;
    }

    public void setRej_id_Req(int rej_id_Req) {
        this.rej_id_Req = rej_id_Req;
    }

}
