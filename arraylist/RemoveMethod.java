package com.arraylist;

import java.util.ArrayList;

public class RemoveMethod {
	public static void main(String[] args) {
		// string type array list use
		ArrayList<String> fruit = new ArrayList();
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("grap");
		fruit.add("plum");

		//remove element
		fruit.remove(0);

		// Display iterate() method of Arraylist for loop
		for (String fruitName : fruit)
			System.out.println(fruitName);

		// integer type array list use
		ArrayList<Integer> number = new ArrayList();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);

		//remove element(Using removeAll() method to remove all)
		number.removeAll(number);

		//remove all element Using clear()method
		number.clear();

		// Display iterate() method of Arraylist for loop
		for (Integer num : number)
			System.out.println(num);
	}
}