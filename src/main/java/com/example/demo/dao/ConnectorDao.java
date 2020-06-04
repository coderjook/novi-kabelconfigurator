package com.example.demo.dao;

import com.example.demo.model.Connector;

import java.util.List;
import java.util.UUID;

public interface ConnectorDao {

    int addConnector(Connector connector);

    List<Connector> getConnectors();

    int deleteConnectorByArtikelnummer(int artikelnummer);

    int updateConnectorByArtikelnummer(Connector connector);

}
