package com.qa.helloworld;

public class EnhancedForLoops {
	
	public static String[] freshArray = new String[10];
	
	public static int[] numArray = new int[20];
	
	public static void main(String[] args) {
		
		
		freshArray[0]="Word1";
		freshArray[1]="Word2";
		freshArray[2]="NewWord1";
		freshArray[3]="NewWord2";
		freshArray[4]="ExtraWord1";
		freshArray[5]="ExtraWord2";
		freshArray[6]="MoreWords1";
		freshArray[7]="MoreWords2";
		freshArray[8]="LastWords1";
		freshArray[9]="LastWords2";
		numArray[0]=1;
		numArray[1]=2;
		numArray[2]=3;
		numArray[3]=4;
		numArray[4]=5;
		numArray[5]=6;
		numArray[6]=7;
		numArray[7]=8;
		numArray[8]=9;
		numArray[9]=10;
		numArray[10]=11;
		numArray[11]=12;
		numArray[12]=13;
		numArray[13]=14;
		numArray[14]=15;
		numArray[15]=16;
		numArray[16]=17;
		numArray[17]=18;
		numArray[18]=19;
		numArray[19]=20;
		
//		for(String fresh : freshArray) {
//			System.out.println(fresh);
//		}
		
//		for(int nums : numArray) {
//			System.out.println(nums*nums);
//		}
		
		for(int nums3 : numArray) {
			boolean bool6 = true;
			if (nums3%2==0) {
				System.out.println(nums3*nums3*nums3);
			} else {
				bool6 = false;
				System.out.println(nums3*nums3);
			}
		}
		
		
	}
	

//	public static void oddEven(int num1) {
//			boolean bool5 = true;
//			if (num1%2==0) {
//				System.out.println(bool5);
//			} else {
//				bool5 = false;
//				System.out.println(bool5);
//			}
//	}
	
	
	
	

}
