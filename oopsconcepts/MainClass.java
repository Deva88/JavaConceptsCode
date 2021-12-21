package com.oopsconcepts;
class One {
	public void display() {
		System.out.println("One");
	}
}
//inheritance
class Two extends One {
	@Override
	public void display() {
		System.out.println("Two");
	}
	public int add(int x, int y) {
		return x+y;
	}
	//Overload
	public double add(double x,double y) {
		return x+y;
	}
}
//encapsulation example
class EncapTest {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
}
//abstraction
abstract class TwoWheeler {
	public abstract void run();
}
class Honda extends TwoWheeler{
	public void run(){
		System.out.println("\nbike is Running..");
	}
}
class MainClass {
	public static void main(String[] args) {
		One num1=new One();
		num1.display();
		Two num2=new Two();
		num2.display();
		System.out.println("Add number :"+num2.add(4,2));
		System.out.println("Add float number :"+num2.add(5.0,2.0)); //polymorphism
		EncapTest encap = new EncapTest();
		encap.setName("Devendra");
		System.out.print("Name : " + encap.getName() );
		TwoWheeler test = new Honda();
		test.run();
	}
}
