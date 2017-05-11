package com.nadezda.diplom.tables;

/**
 * Created by Nadezda on 07.05.2017.
 */
public class Request {
    private int req_id;
    private int req_id_User;
    private int req_id_Visit;
    private String req_otdel;
    private int req_kab;
    private String req_purpose;
    private String req_date_visit;
    private String req_date_create;
    private String req_date_change;
    private String req_status;
    private String req_comment;

    public Request(int req_id, int req_id_User, int req_id_Visit, String req_otdel, int req_kab, String req_purpose, String req_date_visit, String req_date_create, String req_date_change, String req_status, String req_comment) {
        this.req_id = req_id;
        this.req_id_User = req_id_User;
        this.req_id_Visit = req_id_Visit;
        this.req_otdel = req_otdel;
        this.req_kab = req_kab;
        this.req_purpose = req_purpose;
        this.req_date_visit = req_date_visit;
        this.req_date_create = req_date_create;
        this.req_date_change = req_date_change;
        this.req_status = req_status;
        this.req_comment = req_comment;
    }

    public int getReq_id_User() {
        return req_id_User;
    }

    public void setReq_id_User(int req_id_User) {
        this.req_id_User = req_id_User;
    }

    public int getReq_id_Visit() {
        return req_id_Visit;
    }

    public void setReq_id_Visit(int req_id_Visit) {
        this.req_id_Visit = req_id_Visit;
    }

    public int getReq_id() {
        return req_id;
    }

    public void setReq_id(int req_id) {
        this.req_id = req_id;
    }

    public String getReq_otdel() {
        return req_otdel;
    }

    public void setReq_otdel(String req_otdel) {
        this.req_otdel = req_otdel;
    }

    public int getReq_kab() {
        return req_kab;
    }

    public void setReq_kab(int req_kab) {
        this.req_kab = req_kab;
    }

    public String getReq_purpose() {
        return req_purpose;
    }

    public void setReq_purpose(String req_purpose) {
        this.req_purpose = req_purpose;
    }

    public String getReq_date_visit() {
        return req_date_visit;
    }

    public void setReq_date_visit(String req_date_visit) {
        this.req_date_visit = req_date_visit;
    }

    public String getReq_date_create() {
        return req_date_create;
    }

    public void setReq_date_create(String req_date_create) {
        this.req_date_create = req_date_create;
    }

    public String getReq_date_change() {
        return req_date_change;
    }

    public void setReq_date_change(String req_date_change) {
        this.req_date_change = req_date_change;
    }

    public String getReq_status() {
        return req_status;
    }

    public void setReq_status(String req_status) {
        this.req_status = req_status;
    }

    public String getReq_comment() {
        return req_comment;
    }

    public void setReq_comment(String req_comment) {
        this.req_comment = req_comment;
    }
}
