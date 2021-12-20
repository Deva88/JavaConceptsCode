package com.vectore;
import java.util.Vector;
public class vectorEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> name=new Vector<String>();
		name.add("Rahul");
		name.add("Rakesh");
		name.add("Devendra");
		System.out.println("List of vector :" +name);
		System.out.println("Default capacity of vecor: "+name.capacity());	
	}
}
