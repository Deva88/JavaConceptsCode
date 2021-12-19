package com.oops;

//Abstraction using Abstract keyword.
abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	public void run()
	{
		System.out.println("honda bike is running");
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda honda=new Honda();
		honda.run();
	}
}