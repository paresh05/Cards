package com.bridgelabzcards;

/**
 * @author paresh.praveen_ymedi
 *
 */

/**
 * This class is used to define the deck of cards
 * 
 * @param suits defines the suits
 * @param ranks defines the ranks
 * @param deck  its a integer array of deck
 */

public class Cards {

	private static String[] cards = new String[52];

	private static String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };

	private static String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

	/**
	 * This method is used to initialize all the deck of cards
	 * 
	 * @return nothing
	 */
	public static void initializeCards() 
	{
		int i = 0;
		int j = 0;
		for (int k = 0; k < cards.length; k++) 
		{
			cards[k] = ranks[i] + " of " + suits[j];
			i++;
			if (i == ranks.length) 
			{
				i = 0;
				j=j+1;
			}
			System.out.println(cards[k]);
		}
	}
}
