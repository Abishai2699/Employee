package com.abishai.employee;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {
	
	@Autowired //to connect EmpRepository and EmployeeApplication
	EmployeeService rep;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Employee e1 = new Employee("Raj","1994-08-09","2020-09-27",80000.00,"raju@abc.com",12345);//passing values for the object e1
		Employee e2 = new Employee("Jai","1999-04-08","2020-09-29",80000.00,"jai@abc.com",123456);//passing values for the object e2
		
		rep.employee.addAll(Arrays.asList(e1,e2));// adds employee details in employee list
		
	}
	
	
	
	
	
}
