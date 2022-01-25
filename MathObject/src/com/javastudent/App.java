package com.javastudent;

public class App {

	public static void main(String[] args) {
		// Math Object
		int a = 12;
		int b = 11;
		
		// Max Method Find Highest number!
		System.out.println(Math.PI); //
		System.out.println(Math.max(a, b));
		System.out.println(Math.min(a, b));
		System.out.println(Math.sqrt(32));
		System.out.println(Math.abs(-10));
		double getNumber = Math.random() * 10; // 0-99
		System.out.println(Math.round(getNumber));
		String[] names = { "Ali", "Veli", "Deli" };
		double GenIndexNum = Math.random() * 2;
		System.out.println(Math.round(GenIndexNum));
		System.out.println(names[(int) Math.round(GenIndexNum)]);

	}

}
