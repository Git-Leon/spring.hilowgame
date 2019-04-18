package com.zipcodewilmington.bakery.models.cardgames.utils;


import javax.persistence.*;
import java.util.List;

@Entity
public class Hand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hand_id")
    Long id;

    @OneToMany
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
