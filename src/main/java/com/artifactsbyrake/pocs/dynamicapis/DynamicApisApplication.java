package com.artifactsbyrake.pocs.dynamicapis;

import com.artifactsbyrake.pocs.dynamicapis.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class DynamicApisApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DynamicApisApplication.class, args);
	}

	@Override
	public void run(String... args) {
		//Read records:
		List<Employee> emps = jdbcTemplate.query("SELECT * FROM Employee",
				(resultSet, rowNum) -> new Employee(
						resultSet.getString("EmployeeId"),
						resultSet.getString("LastName"),
						resultSet.getString("firstName")
//						resultSet.getString("EmployeeId"),
//						resultSet.getString("EmployeeId"),
//						resultSet.getString("EmployeeId"),
//						resultSet.getString("EmployeeId"),
//						resultSet.getString("EmployeeId"),
//						resultSet.getString("EmployeeId"),
//						resultSet.getString("EmployeeId"),
				)
		);

		//Print read records:
		emps.forEach(employee -> {
			System.out.printf("Employee details - id: %s, lastName: %s, firstName: %s", employee.getEmployeeId(), employee.getLastName(), employee.getFirstName());
			System.out.println();
		});
	}

}
