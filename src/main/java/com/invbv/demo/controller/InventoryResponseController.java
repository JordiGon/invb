package com.invbv.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invbv.demo.model.responseApi;
import com.invbv.demo.response.SuministroResponse;
import com.invbv.demo.svc.inter.InventoryResponseSvc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/inventory")
public class InventoryResponseController {
    @Autowired
    private InventoryResponseSvc inventoryResponseSvc;

    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi getInventory() {
        return inventoryResponseSvc.findInventory();
    }

}
