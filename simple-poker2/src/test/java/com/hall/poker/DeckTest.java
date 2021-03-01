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
        boolean cardIsUnique = true;
        for (int rank = 2; rank < 15; rank++){
            for (Character c : suits){
                Card cardToCheck = deck.drawCard();
                if(cardToCheck.getSuit() == c && cardToCheck.getRank() == rank) {
                    continue;
                } else {
                    cardIsUnique = false;
                }
            }
        }
        assertThat(cardIsUnique).isTrue();
    }

    @Test
    public void CheckDeckHasBeenShuffled() {
        Deck beforeShuffle = new Deck();
        Deck afterShuffle = beforeShuffle.shuffleDeck(beforeShuffle);
        boolean isShuffled = false;

        for (int card = 0; card < beforeShuffle.getDeckSize(); card++ ) {
            if (beforeShuffle.drawCard().getRank() != afterShuffle.drawCard().getRank() || beforeShuffle.drawCard().getSuit() != afterShuffle.drawCard().getSuit() ) {
                isShuffled = true;
                break;
            }
        }

        assertThat(isShuffled).isTrue();
    }
}
