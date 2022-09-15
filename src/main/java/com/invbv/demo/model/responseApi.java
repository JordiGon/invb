package com.invbv.demo.model;

import java.io.Serializable;

public class responseApi<E> implements Serializable {

    private int statusCode;
    private String message;
    private E body;

    public responseApi(int statusCode, String message, E body) {
        this.statusCode = statusCode;
        this.message = message;
        this.body = body;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getBody() {
        return body;
    }

    public void setBody(E body) {
        this.body = body;
    }

}