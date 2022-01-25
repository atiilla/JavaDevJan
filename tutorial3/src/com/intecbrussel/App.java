package com.intecbrussel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// find word with regex
		String text = "Lorem Ipsum is slechts Lorem een proeftekst uit het Lorem drukkerij- en zetterijwezen. Lorem Ipsum is de standaard proeftekst in deze bedrijfstak sinds de 16e eeuw, toen een onbekende drukker een zethaak met letters nam en ze door elkaar husselde om een font-catalogus te maken.";
		
		Pattern pattern = Pattern.compile("lorem");
		Matcher matcher = pattern.matcher(text.toLowerCase());
		
		/*
		  while(matcher.find()) {
			System.out.println(matcher.start() + " - " + matcher.end());
		}
		 */
		
		// split method > from string to array
		String myStringData = "Jack,Mike,Bob,Jay";
		String[] myArrData = myStringData.split(",");
		System.out.println(myStringData);
		System.out.println(myArrData.length);
		System.out.println(myArrData[0]);
		
		
		
		
		
		
	}

}









