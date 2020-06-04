package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Connector {

    @Id
    private int artikelnummer;
    private String typenummer;
    private String connectortype;
    private String kabelgroep;
    private String merk;
    private String tulegroep;
    private double inkoopprijs;
    private int prijsper;
    private String configurator;
    private String assemblage;

    //constructor
    public Connector(){}

    public String getConfigurator() {
        return configurator;
    }

    public void setConfigurator(String configurator) {
        this.configurator = configurator;
    }

    public Connector(@JsonProperty("artikelnummer")int artikelnummer,
                     @JsonProperty("typenummer")String typenummer,
                     @JsonProperty("connectortype")String connectortype,
                     @JsonProperty("kabelgroep")String kabelgroep,
                     @JsonProperty("merk")String merk,
                     @JsonProperty("tulegroep")String tulegroep,
                     @JsonProperty("assemblage")String assemblage,
                     @JsonProperty("inkoopprijs")double inkoopprijs,
                     @JsonProperty("prijsper")int prijsper,
                     @JsonProperty("configurator")String configurator) {
        super();
        this.artikelnummer = artikelnummer;
        this.typenummer = typenummer;
        this.connectortype = connectortype;
        this.kabelgroep = kabelgroep;
        this.merk = merk;
        this.tulegroep = tulegroep;
        this.assemblage = assemblage;
        this.inkoopprijs = inkoopprijs;
        this.prijsper = prijsper;
        this.configurator = configurator;
    }

    //Methodes


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

    public String getConnectortype() {
        return connectortype;
    }

    public void setConnectortype(String connectortype) {
        this.connectortype = connectortype;
    }

    public String getKabelgroep() {
        return kabelgroep;
    }

    public void setKabelgroep(String kabelgroep) {
        this.kabelgroep = kabelgroep;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTulegroep() {
        return tulegroep;
    }

    public void setTulegroep(String tulegroep) {
        this.tulegroep = tulegroep;
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

    public String getAssemblage() {
        return assemblage;
    }

    public void setAssemblage(String assemblage) {
        this.assemblage = assemblage;
    }
}
