package com.qa.helloworld;

public class Flowchart {
	
	public static void main(String[] args) {
		
		oneIncrements();
		
	}
	
	public static void firstFlow(boolean bool1, double num1, double num2) {
		if (bool1) {
			System.out.println(num1+num2);
		} else {
			System.out.println(num1*num2);
		}
	}
	
	public static void secondFlow(double num3) {
		if (num3>2000) {
			System.out.println("A");
			if (num3>6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (num3>4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println("1");
			if (num3>100) {
				System.out.println("3");
				if (num3>600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (num3>500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}	
		}
			
	}
	
	public static void thirdFlow() {
		for (int A = 100; A<201; A++)System.out.println("A");
				System.out.println("End");
	}
	
	public static void forthFlow() {
		
		for (int A = 100; A<=200; A++) {
			if (A%2==0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
			System.out.println("End");
	}
	
	public static void one2Ten() {
		int h=1;
		boolean bool3 = true;
		for (int i = 1; i<11; i++) {
			h=1;
			bool3 = true;
			while (bool3) {
				System.out.println(i);
				h++;
				if (h>10) {
					bool3 = false;
				}
			}
		}
	}
	
	public static void oneIncrements() {
		int h=1;
		boolean bool3 = true;
		for (int i = 1; i<11; i++) {
			h=1;
			bool3 = true;
			while (bool3) {
				System.out.println(i);
				h++;
				if (h>i) {
					bool3 = false;
				}
			}
		}
	}
}
	


