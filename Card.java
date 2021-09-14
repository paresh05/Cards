package com.bridgelabzcards;

/**
 * @author paresh.praveen_ymedi
 *
 */

/**
 * This class is used to define the Card
 * 
 * @member suits is used to define the suits
 * @member ranks is used to define the ranks
 */

public class Card {
	
	public String suits;
	
	public String ranks;
	
	public Card(String ranks,String suits)
	{
		this.ranks = ranks;
		this.suits = suits;
	}
	
	 //toString method to display the card
	@Override
	public String toString() {
		return "Card [suits=" + suits + ", ranks=" + ranks + "]";
	}

}
