package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream {
	
	public static void main(String[] args) {
//		List<String> list = Arrays.asList("One","Two","three","four");	
//		Stream<String> str1 = list.stream();
//		System.out.println(str1);
//		str1.forEach(e->System.out.println(e.toUpperCase()));
//		str1.forEach(e->System.out.println(e.toUpperCase()));
		
		
		List<Students> student = new ArrayList<>();
		student.add(new Students(10, "s1", 500));
		student.add(new Students(12, "s2", 320));
		student.add(new Students(9, "s3", 650));
		student.add(new Students(19, "s4", 480));
		student.add(new Students(20, "s5", 400));
		
		Stream<Students> str2 = student.stream();
		Stream<Students> str3 = str2.filter(s->s.getMarks()<500);
//		str3.forEach(e->System.out.println(e));
//		List<Students> list2 = str3.collect(Collectors.toList());
		List<Students> list2 = student.stream().filter(s->s.getMarks()<500).collect(Collectors.toList());
		System.out.println(list2);
//		student.stream().filter(s->s.getMarks()<=500).forEach(e->System.out.println(e));
	}
}
