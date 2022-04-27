package com.qa.helloworld;

public class Results {
	public static double i, j, k;
	public static double total;
	public static double avg;
	
	
	public static void main(String[] args) {
		displayScore(120,102,98);
		percentageScore();
	}

	public static void displayScore(double physics, double chemistry, double biology) {
		i = physics;
		j = chemistry;
		k = biology;
		
		System.out.println("Your Physics results are: " + i);
		System.out.println("Your Chemistry results are: " + j);
		System.out.println("Your Biology results are: " + k);
		System.out.println("Total: ");
		total = i + j + k;
		System.out.println(total);
	}
	public static void percentageScore() {
		System.out.println("Percentage: ");
		avg = (total * 100) / 450;
		System.out.println(avg);
	}
}
