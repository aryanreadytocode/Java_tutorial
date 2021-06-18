package com.aryan.java;

import java.util.*;
import java.util.function.Consumer;
/**
 * Java 8 has introduced forEach method in java.lang.Iterable interface
 * so that while writing code we focus on business logic.
 * */
public class ForEach {

	public static void forEach() {
		List<Integer> myList = new ArrayList<Integer>();
		for(int i= 0; i<10; i++) myList.add(i);
		
		//traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println("Iterator Value::"+i);
		}
		
		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("forEach anonymous class value::"+t);
				
			}
			
		});
	}
}
