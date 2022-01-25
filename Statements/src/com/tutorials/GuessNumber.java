package com.tutorials;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Guess Number
		// Scanner, Math.random, if Statement
		int rand = (int) ((Math.random() * (10-0)) + 0);
	
		
		// userinput vs  randomnumber by computer
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int userinput = scanner.nextInt(); // int number from user.
		
		
		
		boolean game = true;
		while(game) {
			if(userinput ==rand) {
				// success
				System.out.println("You won!, play this game later.");
				game=false;
				System.exit(0);
			}else {
				// unsuccess
				System.out.println("Your guess is incorrect, please enter a number again: ");
				System.out.println("UserInput: " +userinput + "\nComputer's Number: "+rand);
				userinput = scanner.nextInt();
				
			}
		}
		
		
	/*
	 	if(rand == userinput) {
			// success block
			System.out.println("Yes you guessed the number!");
		}else {
			System.out.println("Your guess is incorrect!");
		}
	 */
		
	
		/*
		 if(condition) {
			System.out.println("sasdadasdad");
		}else if(condition) {
			System.out.println("adaduashduahsdhas");
		}else {
			
		}
		 */
	
		
	}

}
