package com.bridgelabzcards;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Players {
	
	public static int noOfPlayers;
	
	/**
	 * This is a parameterized constructor
	 * @param n is the number of players passed in the main function
	 */
	
	public Players(int n) {
		List<Card>player = new ArrayList<Card>(n);
	}
	
	
	/**
	 * This function is used to check the number of players 
	 * User will input the number of players
	 * @return noOfPlayers
	 */
	
	public static int noOfPlayers()
	{
		int input=0;
		System.out.println("Enter the number of Players more than 2 and max 4");
		while(input==0)
		{
			Scanner sc = new Scanner(System.in);
			noOfPlayers = sc.nextInt();
			if(noOfPlayers>4||noOfPlayers<3)
			{
				System.out.println("Please Enter the number of players in the range between 2 and 4");
			}
			else
				input=1;
		}
		return noOfPlayers;
	}
	
}
