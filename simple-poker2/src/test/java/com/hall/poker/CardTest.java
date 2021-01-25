package com.hall.poker;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.CoreMatchers.hasItems;

import com.hall.poker.Card;

import java.util.ArrayList;
import java.util.List;

public class CardTest {


    @Test
    public void assertCardHasRank() {
        Card card = new Card(2);
        assertThat(card.getRank()).isNotNull();
    }
    @Test
    public void assertCardHasSuit() {
        //given
        Card card = new Card('H');

        //then
        assertThat(card.getSuit()).isNotNull();
    }

    @Test
    public void assertCardHasSuitAndRank() {
        //given
        Card card = new Card('H', 2);

        //then
        assertThat(card.getRank()).isNotNull();
        assertThat(card.getSuit()).isNotNull();
    }

    @Test
    public void assertCardRankIsValid() {
        //given
        Card card = new Card('A', 2);

        //then
        assertThat(card.getRank()).isBetween(2, 14);

    }

    @Test
    public void assertCardSuitIsValid() {
        //given
        Card card = new Card('H', 2);
        List<Character> suits = new ArrayList<Character>(4);
        suits.add('H');
        suits.add('S');
        suits.add('D');
        suits.add('C');
        //then
        assert(suits.contains(card.getSuit()));
    }
}
