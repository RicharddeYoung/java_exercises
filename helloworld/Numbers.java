package com.qa.helloworld;

public class Numbers {

	public static int[] splitArray = new int[2];

	public static void main(String[] args) {
		int num1 = (87);
		int step1 = num1 / 10;
		splitArray[0] = step1;
		int step2 = num1 % 10;
		splitArray[1] = step2;
		for (int i = 0; i < splitArray.length; i++) {
		}
		System.out.println(splitArray[0] + splitArray[1]);
	}
}