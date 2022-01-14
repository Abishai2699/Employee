package com.abishai.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class EmployeeService {
	public List<Employee>employee=new ArrayList<Employee>();

	//Displaying all the records in the list
	public List<Employee> getAll() {
		
		return employee;
	}
	
	
	//Addition of a new record
	public String add(Employee newEmp)
	{
		employee.add(newEmp);
		return "sucessfully added";
	}
	
	
	//Deletion of a record
	public String delete(int employeeid) 
	{
		employee=employee.stream().filter(e->e.getEmployeeid()!=employeeid).collect(Collectors.toList());
		return "Record Deleted";
	}
	
	
	//Updation of a record
	public String update(Employee newEmp, int employeeid)
	{
		employee.stream().map(e->{
			if(e.getEmployeeid()==employeeid)
			{
				e.setName(newEmp.getName());
				e.setEnterpriseid(newEmp.getEnterpriseid());
			}
			return e;
		}).collect(Collectors.toList());
		
		return "Record Updated";
	}

	

	


	
}
	
	

	


