package com.hashset;
import java.util.*;
public class HashSetDemo {
	public static void main(String args[]){  
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Arun");  
		set.add("Sumit");  
		System.out.println("An initial list of elements: "+set); 
		//Removing specific element from HashSet  
		set.remove("Ravi");  
		System.out.println("After remove(object) method: "+set);  
		HashSet<String> set1=new HashSet<String>();  
		set1.add("Ajay");  
		set1.add("Gaurav");  
		set.addAll(set1);  
		System.out.println("Updated List: "+set);  
		//Removing all the new elements from HashSet  
		set.removeAll(set1);  
		System.out.println("After removeAll() method: "+set);    
		//Removing all the elements available in the set  
		set.clear();  
		System.out.println("After clear() method: "+set);  
	}  
}  