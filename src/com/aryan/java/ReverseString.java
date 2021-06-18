package com.aryan.java;

public class ReverseString {
	
	public static void reverseString(String stringToReverse) {
		if(stringToReverse!=null && !stringToReverse.isBlank()) {
		System.out.println("String berfore reverse:"+stringToReverse);
		StringBuilder reversedString = new StringBuilder();
		for(int i = stringToReverse.length()-1; i>=0; i--) {
			reversedString.append(stringToReverse.charAt(i));
		}
		System.out.println("String aafter reverse:"+reversedString);
	}
	}

}
