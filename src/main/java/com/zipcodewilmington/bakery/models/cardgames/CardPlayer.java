package com.zipcodewilmington.bakery.models.cardgames;


import com.zipcodewilmington.bakery.models.Account;
import com.zipcodewilmington.bakery.models.cardgames.utils.Hand;

import javax.persistence.*;

@MappedSuperclass
public class CardPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hand_id")
    Hand hand;

    @OneToOne
    Account account;

    public CardPlayer() {
    }

    public CardPlayer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
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
