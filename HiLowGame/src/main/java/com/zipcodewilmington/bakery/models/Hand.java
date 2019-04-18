package com.zipcodewilmington.bakery.models;

import java.util.List;

public class Hand {

    List<Card> cardList;

    public Hand() {
    }

    public Hand(List<Card> cardList) {
        this.cardList = cardList;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }
}
