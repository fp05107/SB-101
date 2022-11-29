package Question_2;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	
	public static void main(String[] args) {
		
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(10, "subham", 500));
		list.add(new Student(10, "subham", 480));
		list.add(new Student(10, "subham", 600));
		list.add(new Student(10, "subham", 550));
		list.add(new Student(10, "subham", 400));
		
		
	   System.out.println(list.stream().max((a,b) ->a.getMarks()>b.getMarks() ? 1 : -1));
	}
}
