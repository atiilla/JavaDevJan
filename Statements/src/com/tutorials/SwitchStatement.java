package com.tutorials;

import java.util.Date;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		// switch statement
		
		int myValue = 10;
		
	/*	switch(myValue) {
		case 0:
			System.out.println("The number is 0");
			break;
		case 1:
			System.out.println("The number is 1");
			break;
		case 2:
			System.out.println("The number is 2");
			break;
		case 3:
			System.out.println("The number is 3");
			break;
		default:
			System.out.println("None of them is correct!");
		}*/
		
		/*
		 String student = "Jeremy";
		
		switch(student) {
		case "Jeremy":
			System.out.println("Jeremy");
			break;
		case "Kubra":
			System.out.println("Kubra");
			break;
		case "Dilshad":
			System.out.println("Dilshad");
			break;
		case "Irina":
			System.out.println("Irina");
			break;
		default:
			System.out.println("No student!");
		}
		
		Date date = new Date();
		System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
		System.out.println(date.getDay());
		
		switch(date.getDay()) {
		case 0:
			System.out.println("Zondag");
			break;
		case 1:
			System.out.println("Maandag");
			break;
		case 2:
			System.out.println("Dinsdag");
			break;
		case 3:
			System.out.println("Woensdag");
			break;
		case 4:
			System.out.println("Donderdag");
			break;
		case 5:
			System.out.println("Vrijdag");
			break;
		case 6:
			System.out.println("Zaterdag");
		}
		
		
		if(date.getDay() == 0) {
			System.out.println("Zondag");
		}else if(date.getDay() == 1) {
			System.out.println("Maandag");
		}else if(date.getDay() == 2) {
			System.out.println("Dinsdag");
		}
		 */
		
		int totalbudget =0;
		int incomes = 0;
		int expenses = 0;
		
		// income 2000
		// budgettotal: 2000
		// expense = 540
		// budgettotal - expense
		// sysout budget
		// sysout expenses
		// x Exit System.exit(0)
		/*
		 #####################
			(1) + Add Income // int 
			(2) - Add Expenses // int expenses += 1000 // income - 1000
			(3) i Total Budget
			(4) i Total Expenses
			(5) x  Exit
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("[1] Students");
			System.out.println("[2] Teachers");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				boolean studentBol = true;
				while(studentBol) {
					System.out.println("Enter student name: ");
					String name = scanner.next();
					System.out.println("You've entered "+ name);
					studentBol = false;
				}
			}
		}
		
		
		

	}

}
