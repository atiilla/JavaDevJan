package tutorial2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int n1 = 6;
		int n2 = 5;
		String _n2 = "5";
		// equal to operator  (==)
		// boolean result = n1 == n2; // ?
	//	boolean result = n1 == Integer.parseInt(_n2); //  true
		
		// not equal (!=)
		// boolean result = n1 !=n2; //  false
		
		// greater than operator (>)
		
		// boolean result = n1 > n2; // true
		
		// less than operator (<)
		
		//boolean result = n2<n1; // true
		
		// boolean result = n1>=n2; // greater or equal
		
		// less than or equal operator
		// boolean result =n2 <= n1;
		
		// logical operators
		// and operator &&
		// or (||)
		// !
		
		// boolean result = (n1 >=n2) && (n2<n1); 
		// (n1 >=n2) true AND (n2<n1) true = true


		// or (||)
		
		// boolean result = (n1>=n2) || (n2<n1);
		
		boolean result = !(n1<n2);
		
		System.out.println(result);

		// Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int userInput = keyboard.nextInt();
		
		System.out.println("YOu entered > " + userInput);
		
		/*
		 Output expected: 
		 Hello!
		 My name is xxxxxxx. I'm xx years old.
		 I live in xxxxxx
		 */
		String name = "jack";
		int age = 29; // %d%n
		System.out.printf("My name is %s. My age is %d%n",name,age);
		

	}

}
