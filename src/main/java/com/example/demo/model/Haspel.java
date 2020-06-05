package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Haspel {

    @Id
    private int artikelnummer;
    private String merk;
    private String typenummer;
    private String configurator;
    private double inkoopprijs;
    private int prijsper;
    private double breedte_haspel;
    private double diameter_kern_haspel;
    private double diameter_haspel;

    public Haspel(){}

    public Haspel(@JsonProperty("artikelnummer")int artikelnummer,
                  @JsonProperty("typenummer")String typenummer,
                  @JsonProperty("merk")String merk,
                  @JsonProperty("configurator")String configurator,
                  @JsonProperty("inkoopprijs")double inkoopprijs,
                  @JsonProperty("prijsper")int prijsper,
                  @JsonProperty("breedte_haspel")double breedte_haspel,
                  @JsonProperty("diameter_kern_haspel")double diameter_kern_haspel,
                  @JsonProperty("diameter_haspel")double diameter_haspel) {
        this.artikelnummer = artikelnummer;
        this.typenummer = typenummer;
        this.merk = merk;
        this.configurator = configurator;
        this.inkoopprijs = inkoopprijs;
        this.prijsper = prijsper;
        this.breedte_haspel = breedte_haspel;
        this.diameter_kern_haspel = diameter_kern_haspel;
        this.diameter_haspel = diameter_haspel;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(int artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTypenummer() {
        return typenummer;
    }

    public void setTypenummer(String typenummer) {
        this.typenummer = typenummer;
    }

    public String getConfigurator() {
        return configurator;
    }

    public void setConfigurator(String configurator) {
        this.configurator = configurator;
    }

    public double getInkoopprijs() {
        return inkoopprijs;
    }

    public void setInkoopprijs(double inkoopprijs) {
        this.inkoopprijs = inkoopprijs;
    }

    public int getPrijsper() {
        return prijsper;
    }

    public void setPrijsper(int prijsper) {
        this.prijsper = prijsper;
    }

    public double getBreedte_haspel() {
        return breedte_haspel;
    }

    public void setBreedte_haspel(double breedte_haspel) {
        this.breedte_haspel = breedte_haspel;
    }

    public double getDiameter_kern_haspel() {
        return diameter_kern_haspel;
    }

    public void setDiameter_kern_haspel(double diameter_kern_haspel) {
        this.diameter_kern_haspel = diameter_kern_haspel;
    }

    public double getDiameter_haspel() {
        return diameter_haspel;
    }

    public void setDiameter_haspel(double diameter_haspel) {
        this.diameter_haspel = diameter_haspel;
    }
}
