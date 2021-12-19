package com.variable;

public class InstanceExample {
	int num1=100; //instance variables
	int num2=200;
	//static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static area
		InstanceExample instanceexample= new InstanceExample();
		System.out.println(instanceexample.num1);
		System.out.println(instanceexample.num2);
		instanceexample.method();
	}
	//instance method
	void method() {
		System.out.println(num1);
		System.out.println(num2);
	}
}