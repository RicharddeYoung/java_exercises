package com.qa.helloworld;

public class FizzBuzz {

	public static void main(String[] args) {
		
		fizzBuzz(15);
	}
	
	public static void fizzBuzz(int buzzNum) {
		if (buzzNum%3==0 && buzzNum%5==0) {
			System.out.println("FizzBuzz");
		} else if (buzzNum%3==0) {
			System.out.println("Fizz");
		} else if (buzzNum%5==0) {
			System.out.println("Buzz");
		} else {
			System.out.println(buzzNum);
		}
		
	}

}
