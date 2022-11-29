package Question_1;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student t) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(500, 10, "Root");
		Consumer<Student> c1 = s->{
			System.out.println(s.getMarks());
			System.out.println(s.getName());
			System.out.println(s.getRoll());
		};
	}

}
