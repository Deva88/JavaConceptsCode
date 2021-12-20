package com.arraylist;
import java.util.ArrayList;

public class LastIndexOfMethod {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList();
		nameList.add("Devendra");
		nameList.add("Rocky");
		nameList.add("Raj");
		nameList.add("Ravi");
		nameList.add("Ravi");
		nameList.add("Rahul");
		System.out.println("Find Last Index Number :" + nameList.lastIndexOf("Devendra"));
		System.out.println("Find Last Index Number :" + nameList.lastIndexOf("Rocky"));
		System.out.println("Find Last Index Number :" + nameList.lastIndexOf("Raj"));

		//Duplicate value always Return Last occurrence
		System.out.println("Find Last Index Number :" + nameList.lastIndexOf("Ravi"));
	}
}
