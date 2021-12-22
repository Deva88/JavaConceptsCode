package com.stack;
import java.util.*;
public class StackzDemo {
	public static void main(String[] args) {
		Stack s= new Stack();
		boolean result1 = s.empty();  
		System.out.println("Is the stack empty? " + result1); 
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println("Push method :" +s);
		System.out.println("Search method:"+s.search("A"));
		System.out.println("Search method:"+s.search("Z"));
		// checking stack is empty or not  
		boolean result = s.empty();  
		System.out.println("Is the stack empty? " + result);  
	}

}
