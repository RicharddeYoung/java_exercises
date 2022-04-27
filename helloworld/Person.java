package com.qa.helloworld;

public class Person {

	// ATTRIBUTES
	private String name;
	private String jobTitle;
	private double height;
	private int age;
	private double shoesize;

	// CONSTRUCTOR
	public Person(String name, String jobTitle, double height, int age, double shoesize) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.height = height;
		this.age = age;
		this.shoesize = shoesize;
	}

	// OVERLOADING
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}

	// NON-STATIC METHOD
	public void primeInfo() {
		System.out.println("Hi, my name is " + name + " and I'm " + age + " years old.");
	}
	public void secondInfo() {
		System.out.println("I am a " + jobTitle + ", I am " + height + " metres tall and wear size " + shoesize + " shoes.");
	}

	

	// STATIC METHOD
	public static void hello() {
		System.out.println("Hello");
	}

}
