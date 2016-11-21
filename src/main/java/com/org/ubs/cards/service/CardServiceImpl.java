package com.org.ubs.cards.service;

import java.util.Random;

import com.org.ubs.cards.constants.CardsConstants;
import com.org.ubs.cards.model.Card;
import com.org.ubs.cards.model.CardsDeck;

/**
 * @author Poorna Chander
 *
 */
public class CardServiceImpl implements CardService{

	private CardsDeck cardsDeck;
	Random random;
	
	public CardServiceImpl() {
		cardsDeck = new CardsDeck();
		random = new Random();
	}
	
	public CardsDeck getCardsDeck() {
		return cardsDeck;
	}

	public void setCardsDeck(CardsDeck cardsDeck) {
		this.cardsDeck = cardsDeck;
	}
	/*
	 * (non-Javadoc)
	 * @see com.org.ubs.cards.service.CardService#ShuffleCards(int)
	 * Method to shuffle cards
	 * input - number of times cards to be shuffled
	 */
	public void ShuffleCards(int shuffleTimes) {
		int randomInt1;
		int randomInt2;
		Card card;
	    Card[] cardDeck = this.cardsDeck.getDeck();
	    int j=0;
	    while(j++<shuffleTimes){
	    	for(int i=0 ;i<CardsConstants.NUMBER_OF_CARDS_IN_DECK;i++){
	    		randomInt1 = random.nextInt(CardsConstants.NUMBER_OF_CARDS_IN_DECK);//generates random number in the rang of 1 to 52
	    		randomInt2 = random.nextInt(CardsConstants.NUMBER_OF_CARDS_IN_DECK);
	    		card = cardDeck[randomInt1];		//gets cards from two random positions and swaps them for 52 times
	    		cardDeck[randomInt1] = cardDeck[randomInt2];
	    		cardDeck[randomInt2] = card;
	    	}
	    }
	}
	

}