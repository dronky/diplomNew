package com.nadezda.diplom.tables;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Nadezda on 07.05.2017.
 */
public class RequestModel {
    private IntegerProperty req_id;
    private StringProperty req_otdel;
    private IntegerProperty req_kab;
    private StringProperty req_purpose;
    private StringProperty req_date_visit;
    private StringProperty req_date_create;
    private StringProperty req_date_change;
    private StringProperty req_status;
    private StringProperty req_comment;
    private IntegerProperty req_id_User;
    private IntegerProperty req_id_Visit;

    public RequestModel(int req_id, String req_otdel, int req_kab, String req_purpose, String req_date_visit, String req_date_create, String req_date_change, String req_status, String req_comment, int req_id_User, int req_id_Visit) {
        this.req_id = new SimpleIntegerProperty(req_id);
        this.req_otdel = new SimpleStringProperty(req_otdel);
        this.req_kab = new SimpleIntegerProperty(req_kab);
        this.req_purpose = new SimpleStringProperty(req_purpose);
        this.req_date_visit = new SimpleStringProperty(req_date_visit);
        this.req_date_create = new SimpleStringProperty(req_date_create);
        this.req_date_change = new SimpleStringProperty(req_date_change);
        this.req_status = new SimpleStringProperty(req_status);
        this.req_comment = new SimpleStringProperty(req_comment);
        this.req_id_User = new SimpleIntegerProperty(req_id_User);
        this.req_id_Visit = new SimpleIntegerProperty(req_id_Visit);
    }
    public void setReq_id(int req_id) {this.req_id.set(req_id);}
    public void setReq_otdel(String req_otdel) {this.req_otdel.set(req_otdel);}
    public void setReq_kab(int req_kab) {this.req_kab.set(req_kab);}
    public void setReq_purpose(String req_purpose) {this.req_purpose.set(req_purpose);}
    public void setReq_date_visit(String req_date_visit) {this.req_date_visit.set(req_date_visit);}
    public void setReq_date_create(String req_date_create) {this.req_date_create.set(req_date_create);}
    public void setReq_date_change(String req_date_change) {this.req_date_change.set(req_date_change);}
    public void setReq_status(String req_status) {this.req_status.set(req_status);}
    public void setReq_comment(String req_comment) {this.req_comment.set(req_comment);}
    public void setReq_id_User(int req_id_User) {this.req_id_User.set(req_id_User);}
    public void setReq_id_Visit(int req_id_Visit) {this.req_id_Visit.set(req_id_Visit);}

    public int getReq_id() {
        return req_id.get();
    }

    public IntegerProperty req_idProperty() {
        return req_id;
    }

    public String getReq_otdel() {
        return req_otdel.get();
    }

    public StringProperty req_otdelProperty() {
        return req_otdel;
    }

    public int getReq_kab() {
        return req_kab.get();
    }

    public IntegerProperty req_kabProperty() {
        return req_kab;
    }

    public String getReq_purpose() {
        return req_purpose.get();
    }

    public StringProperty req_purposeProperty() {
        return req_purpose;
    }

    public String getReq_date_visit() {
        return req_date_visit.get();
    }

    public StringProperty req_date_visitProperty() {
        return req_date_visit;
    }

    public String getReq_date_create() {
        return req_date_create.get();
    }

    public StringProperty req_date_createProperty() {
        return req_date_create;
    }

    public String getReq_date_change() {
        return req_date_change.get();
    }

    public StringProperty req_date_changeProperty() {
        return req_date_change;
    }

    public String getReq_status() {
        return req_status.get();
    }

    public StringProperty req_statusProperty() {
        return req_status;
    }

    public String getReq_comment() {
        return req_comment.get();
    }

    public StringProperty req_commentProperty() {
        return req_comment;
    }

    public int getReq_id_User() {
        return req_id_User.get();
    }

    public IntegerProperty req_id_UserProperty() {
        return req_id_User;
    }

    public int getReq_id_Visit() {
        return req_id_Visit.get();
    }

    public IntegerProperty req_id_VisitProperty() {
        return req_id_Visit;
    }
}
