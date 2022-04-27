package com.qa.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLitExercises {

	public static void main(String[] args) {
		// CREATE ARRAYLIST
		List<String> exampleList = new ArrayList<>();
		// POPULATE ARRAYLIST
		exampleList.add("Example1");
		exampleList.add("Example2");
		exampleList.add("Example3");
		exampleList.add("Example4");
		// PRINT OUT ENTIRE ARRAYLIST
		System.out.println(exampleList);
		// REPLACE AN ITEM WITHIN THE ARRAYLIST
		exampleList.set(3, "Example5");
		System.out.println(exampleList);
		// REMOVE AN ITEM FROM THE ARRAYLIST
		exampleList.remove(3);
		System.out.println(exampleList);
				
		// REGULAR FOR LOOP
//		for (int i =0; i<exampleList.size(); i++) {
//			System.out.println(exampleList.get(i));
//		}
		
		// ENHANCED FOR LOOP
//		for (String examples : exampleList) {
//			System.out.println(examples);
//		}
		
		// COLLECTIONS
		// SORT ARRAYLIST
		Collections.sort(exampleList);
		System.out.println(exampleList);
		// REVERSE ARRAYLIST
		Collections.reverse(exampleList);
		System.out.println(exampleList);
		// SWAP ITEMS WITHIN ARRAYLIST
		Collections.swap(exampleList, 0, 1);
		System.out.println(exampleList);
		
		// CLEAR ALL ITEMS FROM ARRAYLIST
		exampleList.clear();
		System.out.println(exampleList);

	}

}
