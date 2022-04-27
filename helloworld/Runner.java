package com.qa.helloworld;

public class Runner {

	public static void main(String[] args) {

		Person david = new Person("David", "Software Engineer", 1.8, 22, 10);
		Person susan = new Person("Susan", "Poolside Assistant", 1.4, 19, 7);
		Person robert = new Person("Robert", "Pilot", 1.7, 32, 10.5);
		Person phil = new Person("Phil", "Kitchen Porter", 1.75, 17, 9);
		
		david.primeInfo();
		david.secondInfo();
		susan.primeInfo();
		susan.secondInfo();
		robert.primeInfo();
		robert.secondInfo();
		phil.primeInfo();
		phil.secondInfo();
		
	}

}
