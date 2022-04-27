package com.qa.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("David");
		names.add("Susan");
		names.add("Robert");
		
//		System.out.println(names);
//		System.out.println(names.get(1));
//		names.set(0, "Phil");
//		System.out.println(names);
		
//		System.out.println(names.size());
		
		// ENHANCED FOR LOOP
//		for (String name :names) {
//			System.out.println(name);
//		}
		
		// REGULAR FOR LOOP
//		for (int i = 0; i<names.size(); i++) {
//			System.out.println(names.get(i));
//		}
		
		// COLLECTIONS
		Collections.swap(names, 1, 2);
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
		names.clear();
		System.out.println(names);
		
		// FAST LIST CREATION/POPULATION - if not encapsulated within new ArrayList<>( ) it will be unmutable
		List<String> names2 = new ArrayList<>(List.of("Rebecca", "Daniel", "Kevin", "Stuart"));
		System.out.println(names2);

	}

}
