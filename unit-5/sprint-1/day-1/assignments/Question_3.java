import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Question_3 {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(10, 80, "saba", "ghar"));
		list.add(new Student(12, 90, "bhagia", "mars"));
		list.add(new Student(20, 60, "suman", "unknown"));
		list.add(new Student(15, 70, "rutu", "Markona"));
		list.add(new Student(19, 20, "subham", "Soro"));
		list.add(new Student(19, 20, "subham", "Soro"));
		list.add(new Student(30, 20, "aubha", "poro"));
		list.add(new Student(32, 20, "bara", "poro"));
		list.add(new Student(33, 20, "a", "poro"));
		
		Set<Student> set = new TreeSet<>(list);
		
		List<Student> myList = new ArrayList<>(set);
		System.out.println(myList.size());
		
		for(Student s:myList) {
			System.out.println(s);
		}
	}

}

class Student implements Comparable{
	private int roll;
	private int marks;
	private String name;
	private String address;
	public Student(int roll, int marks, String name, String address) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
		this.address = address;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + ", name=" + name + ", address=" + address + "]";
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, marks, name, roll);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && marks == other.marks && Objects.equals(name, other.name)
				&& roll == other.roll;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s1 = this;
		Student s2 = (Student) o;
		if(s1.getMarks() > s2.getMarks()) {
			return 1;
		}if(s1.getMarks() < s2.getMarks()) {
			return -1;
		}
		return s1.getName().compareTo(s2.getName());
	}
	
	
	
}