package com.example.demo.dao;

import com.example.demo.model.Assemblie;
import com.example.demo.model.Kabel;
import com.example.demo.model.Product;

import java.util.List;
import java.util.UUID;


public interface AssemblieDao {

    int addAssemblie( UUID id_assemblie, Assemblie assemblie);

    default int addAssemblie(Assemblie assemblie) {
        UUID id_assemblie = UUID.randomUUID();
        return addAssemblie(id_assemblie, assemblie);
    }



    List<Assemblie> getAssemblies();

    int deleteAssemblieByIdAssemblie(UUID id_assemblie);

    int updateKabelByIdAssemblie(Assemblie assemblie);

    int updateHaspelByIdAssemblie(Assemblie assemblie);

    int updateConnectorAByIdAssemblie(Assemblie assemblie);

    int updateConnectorBByIdAssemblie(Assemblie assemblie);

    int updateAfwerkingByIdAssemblie(Assemblie assemblie);
}
