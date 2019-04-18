package com.zipcodewilmington.bakery.models;

public class Suit {
    String faceValue;

    public Suit() {
    }

    public Suit(String faceValue) {
        this.faceValue = faceValue;
    }

    public String getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(String faceValue) {
        this.faceValue = faceValue;
    }
}
