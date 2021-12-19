package com.oops;

//Polymorphism with real life example
public class Shape {
	public void area(String Circle)
	{
		System.out.println("Circle");
	}
	public void area(String Circle, String Triangle)
	{
		System.out.println("Circle and Triangle");
	}
	public void area(String Circle, String Triangle, String Rectangle)
	{
		System.out.println("Circle and Triangle and Rectangle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Shape();
		shape.area("Circle");
		shape.area("Circle", "Triangle");
		shape.area("Circle", "Triangle", "Rectangle");
	}
}
