package com.hall.poker;


import java.util.HashSet;

public class Deck {
    private HashSet<Card> deck = new HashSet<Card>(52);

    public Deck() {
        for (int i = 0; i < 52; i++) {
            deck.add(new Card('H', 2));
        }
    }

    public int getDeckSize() {
        return deck.size();
    }

}
