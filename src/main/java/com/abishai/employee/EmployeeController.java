package com.abishai.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empRep;
	
	//To display all the records
	@GetMapping("/all")
	public List<Employee> getAll()
	{
		return empRep.getAll();
	}
	
	// To add a record
	@PostMapping("/add")
	public String add(@RequestBody Employee newEmp)
	{
		return empRep.add(newEmp);
	}
	
	//To delete a record
	@DeleteMapping("/delete/{employeeid}")
	public String delete(@PathVariable int employeeid)
	{
		return empRep.delete(employeeid);
	}
	
	
	//To update a record
	@PutMapping("/update/{employeeid}")
	public String update(@RequestBody Employee newEmp,@PathVariable int employeeid)
	{
		return empRep.update(newEmp,employeeid);
	}
	
	
	


}
