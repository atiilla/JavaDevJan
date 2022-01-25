package com.tutorials;

import java.util.Scanner;

public class Jeremy {
	public static void main(String[] args) {

		/*
		 * 1 add income int 2 add expenses 3 total budget 4 total expenses 5 exit
		 */
		int income = 0;
		int expenses = 0;
		int budget = 0;
		boolean budgetapp = true;

		Scanner input = new Scanner(System.in);

		while (budgetapp) {
			System.out.println("Please enter your income:");
			income = income + input.nextInt();
			System.out.println("Please enter your expenses");
			expenses = expenses + input.nextInt();
			budget = income - expenses;
			System.out.println("Your total budget is: " + budget);

			switch (budget) {
			case 1000:
				System.out.println("Enough spending money now!");
				budgetapp = false;
				input.close();

			}
		}

	}

}
