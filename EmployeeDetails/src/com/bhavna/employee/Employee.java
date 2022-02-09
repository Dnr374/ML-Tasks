package com.bhavna.employee;

public class Employee {
	String empName;
	double salary;
	String location;
	public Employee(String empName, double salary, String location) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.location = location;
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "empName=" + empName + ", salary=" + salary + ", location=" + location;
	}
	
	
}
