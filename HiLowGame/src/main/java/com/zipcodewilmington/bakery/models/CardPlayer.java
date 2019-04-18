package com.zipcodewilmington.bakery.models;

public class CardPlayer {
    //Hand hand;
    Account account;
    String name;

    public CardPlayer() {
    }

    public CardPlayer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
