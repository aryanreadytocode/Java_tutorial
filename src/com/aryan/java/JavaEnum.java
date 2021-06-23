package com.aryan.java;

/**
 * Enumeration serves the purpose of representing a group of named
 * constants in programming language
 * ex- 4 suits in deck of playing card
 * 
 * Enums are used when we know all possible values at compile time
 * such as choices on menu
 * In Java, we can also add variables, methods and constructors to it.
 * 
 * Enum declaration can be done outside a Class or inside a Class
 * but not inside a Method*/
enum Color {
	RED, GREEN, BLUE;
}
public class JavaEnum {
	public static void main(String[] args) {
		Color c = Color.RED;
		System.out.println(c);
	}
}
