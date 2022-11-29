package com.masai.model;

public class Employee {
    
    private int empid;
    private String empname;
    private String address;
    private String mobile;
    private int did;
    
    public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", address=" + address + ", mobile=" + mobile
				+ ", did=" + did + "]";
	}

	public Employee(int empid, String empname, String address, String mobile, int did) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.address = address;
		this.mobile = mobile;
		this.did = did;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}
    
    
    
}
