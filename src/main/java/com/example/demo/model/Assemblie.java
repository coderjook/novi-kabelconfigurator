package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Assemblie {

    @Id
    private UUID id_assemblie;
    private int artnr_kabel;
    private double lengte_kabel;
    private int artnr_connector_a;
    private int artnr_connector_b;
    private int artnr_afw_conn_a;
    private int artnr_afw_conn_b;
    private int artnr_haspel;
    private String trans_krimp;
    private int lengte_trans_krimp;
    private long artnr_assemblie;


    //constructor
    public Assemblie() {
    }

    public Assemblie(@JsonProperty("id_assemblie")UUID id_assemblie,
                     @JsonProperty("artnr_kabel")int artnr_kabel,
                     @JsonProperty("lengte_kabel")double lengte_kabel,
                     @JsonProperty("artnr_connector_a")int artnr_connector_a,
                     @JsonProperty("artnr_connector_b")int artnr_connector_b,
                     @JsonProperty("artnr_afw_conn_a")int artnr_afw_conn_a,
                     @JsonProperty("artnr_afw_conn_b")int artnr_afw_conn_b,
                     @JsonProperty("artnr_haspel")int artnr_haspel,
                     @JsonProperty("trans_krimp")String trans_krimp,
                     @JsonProperty("lengte_trans_krimp")int lengte_trans_krimp,
                     @JsonProperty("artnr_assemblie")long artnr_assemblie)
    {
        this.id_assemblie = id_assemblie;
        this.artnr_kabel = artnr_kabel;
        this.lengte_kabel = lengte_kabel;
        this.artnr_connector_a = artnr_connector_a;
        this.artnr_connector_b = artnr_connector_b;
        this.artnr_afw_conn_a = artnr_afw_conn_a;
        this.artnr_afw_conn_b = artnr_afw_conn_b;
        this.artnr_haspel = artnr_haspel;
        this.trans_krimp = trans_krimp;
        this.lengte_trans_krimp = lengte_trans_krimp;
        this.artnr_assemblie = artnr_assemblie;
    }

    //methods


    public UUID getId_assemblie() {
        return id_assemblie;
    }

    public void setId_assemblie(UUID id_assemblie) {
        this.id_assemblie = id_assemblie;
    }

    public int getArtnr_kabel() {
        return artnr_kabel;
    }

    public void setArtnr_kabel(int artnr_kabel) {
        this.artnr_kabel = artnr_kabel;
    }

    public double getLengte_kabel() {
        return lengte_kabel;
    }

    public void setLengte_kabel(int lengte_kabel) {
        this.lengte_kabel = lengte_kabel;
    }

    public int getArtnr_connector_a() {
        return artnr_connector_a;
    }

    public void setArtnr_connector_a(int artnr_connector_a) {
        this.artnr_connector_a = artnr_connector_a;
    }

    public int getArtnr_connector_b() {
        return artnr_connector_b;
    }

    public void setArtnr_connector_b(int artnr_connector_b) {
        this.artnr_connector_b = artnr_connector_b;
    }

    public int getArtnr_afw_conn_a() {
        return artnr_afw_conn_a;
    }

    public void setArtnr_afw_conn_a(int artnr_afw_conn_a) {
        this.artnr_afw_conn_a = artnr_afw_conn_a;
    }

    public int getArtnr_afw_conn_b() {
        return artnr_afw_conn_b;
    }

    public void setArtnr_afw_conn_b(int artnr_afw_conn_b) {
        this.artnr_afw_conn_b = artnr_afw_conn_b;
    }

    public int getArtnr_haspel() {
        return artnr_haspel;
    }

    public void setArtnr_haspel(int artnr_haspel) {
        this.artnr_haspel = artnr_haspel;
    }

    public String getTrans_krimp() {
        return trans_krimp;
    }

    public void setTrans_krimp(String trans_krimp) {
        this.trans_krimp = trans_krimp;
    }

    public int getLengte_trans_krimp() {
        return lengte_trans_krimp;
    }

    public void setLengte_trans_krimp(int lengte_trans_krimp) {
        this.lengte_trans_krimp = lengte_trans_krimp;
    }

    public long getArtnr_assemblie() {return artnr_assemblie; }

    public void setArtnr_assemblie(long artnr_assemblie) { this.artnr_assemblie = artnr_assemblie; }
}
