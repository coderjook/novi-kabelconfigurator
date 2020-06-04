package com.example.demo.service;

import com.example.demo.dao.ConnectorDao;
import com.example.demo.model.Connector;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectorService {

    private final ConnectorDao connectorDao;

    public ConnectorService(@Qualifier("kabelconfigurator")ConnectorDao connectorDao) {
        this.connectorDao = connectorDao;
    }

    // methods
    public int AddConnector(Connector connector) {return connectorDao.addConnector(connector); }

    public List<Connector> getConnectors(){
        return connectorDao.getConnectors();
    }

    //public int deleteKabel(UUID id) {  return kabelDao.deleteKabelById(id);    }

    //public int updateKabel(Product productToUpdate) {  return kabelDao.updateKabelById(productToUpdate);
}
