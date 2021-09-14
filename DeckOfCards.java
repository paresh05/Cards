package com.bridgelabzcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author paresh.praveen_ymedi
 *
 */

/**
 * This class is used to define the deck of cards
 * 
 * @member suits is used to define the suits
 * @member ranks is used to define the ranks
 * @member deckOfCards is used to define the set of deckOfCards
 */

public class DeckOfCards {
	
	public static String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
	
	public static String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

	private static List<Card> deckOfCards = new ArrayList<Card>();


	/**
	 * This method is used to initialize all the deck of cards
	 * 
	 * @return nothing
	 */
	public void initializeCards() {
		for(int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				deckOfCards.add(new Card(ranks[j],suits[i]));	
			}	
		}
	}
	
	/**
	 * This method is used to Shuffle all the cards in the deck
	 * 
	 * @return nothing
	 */
	public void shuffleCards() {
		
		Collections.shuffle(deckOfCards);

	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Game of Cards");
		
		DeckOfCards deckOfCards = new DeckOfCards();
		
		deckOfCards.initializeCards();
		
		deckOfCards.shuffleCards();
		
		Players p = new Players();
		
		int noOfPlayers = p.noOfPlayers();
		
		p.sequenceOfPlayers();

	}
}
