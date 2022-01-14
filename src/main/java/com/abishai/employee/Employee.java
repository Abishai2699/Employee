package com.abishai.employee;

public class Employee {
	
	//Created a class Employee with new attributes
	private String name;

	private String dateofbirth ;

	private String dateofjoining;

	private Double salary;
	private String enterpriseid;
	private Integer employeeid;
	
	//constructor without arguments
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructor with arguments
	public Employee(String name, String dateofbirth, String dateofjoining, Double salary, String enterpriseid,
			Integer employeeid) {
		super();
		this.name = name;
		this.dateofbirth = dateofbirth;
		this.dateofjoining = dateofjoining;
		this.salary = salary;
		this.enterpriseid = enterpriseid;
		this.employeeid = employeeid;
	}
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getDateofjoining() {
		return dateofjoining;
	}
	public void setDateofjoining(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getEnterpriseid() {
		return enterpriseid;
	}
	public void setEnterpriseid(String enterpriseid) {
		this.enterpriseid = enterpriseid;
	}
	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	
}
	
	