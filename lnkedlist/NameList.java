package com.lnkedlist;
import java.util.LinkedList;

public class NameList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> namelist=new LinkedList<String>();
		namelist.add("Ravi");
		namelist.add("Abhi");
		namelist.add("Rahul");
		namelist.add("Deva");
		namelist.add(null);
		System.out.println("Add name in Linked List :"+namelist);
		//addFirest method
		namelist.addFirst("Vikash");
		System.out.println("Add name in frist index :"+namelist);
		//addLast method
		namelist.addLast("Tanu");
		System.out.println("Add name in last index :"+namelist);
		//Size of Linked List
		System.out.println("Size of Linked List :-"+namelist.size());
		// add data in spacfic index
		namelist.add(2,"Aman");
		System.out.println("Add name in spacfic index :"+namelist);
		//replce method
		namelist.set(1, "Rocky");
		System.out.println("Replace name in list :" +namelist);
		//remove using index 
		namelist.remove(1);
		System.out.println("remove using index number :"+namelist);
		//remove using name
		namelist.remove("Aman");
		System.out.println("remove using name :"+namelist);
		//remove first in list
		namelist.removeFirst();
		System.out.println("Remove first name in List :" +namelist);
		//remove Last in list
		namelist.removeLast();
		System.out.println("Remove last name in List :" +namelist);	
	}
}
