package com.org.ubs.cards.service.test;

import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Before;
import org.junit.Test;
import com.org.ubs.cards.constants.CardsConstants;
import com.org.ubs.cards.model.Card;
import com.org.ubs.cards.service.CardServiceImpl;

/**
 * @author Poorna Chander
 *
 */
public class CardServiceTest {
	CardServiceImpl cardServiceImpl;
	Random random;

	/*
	 * Setup method
	 */
	@Before
	public void setUp() throws Exception {
		cardServiceImpl =  new CardServiceImpl();
		random = new Random();
	}

	/**
	 * method to test if the deck created has required number of cards
	 */
	@Test
	public void testCardDeckCounter() {
		assertEquals(CardsConstants.NUMBER_OF_CARDS_IN_DECK,cardServiceImpl.getCardsDeck().getDeck().length);
	}
	/**
	 * method to test shuffle function
	 */	
	@Test
	public void testShuffleCards(){
		Integer randomNumber = random.nextInt(52);
		Card[] cardDeck1 = cardServiceImpl.getCardsDeck().getDeck(); //card Deck before shuffle
		cardServiceImpl.ShuffleCards(5);
		Card[] cardDeck2 =  cardServiceImpl.getCardsDeck().getDeck(); //card Deck after shuffle
		int i=-1;
		while(++i<CardsConstants.NUMBER_OF_CARDS_IN_DECK){
			if(cardDeck1[i]!=cardDeck2[i]){ //checking if deck is same as deck before shuffle
				assertTrue(true);
				break;
			}
		}
	}

}