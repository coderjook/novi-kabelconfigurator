package com.example.demo.service;

import com.example.demo.dao.KabelDao;
import com.example.demo.model.Kabel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class KabelService {
    private final KabelDao kabelDao;

    //constructor

    public KabelService(KabelDao kabelDao) {
        this.kabelDao = kabelDao;
    }

    // methods
    public int AddKabel(@Qualifier("kabelconfigurator") Kabel kabel) {return kabelDao.addKabel(kabel); }

    public List<Kabel> getKabels(){
        return kabelDao.getKabels();
    }

    public int deleteKabel(int artikelnummer) {  return kabelDao.deleteKabelByArtikelnummer(artikelnummer);    }

    public int updateInkoopprijsKabel(Kabel kabel) {
        return kabelDao.updateInkoopprijsKabelByArtikelnummer(kabel);
    }

}
