package com.nadezda.diplom.tables;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Nadezda on 07.05.2017.
 */
public class VisitorModel {
    private IntegerProperty vis_id;
    private StringProperty vis_name;
    private StringProperty vis_date;
    private StringProperty vis_passport;
    private StringProperty vis_pol;
    private StringProperty vis_organizatsiya;

    public VisitorModel(int vis_id, String vis_name, String vis_date, String vis_passport, String vis_pol, String vis_organizatsiya){
        this.vis_id = new SimpleIntegerProperty(vis_id);
        this.vis_name = new SimpleStringProperty(vis_name);
        this.vis_date = new SimpleStringProperty(vis_date);
        this.vis_passport = new SimpleStringProperty(vis_passport);
        this.vis_pol = new SimpleStringProperty(vis_pol);
        this.vis_organizatsiya = new SimpleStringProperty(vis_organizatsiya);
    }

    public int getVis_id() {
        return vis_id.get();
    }

    public String getVis_name() {
        return vis_name.get();
    }

    public String getVis_date() {
        return vis_date.get();
    }

    public String getVis_passport() {
        return vis_passport.get();
    }

    public String getVis_pol() {
        return vis_pol.get();
    }

    public String getVis_organizatsiya() {
        return vis_organizatsiya.get();
    }

    public void setVis_id(int vis_id) {this.vis_id.set(vis_id);}
    public void setVis_name(String vis_name) {this.vis_name.set(vis_name);}
    public void setVis_date(String vis_date) {this.vis_date.set(vis_date);}
    public void setVis_passport(String vis_passport) {this.vis_passport.set(vis_passport);}
    public void setVis_pol(String vis_pol) {this.vis_pol.set(vis_pol);}
    public void setVis_organizatsiya(String vis_organizatsiya) {this.vis_organizatsiya.set(vis_organizatsiya);}

    public IntegerProperty vis_idProperty() {
        return vis_id;
    }

    public StringProperty vis_nameProperty() {
        return vis_name;
    }

    public StringProperty vis_dateProperty() {
        return vis_date;
    }

    public StringProperty vis_passportProperty() {
        return vis_passport;
    }

    public StringProperty vis_polProperty() {
        return vis_pol;
    }

    public StringProperty vis_organizatsiyaProperty() {
        return vis_organizatsiya;
    }
}
