package com.aparna.Employee_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {

	int empId;
	String empName;
	@Autowired
	Department dpt;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, Department dpt) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dpt = dpt;
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
	public Department getDpt() {
		return dpt;
	}
	public void setDpt(Department dpt) {
		this.dpt = dpt;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dpt=" + dpt + "]";
	}
	
}
