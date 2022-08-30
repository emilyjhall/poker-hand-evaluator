package com.hall.poker;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    ArrayList<Card> deck;
    Deck() {
        deck = new ArrayList<>();
        for (int suit = 0; suit<4; suit++) {
            for (int rank = 0; rank<13; rank++) {
                Card temp = new Card(suit,rank);
                deck.add(temp);
            }
        }
    }

    public Deck shuffle(Deck deck) {
        // Use the random library to set up random numbers
        Random r = new Random();
        int rand1, rand2;
        // Run this code 1000 times
        for (int i = 0; i < 1000; i++) {
            // Create 2 random numbers between 0 and 1 less than the size of the deck.
            // Call these random numbers "rand1" and "rand2"
            rand1 = r.nextInt(deck.deck.size()-1);
            rand2 = r.nextInt(deck.deck.size()-1);
            // Create a holding card called "temp" and set its value to the
            // card in position "rand1" in it
            Card temp = deck.deck.get(rand1);
            // Set the value of the card in position "rand1" to be the value of the
            // card in position "rand2"
            deck.deck.set(rand1, deck.deck.get(rand2));
            // Set the value of the card in position "rand2" to be the value of the
            // card in the holding card "temp"
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
