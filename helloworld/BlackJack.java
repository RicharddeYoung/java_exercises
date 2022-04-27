package com.qa.helloworld;

public class BlackJack {

	public static void main(String[] args) {
	
		dealer(20, 24);
	}
	
	public static void dealer(int num1, int num2) {
		System.out.printf("play: " + num1 + " " + num2 + " -> ");
		if (num1>num2 && num1<=21) {
			System.out.println(num1);
		} else if (num1<num2 && num2<=21) {
			System.out.println(num2);
		} else if (num1>21 && num2<=21) {
			System.out.println(num2);
		} else if (num1<=21 && num2>21) {
			System.out.println(num1);
		} else if (num1>21 && num2>21) {
			System.out.println(0);
		} else {
			System.out.println("draw");
		}
	}
}
