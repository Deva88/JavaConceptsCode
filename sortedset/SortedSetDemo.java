package com.sortedset;
import java.util.*;
public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> sortedset= new TreeSet<String>();
		sortedset.add("Devendra");
		sortedset.add("Rocky");
		sortedset.add("Raj");
		sortedset.add("Deva");
		sortedset.add("Devendra");
		sortedset.add("Abhi");
		
		System.out.println("Sorted set is " +sortedset);
		System.out.println("First Value " + sortedset.first());
		System.out.println("Last Value " + sortedset.last());
		sortedset.remove("Deva");
		System.out.println("After removing element Sorted set is " +sortedset);
		System.out.println("Head Set method: " + sortedset.headSet("Raj"));
		System.out.println("tail Set method: " + sortedset.tailSet("Raj"));
		System.out.println("sub Set method: " + sortedset.subSet("Devendra", "Rocky"));
	}
}
