package com.psl.bean;

import java.util.*;

public class Employee  {

	public Employee(int empId, String empName, int empSal) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	int empId;
	String empName;
	int empSal;
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
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
}