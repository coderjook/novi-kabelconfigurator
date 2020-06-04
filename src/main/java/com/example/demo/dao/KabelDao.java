package com.example.demo.dao;

import com.example.demo.model.Connector;
import com.example.demo.model.Kabel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface KabelDao {

    int addKabel(Kabel kabel);

    List<Kabel> getKabels();

    int deleteKabelByArtikelnummer(int artikelnummer);

    int updateInkoopprijsKabelByArtikelnummer(Kabel kabel);

}


