package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaEX {
	
	static  Intr fun2(Intr i) {
		return i;
	};
	public static void main(String[] args) {
		
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(20, "Subham", 480));
		list.add(new Student(19, "Rutu", 780));
		list.add(new Student(10, "Gandharba", 680));
		list.add(new Student(40, "Gandu", 380));
		list.add(new Student(30, "Chap", 580));
		
		
//		Collections.sort( list,new Comparator<Student>(){
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.getMarks()>o2.getMarks()) {
//					return 1;
//				}else {
//					
//					return 1;
//				}
//			}
//			
//		});
		
//		Collections.sort(list,(s1,s2)-> s1.getMarks()>s2.getMarks() ? 1: -1);
//		System.out.println(list);
		Intr i2 = fun2(()->System.out.println(10));
		
	}
}

@FunctionalInterface
interface Intr{
	void fun1();
}