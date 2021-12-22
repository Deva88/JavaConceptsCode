package com.linkedhashset;
import java.util.*;
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedhashset=new LinkedHashSet<String>();
		linkedhashset.add("Devendra");
		linkedhashset.add("Deva");
		linkedhashset.add("Abhi");
		linkedhashset.add("Rocky");
		System.out.println("Original LinkedHashSet :" +linkedhashset);
		System.out.println("Size of LinkedHashSet :" +linkedhashset.size());
		System.out.println("Removing Deva from LinkedHashSet :" +linkedhashset.remove("Deva"));
		System.out.println("updated LinkedHashSet :" +linkedhashset);
		System.out.println("Checking if Abhi is present =" +linkedhashset.contains("Abhi"));
	}
}