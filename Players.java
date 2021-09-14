package com.bridgelabzcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Player{
	
	String name;
	public Player(String name) {
		List<Card>player = new ArrayList<Card>();
		this.name = name;
	}
}

public class Players {
	
	public static int noOfPlayers;
	public static String playerName;
	
	/**
	 * This is a parameterized constructor
	 * @param n is the number of players passed in the main function
	 */
	
	List<Player>players;
	public Players() {
		this.players = new ArrayList<Player>();
	}
	
	
	/**
	 * This function is used to check the number of players 
	 * User will input the number of players
	 * @return noOfPlayers
	 */
	
	public int noOfPlayers()
	{
		int input=0;
		System.out.println("Enter the number of Players more than 2 and max 4");
		Scanner sc = new Scanner(System.in);
		while(input==0)
		{
			noOfPlayers = sc.nextInt();
			if(noOfPlayers>4||noOfPlayers<3)
			{
				System.out.println("Please Enter the number of players in the range between 2 and 4");
			}
			else {
				sc.nextLine();
				for(int i = 0; i<noOfPlayers;i++) {
					System.out.println("Enter the name of Player"+(i+1)+": ");
					playerName = sc.nextLine();
					this.players.add(new Player(playerName));
				}
				input=1;
			}
		}
		return noOfPlayers;
	}

	/**
	 * This function is used set the order in which the players should receive the cards
	 * @return nothing
	 */
	public void sequenceOfPlayers() {
		
		System.out.println("Before Shuffle");
		
		for(int i=0; i<players.size(); i++){
			System.out.println("Player "+(i+1)+" :"+players.get(i).name);
		}
		
		Collections.shuffle(this.players);
		
		System.out.println("After Shuffle");
		
		for(int i=0; i<players.size(); i++){
			System.out.println("Player "+(i+1)+" :"+players.get(i).name);
			
		}
	}
}
