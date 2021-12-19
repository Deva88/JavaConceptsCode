package com.java8_feature;

interface Addition
{
	void add(int a, int b);
}
public class LambdaExample {
	public static void main(String[] args) {
		//Application with anonymous
		Addition  addition = new Addition()
		{
			public void add(int a, int b) {System.out.println(a+b);}
		};
		addition.add(3, 4);

		//lambda
		Addition add=(int a, int b)->System.out.println(a+b);
		addition.add(5, 6);
	}
}