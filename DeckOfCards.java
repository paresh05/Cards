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

public class DeckOfCards 
{
	public static String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
	
	public static String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

	public static List<Card> deckOfCards = new ArrayList<Card>();


	/**
	 * This method is used to initialize all the deck of cards
	 * 
	 * @return nothing
	 */
	public static void initializeCards() 
	{
		for(int i = 0; i < suits.length; i++) 
		{
			for (int j = 0; j < ranks.length; j++) 
			{
				deckOfCards.add(new Card(ranks[j],suits[i]));	
			}	
		}
	}
	
	/**
	 * This method is used to Shuffle all the cards in the deck
	 * 
	 * @return nothing
	 */
	public static void shuffleCards() 
	{
		Collections.shuffle(deckOfCards);
	}
	
	/**
	 * This method is used to Distribute the cards to all the players
	 * 
	 * @return nothing
	 */
	public static void distributeCards() 
	{
		for(int j=0;j< Players.players.size(); j++) 
		{
			Collections.shuffle(deckOfCards);
			for(int i = 0;i<deckOfCards.size();i++) 
			{
				if(Players.players.get(j).player.size()<9) 
				{
					Players.players.get(j).player.add(deckOfCards.get(i));
					deckOfCards.remove(i);
					
				}
			}
		}
	}
	
	/**
	 * This method is used to Verify different types of cards each player has received according to the suits
	 * 
	 * @return nothing
	 */
	public static void verifyCards() 
	{
		for(int j=0;j< Players.players.size(); j++) 
		{ 
			int spades = 0, clubs = 0, diamonds = 0, hearts = 0;
			for(int k = 0;k<Players.players.get(j).player.size();k++) 
			{
				String suit = Players.players.get(j).player.get(k).suits;
				switch(suit)
				{
				case "Spades":
					spades++;
					break;
				case "Hearts":
				 	hearts++;
					break;
				case "Diamonds":
					diamonds++;
					break;
				case "Clubs" :
					clubs++;
					break;
				}
			}
			System.out.println("Player "+Players.players.get(j).name+" Cards : Clubs: "+clubs+" Diamonds: "+diamonds+" Hearts: "+hearts+" Spades: "+spades);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Game of Cards");
		
		initializeCards();
		
		shuffleCards();
		
		Players p = new Players();
		
		p.noOfPlayers();
		
		p.sequenceOfPlayers();
		
		distributeCards();
		
		verifyCards();
	}
}
