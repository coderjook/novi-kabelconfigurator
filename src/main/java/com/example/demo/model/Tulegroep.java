package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tulegroep {

    @Id
    private int artikelnummer;
    private String merk;
    private String typenummer;
    private String kleur;
    private String configurator;
    private double assemblagekosten;
    private String tulegroep;

    public Tulegroep() {}

    public Tulegroep(@JsonProperty("artikelnummer")int artikelnummer,
                     @JsonProperty("typenummer")String typenummer,
                     @JsonProperty("merk")String merk,
                     @JsonProperty("kleur")String kleur,
                     @JsonProperty("configurator")String configurator,
                     @JsonProperty("assemblagekosten")double assemblagekosten,
                     @JsonProperty("tulegroep")String tulegroep) {
        this.artikelnummer = artikelnummer;
        this.merk = merk;
        this.typenummer = typenummer;
        this.configurator = configurator;
        this.assemblagekosten = assemblagekosten;
        this.tulegroep = tulegroep;
    }

    // getter and setter methoden

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
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

    public double getAssemblagekosten() {
        return assemblagekosten;
    }

    public void setAssemblagekosten(double assemblagekosten) {
        this.assemblagekosten = assemblagekosten;
    }

    public String getTulegroep() {
        return tulegroep;
    }

    public void setTulegroep(String tulegroep) {
        this.tulegroep = tulegroep;
    }
}
