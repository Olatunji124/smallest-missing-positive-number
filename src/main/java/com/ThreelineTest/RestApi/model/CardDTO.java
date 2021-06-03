package com.ThreelineTest.RestApi.model;

public class CardDTO {

    boolean success;
    CardValidationPayload payload;

    //constructor
    public CardDTO(boolean success, CardValidationPayload payload) {
        this.success = success;
        this.payload = payload;
    }

    //getters and setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public CardValidationPayload getPayload() {
        return payload;
    }

    public void setPayload(CardValidationPayload payload) {
        this.payload = payload;
    }
}
