package com.project.springbootcrudapplication;

import com.project.springbootcrudapplication.model.Employee;
import com.project.springbootcrudapplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
/*		Employee emp1 = new Employee();
		emp1.setFirstName("Chirag");
		emp1.setLastName("Jain");
		emp1.setEmailId("chirag@mail.com");
		employeeRepository.save(emp1);

		Employee emp2 = new Employee();
		emp2.setFirstName("Abc");
		emp2.setLastName("Def");
		emp2.setEmailId("abc@mail.com");
		employeeRepository.save(emp2);*/


	}
}
