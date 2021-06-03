package com.ThreelineTest.RestApi.model;

public class HitCountDTO {

    boolean success;
    int start;
    int limit;
    int size;
    HitCountPayload payload;

    //constructor
    public HitCountDTO(boolean success, int start, int limit, int size, HitCountPayload payload) {
        this.success = success;
        this.start = start;
        this.limit = limit;
        this.size = size;
        this.payload = payload;
    }

    //getters and setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public HitCountPayload getPayload() {
        return payload;
    }

    public void setPayload(HitCountPayload payload) {
        this.payload = payload;
    }
}
