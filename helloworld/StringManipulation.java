package com.qa.helloworld;

public class StringManipulation {

	public static void main(String[] args) {

//		String myStr = "I like strings";
//		String myStr2 = new String("I like strings");
//		String myStr3 = "I like strings";
//		
//		// COMPARING MEMORY VALUES, RATHER THAN VALUES
//		System.out.println(myStr==myStr2);
//		System.out.println(myStr==myStr3);
//		System.out.println(myStr2==myStr3);
//		
//		// COMPARING VALUES
//		System.out.println(myStr.equals(myStr2));
//		
//		for (int i = 0; i<myStr.length(); i++) {
//			System.out.println(myStr.charAt(i));
//		}
//		
//		System.out.println("String Length is " + myStr.length());

		String str1 = "ThIsIsSoMeTeXt";
		String str2 = "thisissometext";

//		System.out.println(str1.toLowerCase());
//		System.out.println(str1.toUpperCase());
//		System.out.println(str1.charAt(6));
//		System.out.println(str1.indexOf("I"));
//		System.out.println(str1.startsWith("t"));
//		System.out.println(str1.endsWith("t"));
//		System.out.println(str1.contains("So"));
//		System.out.println(str1.substring(1,4));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.replace("SoMe", "SOMEREALLYFUN"));

	}

}
