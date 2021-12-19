package com.oops;

//Inheritance exmple
class Addition {
	public void add(int a, int b)
	{
		System.out.println("Addition is " +(a+b));
	}
}

class Subtraction extends Addition
{
	public void sub(int a, int b)
	{
		System.out.println("Subtraction is " +(a-b));
	}
}

class Multiplication extends Subtraction
{
	public void mul(int a, int b)
	{
		System.out.println("Subtraction is " +(a*b));
	}
}

class Division extends Multiplication
{
	public void div(int a, int b)
	{
		System.out.println("Subtraction is " +(a/b));
	}

	public void callAllMethods()
	{
		add(5,3);
		sub(30, 20);
		mul(20, 5);
		div(10, 5);
	}
}

class calculation extends  Division
{
	public static void main(String args[])
	{
		Division  division = new  Division();
		division.callAllMethods();
	}
}