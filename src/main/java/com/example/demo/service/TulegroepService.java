package com.example.demo.service;

import com.example.demo.dao.TulegroepDao;
import com.example.demo.model.Tulegroep;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TulegroepService {

    private final TulegroepDao tulegroepDao;

    public TulegroepService(TulegroepDao tulegroepDao) {
        this.tulegroepDao = tulegroepDao;
    }

    public int addTulegroep(@Qualifier("kabelconfigurator")Tulegroep tulegroep) {
        return tulegroepDao.addTulegroep(tulegroep);
    }

    public List<Tulegroep> getTulegroep() {
        return tulegroepDao.getTulegroep();
    }
}
