package Question_1;

public class Student {
	
	private int marks;
	private int roll;
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int marks, int roll, String name) {
		super();
		this.marks = marks;
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", roll=" + roll + ", name=" + name + "]";
	}
	
	
}
