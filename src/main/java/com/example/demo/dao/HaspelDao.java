package com.example.demo.dao;

import com.example.demo.model.Connector;
import com.example.demo.model.Haspel;

import java.util.List;

public interface HaspelDao {

    int addHaspel(Haspel haspel);

    List<Haspel> getHaspels();

}
