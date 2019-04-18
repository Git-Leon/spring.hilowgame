package com.zipcodewilmington.bakery.models;

import com.zipcodewilmington.bakery.models.cardgames.utils.Deck;

import java.util.List;

public class HighLowGame {
    Long id;
    Deck deck;
    List<HighLowGame> playerList;

    public HighLowGame() {
    }

    public HighLowGame(Long id, Deck deck, List<HighLowGame> playerList) {
        this.id = id;
        this.deck = deck;
        this.playerList = playerList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public List<HighLowGame> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<HighLowGame> playerList) {
        this.playerList = playerList;
    }

    public HighLowPlayer findById(Long accountId) {
        return null;
    }
}
