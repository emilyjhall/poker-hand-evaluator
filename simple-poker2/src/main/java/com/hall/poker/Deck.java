package com.hall.poker;

import java.util.ArrayList;
import java.util.HashSet;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>(52);
    private ArrayList<Character> suits = new ArrayList<Character>(4);

    public Deck() {
        suits.add('H');
        suits.add('D');
        suits.add('C');
        suits.add('S');

        for(int rank = 2; rank < 15; rank++){
            for(Character s : suits){
                deck.add(new Card(s,rank ));
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public int getDeckSize() {
        return deck.size();
    }

    public Card drawCard() {
        return deck.remove(0);
    }

    public Deck shuffleDeck(Deck deck){
        for(int card = 0; card < getDeckSize(); card++) {
            int random = (int) (Math.random() * card);
            Card swap = deck.deck.get(card);
            Card replaced = deck.deck.get(random);
            deck.deck.set(random, swap);
            deck.deck.set(card, replaced);
        }
        return deck;
    }
}
