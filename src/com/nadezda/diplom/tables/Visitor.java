package com.nadezda.diplom.tables;

/**
 * Created by Sinky on 07.05.2017.
 */
public class Visitor {
    private int vis_id;
    private String vis_name;
    private String vis_date;
    private String vis_passport;
    private String vis_pol;
    private String vis_organizatsiya;

    public Visitor(int vis_id, String vis_name, String vis_date, String vis_passport, String vis_pol, String vis_organizatsiya) {
        this.vis_id = vis_id;
        this.vis_name = vis_name;
        this.vis_date = vis_date;
        this.vis_passport = vis_passport;
        this.vis_pol = vis_pol;
        this.vis_organizatsiya = vis_organizatsiya;
    }

    public int getVis_id() {
        return vis_id;
    }

    public void setVis_id(int vis_id) {
        this.vis_id = vis_id;
    }

    public String getVis_name() {
        return vis_name;
    }

    public void setVis_name(String vis_name) {
        this.vis_name = vis_name;
    }

    public String getVis_date() {
        return vis_date;
    }

    public void setVis_date(String vis_date) {
        this.vis_date = vis_date;
    }

    public String getVis_passport() {
        return vis_passport;
    }

    public void setVis_passport(String vis_passport) {
        this.vis_passport = vis_passport;
    }

    public String getVis_pol() {
        return vis_pol;
    }

    public void setVis_pol(String vis_pol) {
        this.vis_pol = vis_pol;
    }

    public String getVis_organizatsiya() {
        return vis_organizatsiya;
    }

    public void setVis_organizatsiya(String vis_organizatsiya) {
        this.vis_organizatsiya = vis_organizatsiya;
    }
}
