package com.himanshu.SpringCRUDByMe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.himanshu.SpringCRUDByMe.model.Employee;
import com.himanshu.SpringCRUDByMe.repository.EmployeeRespository;

@SpringBootApplication
public class SpringCrudByMeApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudByMeApplication.class, args);
	}

	@Autowired
	private EmployeeRespository employeeRespository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.setFirstName("Himanshu");
		emp.setLastName("Suman");
		emp.setEmailId("himanshu@gmail.com");
		employeeRespository.save(emp);
		
		Employee emp1 = new Employee();
		emp1.setFirstName("Naveen");
		emp1.setLastName("Sharma");
		emp1.setEmailId("naveen@gmail.com");
		employeeRespository.save(emp1);
	
	}

}
