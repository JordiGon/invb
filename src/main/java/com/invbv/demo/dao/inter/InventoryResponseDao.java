package com.invbv.demo.dao.inter;

import java.util.List;

import com.invbv.demo.response.SuministroResponse;

public interface InventoryResponseDao {
    public List<SuministroResponse> findInventory();
}
