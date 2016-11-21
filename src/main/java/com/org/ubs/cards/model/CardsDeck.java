package com.org.ubs.cards.model;

import java.util.Arrays;

import com.org.ubs.cards.constants.CardsConstants;

/**
 * @author Poorna Chander
 *
 */
public class CardsDeck {
    private Card[] deck;
    
    public CardsDeck(){
    	deck = new Card[CardsConstants.NUMBER_OF_CARDS_IN_DECK]; //creating an array of 52 cards
    	int cardCounter=0;
    	
    	for(int i=1 ; i<=CardsConstants.NUMBER_OF_CARDS; i++){
    		deck[cardCounter++]=new Card(i, CardsConstants.CARD_SHAPE_CLUB);
    		deck[cardCounter++]=new Card(i, CardsConstants.CARD_SHAPE_DIAMOND);
    		deck[cardCounter++]=new Card(i, CardsConstants.CARD_SHAPE_SPADE);
    		deck[cardCounter++]=new Card(i, CardsConstants.CARD_SHAPE_HEART);
    	}
    }

	public Card[] getDeck() {
		return deck;
	}

	@Override
	public String toString() {
		return "CardsDeck [cardDeck=" + Arrays.toString(deck) + "]";
	}
    
}