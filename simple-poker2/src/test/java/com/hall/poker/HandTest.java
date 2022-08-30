package com.hall.poker;

import org.junit.Assert;
import org.junit.Test;

public class HandTest {
//    @Test
//    public void testFiveCardsInHand() {
//        Deck testDeck = new Deck();
//        Deck shuffledDeck = testDeck.shuffle(testDeck);
//        Hand testHand = new Hand(shuffledDeck);
//
//        Assert.assertEquals(5, testHand.getHand().length);
//    }

    @Test
    public void testRoyalFlushCorrect() {
        Deck testDeck = new Deck();

        Card card1 = new Card(0,0);
        Card card2 = new Card(0,0);
        Card card3 = new Card(0,0);
        Card card4 = new Card(0,0);
        Card card5 = new Card(0,0);

        testDeck.deck.add(0,card1);
        testDeck.deck.add(1,card2);
        testDeck.deck.add(2,card3);
        testDeck.deck.add(3,card4);
        testDeck.deck.add(4,card5);

        Hand testHand = new Hand(testDeck);

        Assert.assertEquals("Royal Flush",testHand.evaluate());
    }

    @Test
    public void testStraightFlushCorrect() {
        Deck testDeck = new Deck();

        Card card1 = new Card(0,0);
        Card card2 = new Card(0,0);
        Card card3 = new Card(0,0);
        Card card4 = new Card(0,0);
        Card card5 = new Card(0,0);

        testDeck.deck.add(0,card1);
        testDeck.deck.add(1,card2);
        testDeck.deck.add(2,card3);
        testDeck.deck.add(3,card4);
        testDeck.deck.add(4,card5);

        Hand testHand = new Hand(testDeck);

        Assert.assertEquals("Straight Flush",testHand.evaluate());
    }

    @Test
    public void testStraightCorrect() {
        Deck testDeck = new Deck();

        Card card1 = new Card(0,0);
        Card card2 = new Card(0,0);
        Card card3 = new Card(0,0);
        Card card4 = new Card(0,0);
        Card card5 = new Card(0,0);

        testDeck.deck.add(0,card1);
        testDeck.deck.add(1,card2);
        testDeck.deck.add(2,card3);
        testDeck.deck.add(3,card4);
        testDeck.deck.add(4,card5);

        Hand testHand = new Hand(testDeck);

        Assert.assertEquals("Straight",testHand.evaluate());
    }

    @Test
    public void testFlushCorrect() {
        Deck testDeck = new Deck();

        Card card1 = new Card(0,0);
        Card card2 = new Card(0,0);
        Card card3 = new Card(0,0);
        Card card4 = new Card(0,0);
        Card card5 = new Card(0,0);

        testDeck.deck.add(0,card1);
        testDeck.deck.add(1,card2);
        testDeck.deck.add(2,card3);
        testDeck.deck.add(3,card4);
        testDeck.deck.add(4,card5);

        Hand testHand = new Hand(testDeck);

        Assert.assertEquals("Flush",testHand.evaluate());
    }

    @Test
    public void testFourOfAKindCorrect() {
        Deck testDeck = new Deck();

        Card card1 = new Card(0,0);
        Card card2 = new Card(0,0);
        Card card3 = new Card(0,0);
        Card card4 = new Card(0,0);
        Card card5 = new Card(0,0);

        testDeck.deck.add(0,card1);
        testDeck.deck.add(1,card2);
        testDeck.deck.add(2,card3);
        testDeck.deck.add(3,card4);
        testDeck.deck.add(4,card5);

        Hand testHand = new Hand(testDeck);

        Assert.assertEquals("Four of a Kind",testHand.evaluate());
    }

    @Test
    public void testThreeOfAKindCorrect() {
        Deck testDeck = new Deck();

        Card card1 = new Card(0,0);
        Card card2 = new Card(0,0);
        Card card3 = new Card(0,0);
        Card card4 = new Card(0,0);
        Card card5 = new Card(0,0);

        testDeck.deck.add(0,card1);
        testDeck.deck.add(1,card2);
        testDeck.deck.add(2,card3);
        testDeck.deck.add(3,card4);
        testDeck.deck.add(4,card5);

        Hand testHand = new Hand(testDeck);

//        for (int i = 0; i < 5; i++) {
//            System.out.println(testHand.hand[i].stringify(testHand.hand[i]));
//        }

        Assert.assertEquals("Three of a Kind",testHand.evaluate());
    }

    @Test
    public void twoPairCorrect() {
        Deck testDeck = new Deck();

        Card card1 = new Card(0,0);
        Card card2 = new Card(0,0);
        Card card3 = new Card(0,0);
        Card card4 = new Card(0,0);
        Card card5 = new Card(0,0);

        testDeck.deck.add(0,card1);
        testDeck.deck.add(1,card2);
        testDeck.deck.add(2,card3);
        testDeck.deck.add(3,card4);
        testDeck.deck.add(4,card5);

        Hand testHand = new Hand(testDeck);

//        for (int i = 0; i < 5; i++) {
//            System.out.println(testHand.hand[i].stringify(testHand.hand[i]));
//        }

        Assert.assertEquals("Two Pair",testHand.evaluate());
    }
}
