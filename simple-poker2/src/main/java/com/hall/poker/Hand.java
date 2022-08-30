package com.hall.poker;

import java.util.Arrays;

public class Hand {

    Card[] hand;
    Hand(Deck deck) {
        hand = new Card[5];
        for (int i = 0; i < 5; i++) {
            hand[i] = deck.drawFromDeck();
        }
        Arrays.sort(hand);
    }

    public Card[] getHand() {
        return hand;
    }

    public String evaluate() {
        if (this.royalFlush() == true) {
            return "Royal Flush";
        } else if (this.royalFlush() == false && this.flush() == true && this.straight() == true) {
            return "Straight Flush";
        } else if (this.royalFlush() == false && this.flush() == false && this.straight() == true) {
            return "Straight";
        } else if (this.royalFlush() == false && this.flush() == true && this.straight() == false) {
            return "Flush";
        } else if (this.fourOfAKind() == true) {
            return "Four of a Kind";
        } else if (this.threeOfAKind() == true) {
            return "Three of a Kind";
        } else if (this.twoPair() == true) {
            return "Two Pair";
        } else {
            return "High Card";
        }
    }

    private boolean royalFlush() {
        // suits
        if (false) {
            // ranks
            if  (false) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private boolean straight() {
        if (false) {
            return true;
        } else {
            return false;
        }
    }

    private boolean flush() {
        if (false) {
            return true;
        } else {
            return false;
        }
    }

    private boolean fourOfAKind() {
        if (false) {
            return true;
        } else {
            return false;
        }
    }

    private boolean threeOfAKind() {
        if (false) {
            return true;
        } else {
            return false;
        }
    }

    private boolean twoPair() {
        if (false) {
            return true;
        } else {
            return false;
        }
    }
}
