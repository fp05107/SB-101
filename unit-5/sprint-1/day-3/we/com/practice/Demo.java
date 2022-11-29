package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo {
	
	public static void main(String[] args) {
		
//		Predicate<Integer> p1 = new MyPredicate();
//		
//		System.out.println(p1.test(10));
//		Predicate<Integer> p2 = (i)-> i>=0;
//		
//		System.out.println(p2.test(-10));
		
        List<Student> list = new ArrayList<>();
		
		list.add(new Student(20, "Subham", 480));
		list.add(new Student(19, "Rutu", 780));
		list.add(new Student(10, "Gandharba", 680));
		list.add(new Student(40, "Gandu", 380));
		list.add(new Student(30, "Chap", 580));
		
		list.removeIf((s)-> s.getMarks()<500);
		System.out.println(list);
		
		List<String> list2 = Arrays.asList("Subham","rutu");
		
		list2.forEach((e)->System.out.println(e));
		
	}
}










