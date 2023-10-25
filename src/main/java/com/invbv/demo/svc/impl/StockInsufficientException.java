package com.invbv.demo.svc.impl;

public class StockInsufficientException extends Exception{

    public StockInsufficientException(String message) {
        super(message);
    }
}
