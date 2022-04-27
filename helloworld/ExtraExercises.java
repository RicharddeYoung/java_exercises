package com.qa.helloworld;

public class ExtraExercises {

	public static void main(String[] args) {

		beerBottles();
	}

	public static void riceBags(int oneKilo, int fiveKilo, int target) {
		boolean happy=true;
		int fives=fiveKilo*5;
		int smallBags=oneKilo+fives;
		if (smallBags >= target) {
			System.out.println(happy);
			System.out.println(smallBags);
		} else {
			happy=false;
			System.out.println(happy);
			System.out.println(-1);
		}
	}
	
	public static void beerBottles() {
		int bottlesLeft=99;
		boolean beers=true;
		while (beers) {
			System.out.println(bottlesLeft + " bottles of beer on the wall, " + bottlesLeft + " bottles of beer.");
			System.out.println("Take one down and pass it around, " + (--bottlesLeft) + " bottles of beer on the wall.");
			if (bottlesLeft==0) {
				beers = false;
				System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
				System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
			}
		}
	}
}
