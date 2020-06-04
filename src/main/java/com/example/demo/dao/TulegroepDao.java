package com.example.demo.dao;

import com.example.demo.model.Tulegroep;

import java.util.List;


public interface TulegroepDao {

    int addTulegroep(Tulegroep tulegroep);

    List<Tulegroep> getTulegroep();


}


