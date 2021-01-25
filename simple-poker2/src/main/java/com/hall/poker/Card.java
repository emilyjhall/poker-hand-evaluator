package com.hall.poker;

public class Card {
    private int rank;
    private char suit;

    public Card(int rank) {
        this.rank = rank;
    }

    public Card(char suit, int rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card(char suit) {
        this.suit = suit;
    }

    public char getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
