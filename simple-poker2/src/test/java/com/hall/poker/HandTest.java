package com.hall.poker;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

import java.util.ArrayList;

public class HandTest {

    @Test
    public void testThatTheSizeOfHandIsFive() {
        //given
        Hand hand = new Hand();
        //then
        assertThat(hand.getHandSize()).isEqualTo(5);
    }

    @Test
    public void testThatTheHandsContainsRoyalFlush () {
        //given
        Hand hand  = new Hand();
        //then
        ArrayList<Card> royalFlush = new ArrayList<>();
        royalFlush.add(new Card('S', 14));
        royalFlush.add(new Card('S', 13));
        royalFlush.add(new Card('S', 12));
        royalFlush.add(new Card('S', 11));
        royalFlush.add(new Card('S', 10));
        hand.setHand(royalFlush);
        assertThat(hand.evaluate()).isEqualTo("Royal Flush");
    }

    @Test
    public void testThatTheHandsContainsStraightFlush () {
        //given
        Hand hand  = new Hand();
        //then
        ArrayList<Card> straightFlush = new ArrayList<>();
        straightFlush.add(new Card('S', 10));
        straightFlush.add(new Card('S', 9));
        straightFlush.add(new Card('S', 8));
        straightFlush.add(new Card('S', 7));
        straightFlush.add(new Card('S', 6));
        hand.setHand(straightFlush);
        assertThat(hand.evaluate()).isEqualTo("Straight Flush");
    }
}
