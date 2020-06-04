package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kabel {

    @Id
    private int artikelnummer;
    private String typenummer;
    private String merk;
    private String kleur;
    private String configurator;
    private String kabelgroep;
    private double inkoopprijs;
    private int prijsper;
    private double diameter_buitenmantel;
    private int opmaak_aantal;
    private boolean haspelgeschikt;

    public Kabel() {}

    public Kabel(@JsonProperty("artikelnummer")int artikelnummer,
                 @JsonProperty("typenummer")String typenummer,
                 @JsonProperty("merk")String merk,
                 @JsonProperty("kleur")String kleur,
                 @JsonProperty("configurator")String configurator,
                 @JsonProperty("kabelgroep")String kabelgroep,
                 @JsonProperty("inkoopprijs")double inkoopprijs,
                 @JsonProperty("prijsper")int prijsper,
                 @JsonProperty("diameter_buitenmantel")double diameter_buitenmantel,
                 @JsonProperty("opmaak_aantal")int opmaak_aantal,
                 @JsonProperty("haspelgeschikt")boolean haspelgeschikt) {
        this.artikelnummer = artikelnummer;
        this.typenummer = typenummer;
        this.merk = merk;
        this.kleur = kleur;
        this.configurator = configurator;
        this.kabelgroep = kabelgroep;
        this.inkoopprijs = inkoopprijs;
        this.prijsper = prijsper;
        this.diameter_buitenmantel = diameter_buitenmantel;
        this.opmaak_aantal = opmaak_aantal;
        this.haspelgeschikt = haspelgeschikt;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(int artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public String getTypenummer() {
        return typenummer;
    }

    public void setTypenummer(String typenummer) {
        this.typenummer = typenummer;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public String getConfigurator() {
        return configurator;
    }

    public void setConfigurator(String configurator) {
        this.configurator = configurator;
    }

    public String getKabelgroep() {
        return kabelgroep;
    }

    public void setKabelgroep(String kabelgroep) {
        this.kabelgroep = kabelgroep;
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

    public double getDiameter_buitenmantel() {
        return diameter_buitenmantel;
    }

    public void setDiameter_buitenmantel(double diameter_buitenmantel) {
        this.diameter_buitenmantel = diameter_buitenmantel;
    }

    public int getOpmaak_aantal() {
        return opmaak_aantal;
    }

    public void setOpmaak_aantal(int opmaak_aantal) {
        this.opmaak_aantal = opmaak_aantal;
    }

    public boolean isHaspelgeschikt() {
        return haspelgeschikt;
    }

    public void setHaspelgeschikt(boolean haspelgeschikt) {
        this.haspelgeschikt = haspelgeschikt;
    }
}
