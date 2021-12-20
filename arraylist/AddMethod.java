package com.arraylist;

import java.util.*;
public class AddMethod {
	public static void main(String[] args) {
		// string type array list use
		ArrayList<String> fruit = new ArrayList();
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("grap");
		fruit.add("plum");
		// simple way Display the complete Array list
		System.out.println(fruit);

		// Display iterate() method of Arraylist for loop
		for (String fruitName : fruit)
			System.out.println(fruitName);

		// integer type array list use
		ArrayList<Integer> number = new ArrayList();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);

		// simple way Display the complete Array list
		System.out.println(number);

		// Display iterate() method of Arraylist for loop
		for (Integer num : number)
			System.out.println(num);
	}
}