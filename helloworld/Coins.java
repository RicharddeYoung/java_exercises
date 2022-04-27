package com.qa.helloworld;

public class Coins {

	public static double cost;
	public static double amount;
	
	public static void main(String[] args) {
		coins(56.25, 100);
	}
	
	public static void coins(double cost, double amount) {
		double change = amount-cost;
		int totalChange = (int) (change*100);
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int twos = 0;
		int ones = 0;
		int fifty = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int two = 0;
		int one = 0;
		boolean bool4 = true;
		
		while (bool4) {
			if (totalChange>=2000) {
				twenties++;
				totalChange-=2000;
			} else if (totalChange-1000>=0) {
				tens++;
				totalChange-=1000;
			} else if (totalChange-500>=0) {
				fives++;
				totalChange-=500;
			} else if (totalChange-200>=0) {
				twos++;
				totalChange-=200;
			} else if (totalChange-100>=0) {
				ones++;
				totalChange-=100;
			} else if (totalChange-50>=0) {
				fifty++;
				totalChange-=50;
			} else if (totalChange-20>=0) {
				twenty++;
				totalChange-=20;
			} else if (totalChange-10>=0) {
				ten++;
				totalChange-=10;
			} else if (totalChange-5>=0) {
				five++;
				totalChange-=5;
			} else if (totalChange-2>=0) {
				two++;
				totalChange-=2;
			} else if (totalChange-1>=0) {
				one++;
				totalChange-=1;
			} else {
				bool4 = false;
			}
		}
		System.out.println("You spend: £" + cost);
		System.out.println("You pay with: £" + amount);
		System.out.println("Your change is: £" + change);
		System.out.println("You receive: " + twenties + "x £20 notes, " + tens + "x £10 notes, " + fives + "x £5 notes, " + twos + "x £2 coins, " + ones + "x £1 coins, " + fifty + "x 50p coins, " + twenty + "x 20p coins, " + ten + "x 10p coins, " + five + "x 5p coins, " + two + "x 2p coins and " + one + "x 1p coins.");
		
	}
}


