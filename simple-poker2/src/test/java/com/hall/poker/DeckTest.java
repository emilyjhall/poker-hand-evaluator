package com.hall.poker;

import org.junit.Assert;
import org.junit.Test;

public class DeckTest {
    @Test
    public void oneOfEachCardInDeck() {
        Deck testDeck = new Deck();
        Card temp;

        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                temp = testDeck.drawFromDeck();
                Assert.assertEquals(rank,temp.getRank());
                Assert.assertEquals(suit,temp.getSuit());
            }
        }
    }
}
