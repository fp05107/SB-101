
import java.util.*;
public class Question_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeMarksComp marksComp = new EmployeeMarksComp();
		EmployeeAddressComp addressComp = new EmployeeAddressComp();
		
		int x = sc.nextInt();
		
		TreeSet<Employee> employees;
		
		if(x==1) {
			
			 employees = new TreeSet<Employee>(marksComp); 
		}else {
		     employees = new TreeSet<Employee>(addressComp); 
			
		}
		
		
		
		employees.add(new Employee(18, "Subham", "soro", 1000000));
		employees.add(new Employee(12, "Akash", "Bbsr", 1000000));
		employees.add(new Employee(13, "Sai", "markona", 1000000));
		employees.add(new Employee(14, "Soumya", "dahi", 1000000));
		employees.add(new Employee(15, "Naresh", "bhadrak", 1000000));
		employees.add(new Employee(16, "Rutu", "markona gaon", 1000000));
		
		System.out.println(employees);
		for(Employee e :employees) {
			System.out.println(e);
		}
		
		
	}
	
}

class Employee {
	private int empId;
	private String empName;
	private String address;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, String address, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address
				+ ", salary=" + salary + "]";
	}

	 
	
}



class EmployeeMarksComp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEmpId() > o2.getEmpId()) {
			return 1;
		}else if(o1.getEmpId() < o2.getEmpId()) {
			return -1;
		}
		return 0;
	}
	
	
}


class EmployeeAddressComp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o1.getAddress().compareTo(o2.getAddress());
	}
	
	
}









