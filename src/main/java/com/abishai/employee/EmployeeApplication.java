package com.abishai.employee; //package name

//
import java.util.Arrays;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {
	
	@Autowired //to connect EmployeeService and EmployeeApplication
	EmployeeService rep;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Employee e1 = new Employee("Vikram", "1987/08/09", "2020/06/27", 90000.00, "vikram@abc.com", 567);   //passing values for the object e1
		Employee e2 = new Employee("Kamal", "1995/04/08", "2020/09/29", 60000.00, "Kamal@abc.com", 789);  //passing values for the object e2
		
		rep.employee.addAll(Arrays.asList(e1,e2));  // adds employee details in employee list
		
	}
	
	
	
	
	
}
