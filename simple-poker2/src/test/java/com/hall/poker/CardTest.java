package com.hall.poker;

import org.junit.Assert;
import org.junit.Test;

public class CardTest {
    @Test
    public void cardHasRankAndSuitAssigned() {
        Card testCard = new Card(1,6);
        Assert.assertEquals(6,testCard.getRank());
        Assert.assertEquals(1,testCard.getSuit());
    }

    @Test
    public void cardCanBePrintedInNiceFormat() {
        Card testCard = new Card(2,6);
        String testString = testCard.stringify(testCard);
        Assert.assertEquals("7 of Clubs", testString);
    }
}
