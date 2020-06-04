package com.example.demo.service;

import com.example.demo.dao.HaspelDao;
import com.example.demo.model.Haspel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HaspelService {

    private final HaspelDao haspelDao;

    public HaspelService(HaspelDao haspelDao) {
        this.haspelDao = haspelDao;
    }

    public int AddHaspel(@Qualifier("kabelconfigurator")Haspel haspel) {
        return haspelDao.addHaspel(haspel);
    }

    public List<Haspel> getHaspels(){
        return haspelDao.getHaspels();
    }
}
