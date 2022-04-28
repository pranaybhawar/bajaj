package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Data implements Serializable {

    @JsonProperty(value = "data")
    private String[] data;

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
}
