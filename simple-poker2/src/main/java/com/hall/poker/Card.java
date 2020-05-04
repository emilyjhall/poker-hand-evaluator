package com.hall.poker;

public class Card implements Comparable<Card> {
    private int suit;
    private int rank;

    private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};

    Card(int suit,int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int compareTo(Card o)
    {
        if (this.rank == (o.rank))
            return 0;
        else if ((this.rank) > (o.rank))
            return 1;
        else
            return -1;
    }

    public String stringify(Card card) {
        return ranks[card.rank] + " of " + suits[card.suit];
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }
}
