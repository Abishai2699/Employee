package com.abishai.employee; //package name

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
@RequestMapping("/employee") //path
public class EmployeeController {
	@Autowired 
	EmployeeService empRep;
	
	//To display all the records
	
	@GetMapping("/all")
	public List<Employee> getAll()
	{
		return empRep.getAll(); //Calls the getall() in EmployeeService
	}
	
	
	// To add a record
	
	@PostMapping("/add")
	public String add(@RequestBody Employee newEmp)
	{
		return empRep.add(newEmp); //Calls the add function in EmployeeService
	}
	
	
	//To delete a record
	
	@DeleteMapping("/delete/{employeeid}")
	public String delete(@PathVariable int employeeid)
	{
		return empRep.delete(employeeid); //Calls the delete function in EmployeeService
	}
	
	
	//To update a record
	
	@PutMapping("/update/{employeeid}")
	public String update(@RequestBody Employee newEmp,@PathVariable int employeeid)
	{
		return empRep.update(newEmp,employeeid); ////Calls the update function in EmployeeService
	}
	
}
