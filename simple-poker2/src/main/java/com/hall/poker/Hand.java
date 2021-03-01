package com.hall.poker;


import java.util.ArrayList;

public class Hand extends Deck {

    private ArrayList<Card> hand = new ArrayList<Card>(5);
    Deck deck = new Deck();

    public Hand() {

        for(int i = 0; i < 5; i++) {
            hand.add(deck.drawCard());
        }
    }
    public int getHandSize() {
        return hand.size();
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public String evaluate() {
        String result = "";
        boolean flush  = true;
        Card firstCard = hand.get(0);
        for (int i=1; i <5; i++){
            Card nextCard = hand.get(i);
            if(firstCard.getSuit() != nextCard.getSuit()) {
                flush = false;
            }
        }
        hand.sort((object1, object2) -> object1.getRank()-object2.getRank());
        int expectedRank = 10;
        boolean royal = true;
        for(Card h : hand) {
            if (h.getRank() != expectedRank) {
                royal = false;
            }
            expectedRank+=1;
        }

        boolean straight = true;


        if (flush && royal){
            result = "Royal Flush";
        }

        return result;
    }
}
