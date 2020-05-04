package com.hall.poker;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    ArrayList<Card> deck;
    Deck() {
        deck = new ArrayList<>();
        int counter = 0;
        for (int suit = 0; suit<4; suit++) {
            for (int rank = 0; rank<13; rank++) {
                Card temp = new Card(suit,rank);
                deck.add(temp);
            }
        }
    }

    public Deck shuffle(Deck deck) {
        Random r = new Random();
        int rand1, rand2;
        for (int i = 0; i < 1000; i++) {
            rand1 = r.nextInt(deck.deck.size()-1);
            rand2 = r.nextInt(deck.deck.size()-1);
            Card temp = deck.deck.get(rand1);
            deck.deck.set(rand1, deck.deck.get(rand2));
            deck.deck.set(rand2, temp);
        }
        return deck;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public Card drawFromDeck() {
        return deck.remove(0);
    }
}
