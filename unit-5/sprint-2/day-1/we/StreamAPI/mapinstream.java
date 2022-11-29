package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapinstream {
	
	public static void main(String[] args) {
		
		List<Students> student = new ArrayList<>();
		student.add(new Students(10, "s1", 500));
		student.add(new Students(12, "s2", 320));
		student.add(new Students(9, "s3", 650));
		student.add(new Students(19, "s4", 480));
		student.add(new Students(20, "s5", 400));
		
		Stream<Students> str1 = student.stream();
		Stream<Students> str2 = str1.map(s ->{
			Students s2 = new Students(s.getRoll(), s.getName(), s.getMarks()+300);
			return s2;
		});
		
		List<Students> list2 =  str2.collect(Collectors.toList());
		System.out.println(list2);
		
	}
}
