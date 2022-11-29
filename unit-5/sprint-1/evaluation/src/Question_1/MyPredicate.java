package Question_1;

import java.util.function.Predicate;

public class MyPredicate{

	
	public static void main(String[] args) {
		
		Student s1 = new Student(480, 12, "Subham");
		Student s2 = new Student(580, 12, "Subham");
		Predicate<Student> p1 = (s)->s.getMarks()<500;
		
		boolean x = p1.test(s1);
		System.out.println(x);
		
	}

	

}
