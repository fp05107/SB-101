package Question_4;

import java.util.*;
//import java.util.Set;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(10, "Subham", 500));
		set.add(new Student(15, "Subham", 400));
		set.add(new Student(12, "Subham", 480));
		set.add(new Student(12, "Subham", 480));
		set.add(new Student(11, "Subham", 550));
		set.add(new Student(18, "Subham", 600));
		
		Set<Student> set2 = set.stream().filter(e -> e.getMarks()<500).collect(Collectors.toSet());
//		System.out.println(set);
		set2.forEach(e -> System.out.println(e));
	}
}
