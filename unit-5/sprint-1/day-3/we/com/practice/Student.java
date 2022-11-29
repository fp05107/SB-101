package com.practice;

public class Student {
	
	private int age;
	private String name;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int age, String name, int marks) {
		super();
		this.age = age;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
