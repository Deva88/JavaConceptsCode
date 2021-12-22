package com.treeset;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> treeset= new TreeSet<>();
		treeset.add("Devendra");
		treeset.add("Raj");
		treeset.add("Abhi");
		treeset.add("Ravi");
		treeset.add("Vikash");
		
		System.out.println("Tree Set is " + treeset);
		System.out.println("First Value " + treeset.first());
		System.out.println("First Value " + treeset.last());
		treeset.remove("Abhi");
		System.out.println("Updated Tree Set is " + treeset);
		treeset.pollFirst();
		System.out.println("Updated Tree Set is " + treeset);
		treeset.pollLast();
		System.out.println("Updated Tree Set is " + treeset);
	}

}
