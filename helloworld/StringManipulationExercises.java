package com.qa.helloworld;

public class StringManipulationExercises {

	public static void main(String[] args) {
		
		String str1="yesterday it was raining";
		String str2="today it is sunny";
		// Exercise 1 - part 1
		System.out.println(str2.toUpperCase() + ", " + str1.toUpperCase());
		// Exercise 1 - part 2
		System.out.println(str2.substring(0,12).toUpperCase() + str1.substring(17,24).toUpperCase());

	}

}
