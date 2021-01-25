package com.hall.poker;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

import java.util.ArrayList;

public class DeckTest {

    @Test
    public void numberOfCardsInDeckIs52() {
        //given
        Deck deck = new Deck();

        //then
        assertThat(deck.getDeckSize()).isEqualTo(52);
    }

    @Test
    public void eachCardInTheDeckIsUnique() {
        //given
        Deck deck  = new Deck();
        ArrayList<Character> suits = new ArrayList<Character>(4);
        suits.add('H');
        suits.add('D');
        suits.add('C');
        suits.add('S');

        //then
        for (int rank = 2; rank < 15; rank++){
            for (Character c : suits){
                Card cardToCheck = deck.getCard();
                if(cardToCheck.getSuit() == c && cardToCheck.getRank() == rank) {

                }
            }
        }
        assertThat(deck.getSuitSize());
    }

}
