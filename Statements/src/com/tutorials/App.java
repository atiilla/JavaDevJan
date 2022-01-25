package com.tutorials;

public class App {

	public static void main(String[] args) {
		// number1 == number2
		// if statement
		/*if(condition) { // if condition is true.
			// execute code here
		}*/
		int n1=10; int n2=11;
		if(n1==n2 && n2>n1) { // false
			System.out.println("Yes they are equal!");
		}
		else if (n2>=n1) { // true
			System.out.println("Yes it is true!!!!");
		}
		else {
			// false 
			System.out.println("No, They are not equal!");
		}
		

	}

}
