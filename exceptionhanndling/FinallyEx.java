package com.exceptionhanndling;

public class FinallyEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		try {
			int a=100, b=0, c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {

			System.out.println("Exception :" +e);
		}
		finally {
			System.out.println("i am in finally block");
		}
		//unchecked Exception
		System.out.println(name.length());
	}
}
