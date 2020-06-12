package com.example.demo.service;

import com.example.demo.dao.AssemblieDao;
import com.example.demo.model.Assemblie;
import com.example.demo.model.Connector;
import com.example.demo.model.Kabel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Service
public class AssemblieService {

    private final AssemblieDao assemblieDao;

    public AssemblieService(AssemblieDao assemblieDao) {
        this.assemblieDao = assemblieDao;
    }

    // methods
    public int AddAssemblie(@Qualifier("kabelconfiguratorassemblie") Assemblie assemblie) {
        return assemblieDao.addAssemblie(assemblie);
    }
    @Qualifier("kabelconfiguratorassemblie")
    public List<Assemblie> getAssemblies(){
        return assemblieDao.getAssemblies();
    }

    public int deleteAssemblie(UUID id_assemblie) {  return assemblieDao.deleteAssemblieByArtikelnummer(id_assemblie);    }

    public int updateKabelAssemblie(Assemblie assemblie) {
        return assemblieDao.updateKabelByIdAssemblie(assemblie);
    }

    public int updateHaspelAssemblie(Assemblie assemblie){
        return assemblieDao.updateHaspelByIdAssemblie(assemblie);
    }

    public int updateConnectorAAssemblie(Assemblie assemblie){
        return assemblieDao.updateConnectorAByIdAssemblie(assemblie);
    }

    public int updateConnectorBAssemblie(Assemblie assemblie){
        return assemblieDao.updateConnectorBByIdAssemblie(assemblie);
    }

    public int updateAfwerkingAssemblie(Assemblie assemblie){
        return assemblieDao.updateAfwerkingByIdAssemblie(assemblie);
    }
}
