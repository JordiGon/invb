package com.invbv.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.inter.InventoryResponseDao;
import com.invbv.demo.repository.SuministroResponseRepository;
import com.invbv.demo.response.SuministroResponse;

@Service
public class InventoryResponseDaoImpl implements InventoryResponseDao {

    @Autowired
    SuministroResponseRepository repository;

    @Override
    public List<SuministroResponse> findInventory() {
        return repository.findInventory();
    }

}
