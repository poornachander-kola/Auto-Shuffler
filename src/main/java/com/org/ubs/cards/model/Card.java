package com.org.ubs.cards.model;

public class Card {
	private Integer cardNumber;
	private String cardShape;
	
	private Card(){
		//To call only parameter base constructor
	}

	public Card(Integer cardNumber, String cardShape) {
		super();
		this.cardNumber = cardNumber;
		this.cardShape = cardShape;
	}

	public Integer getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardShape() {
		return cardShape;
	}

	public void setCardShape(String cardShape) {
		this.cardShape = cardShape;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + ((cardShape == null) ? 0 : cardShape.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		if (cardShape == null) {
			if (other.cardShape != null)
				return false;
		} else if (!cardShape.equals(other.cardShape))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Card [cardNumber=" + cardNumber + ", cardShape=" + cardShape + "]";
	}
}