package com.oops;

//Encapsulation example
public class StudentExam {
	private String name;
	private int rollNo;
	String subject;

	void setName(String name) {
		this.name =name;
	}

	String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentExam studentexam=new StudentExam();
		studentexam.setName("Devendra");
		System.out.println(studentexam.getName());
		studentexam.rollNo=001;
		System.out.println(studentexam.rollNo=20);
	}
}