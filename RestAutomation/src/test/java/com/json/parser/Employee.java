package com.json.parser;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(value = {
		"name",
		"salary",
		"empNo"
})
public class Employee {

	int empNo;
	int salary;
	String name;
	public Employee(String name, int salary, int empNo) {
		super();
		this.empNo = empNo;
		this.salary = salary;
		this.name = name;
	}
	public Employee() {}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
