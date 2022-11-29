package Question_1;

import java.util.function.Supplier;

public class MySupplier {
	
	public static void main(String[] args) {
		
		Supplier<Student> s2 = () -> new Student(480,11,"subham");
		System.out.println(s2.get().getName());
		System.out.println(s2.get().getMarks());
		System.out.println(s2.get().getRoll());
	}
}
