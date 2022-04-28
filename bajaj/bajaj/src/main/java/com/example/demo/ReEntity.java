package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReEntity implements Serializable {

    @JsonProperty(value = "is_success")
    private boolean status;

    @JsonProperty(value = "user_id")
    private String userId;

    @JsonProperty(value = "email")
    private String emailId;

    @JsonProperty(value = "roll_number")
    private String rollNum;

    @JsonProperty(value = "numbers")
    private String[] numArray;

    @JsonProperty(value = "alphabets")
    private String[] alphabetArray;

    public ReEntity() {
    }

    public ReEntity(boolean status, String userId, String emailId, String rollNum, String[] numArray, String[] alphabetArray) {
        this.status = status;
        this.userId = userId;
        this.emailId = emailId;
        this.rollNum = rollNum;
        this.numArray = numArray;
        this.alphabetArray = alphabetArray;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }

    public String[] getNumArray() {
        return numArray;
    }

    public void setNumArray(String[] numArray) {
        this.numArray = numArray;
    }

    public String[] getAlphabetArray() {
        return alphabetArray;
    }

    public void setAlphabetArray(String[] alphabetArray) {
        this.alphabetArray = alphabetArray;
    }
}
