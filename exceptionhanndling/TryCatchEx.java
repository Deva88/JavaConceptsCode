package com.exceptionhanndling;

//Try Catch Example
public class TryCatchEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100, b=0, c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {

			System.out.println("you cannot divide by zero");
		}
	}
}

