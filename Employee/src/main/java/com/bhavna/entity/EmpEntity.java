package com.bhavna.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="EMP")
public class EmpEntity {
	
	@Id
	@Column(name="Id")
	Integer empId;
	
	@Column(name="Name")
	String empName;
	
	@Column(name="Age")
	Integer empAge;
	
	@Column(name="Salary")
	double empSal;
	
	@Column(name="Job_Title")
	String jobTitle;
	
	@Column(name="Gender")
	String gender;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "EmpEntity [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSal=" + empSal
				+ ", jobTitle=" + jobTitle + ", gender=" + gender + "]";
	}

}
