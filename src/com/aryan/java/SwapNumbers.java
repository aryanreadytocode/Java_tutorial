package com.aryan.java;

public class SwapNumbers {
	
	public static void swapNo(int a, int b) { //a =10, b= 20
		System.out.println("a: "+a+"b: "+b); 
		a = a+b; //30
		b = a-b; // 30-20 = 10
		a = a- b; //30-10 = 20
		
		System.out.println("a: "+a+"b: "+b);
	}

}
