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
        } else {
            return "None";
        }
    }

    private boolean royalFlush() {
        if (hand[0].getSuit() == hand[1].getSuit() && hand[0].getSuit() == hand[2].getSuit() && hand[0].getSuit() == hand[3].getSuit() && hand[0].getSuit() == hand[4].getSuit()) {
            if  (hand[0].getRank() == 0 && hand[1].getRank() == 9 && hand[2].getRank() == 10 && hand[3].getRank() == 11 && hand[4].getRank() == 12) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private boolean straight() {
        if (hand[4].getRank()-hand[3].getRank()==1 && hand[3].getRank()-hand[2].getRank()==1 && hand[2].getRank()-hand[1].getRank()==1 && hand[1].getRank()-hand[0].getRank()==1) {
            return true;
        } else {
            return false;
        }
    }

    private boolean flush() {
        if (hand[0].getSuit() == hand[1].getSuit() && hand[0].getSuit() == hand[2].getSuit() && hand[0].getSuit() == hand[3].getSuit() && hand[0].getSuit() == hand[4].getSuit()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean fourOfAKind() {
        if (hand[0].getRank() == hand[1].getRank() && hand[0].getRank() == hand[2].getRank() && hand[0].getRank() == hand[3].getRank() || hand[4].getRank() == hand[1].getRank() && hand[4].getRank() == hand[2].getRank() && hand[4].getRank() == hand[3].getRank()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean threeOfAKind() {
        if (hand[0].getRank() == hand[1].getRank() && hand[0].getRank() == hand[2].getRank() && hand[0].getRank() != hand[3].getRank() && hand[0].getRank() != hand[4].getRank() || hand[1].getRank() == hand[2].getRank() && hand[1].getRank() == hand[3].getRank() && hand[1].getRank() != hand[0].getRank() && hand[1].getRank() != hand[4].getRank() || hand[4].getRank() == hand[2].getRank() && hand[4].getRank() == hand[3].getRank() && hand[4].getRank() != hand[0].getRank() && hand[4].getRank() != hand[1].getRank()) {
            return true;
        } else {
            return false;
        }
    }
}
