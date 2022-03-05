package com.Bridgelabz;

import java.util.Random;

public class SnakeandLadder {

	public static void main(String[] args) {
		SnakeNLadder s = new SnakeNLadder();
		s.startGame();
		s.rollDice();
	}
}
class SnakeNLadder
{
	
	public void rollDice()
	{
		Random r = new Random();
		int n=r.nextInt(7);
		System.out.println("rollDice is :"+n);
	}
	
	public void startGame()
	{
		int player1 = 0;
		int currentplayerposition = 0;
		 System.out.println("player :" +player1);
	     System.out.println("currentplayerposition is :"+currentplayerposition);	
	}
}