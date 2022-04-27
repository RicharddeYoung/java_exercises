package com.qa.helloworld;

public class HelloWorld {
	
	public static void main(String[] args) {
		calculator(15, 12);
	}
	
	private static void calculator(double num1, double num2) {
		double result1 = num1 + num2;
		double result2 = num1 * num2;
		double result3 = num1 - num2;
		double result4 = num1 / num2;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		if (num1<num2) {
			System.out.println(result4);
		} else {
			System.out.println("Division cannot be performed.");
		}
		
	}

	public static void printMessage(String message) {
		System.out.println(message);
	}
	

}
