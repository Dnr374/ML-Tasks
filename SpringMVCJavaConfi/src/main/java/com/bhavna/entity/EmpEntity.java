package com.bhavna.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="EMPSTATUS")
public class EmpEntity {
	
	@Id
	@Column(name="EMPID")
	Integer empId;
	
	@Column(name="EMPNAME")
	String empName;
	
	@Column(name="EMPSAL")
	double empSal;
	
	@Column(name="DATEOFJOINING")
	String doj;
	
	@Column(name="DEPTID")
	String deptId;
	
	
	
	@Column(name="DEPTNAME")
	String deptName;
	
	@Column(name="STATUS")
	String status;
	
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
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
