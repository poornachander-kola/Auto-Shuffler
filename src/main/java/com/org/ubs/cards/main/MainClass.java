package com.org.ubs.cards.main;

import java.util.Random;

import com.org.ubs.cards.model.CardsDeck;
import com.org.ubs.cards.service.CardServiceImpl;

public class MainClass {
	public static void main(String[] args) {
		CardServiceImpl cs = new CardServiceImpl();
		System.out.println(cs.getCardsDeck());
		cs.ShuffleCards(2);
		System.out.println(cs.getCardsDeck());
	}

}