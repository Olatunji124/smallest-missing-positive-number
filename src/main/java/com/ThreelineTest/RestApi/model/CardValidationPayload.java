package com.ThreelineTest.RestApi.model;

public class CardValidationPayload {

    //declare variables
    String scheme;
    String type;
    String bank;

    //getters and setters
    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
