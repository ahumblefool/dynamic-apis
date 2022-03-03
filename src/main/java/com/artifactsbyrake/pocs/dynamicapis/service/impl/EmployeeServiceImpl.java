package com.artifactsbyrake.pocs.dynamicapis.service.impl;

import com.artifactsbyrake.pocs.dynamicapis.model.Employee;
import com.artifactsbyrake.pocs.dynamicapis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author ahumblefool
 * Date: 3/1/22
 * Description: Default
 */
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Employee> getAllEmployees() {
        //Read records:
        List<Employee> emps = jdbcTemplate.query("SELECT * FROM Employee",
                (resultSet, rowNum) -> new Employee(
                        resultSet.getString("EmployeeId"),
                        resultSet.getString("LastName"),
                        resultSet.getString("FirstName"),
						resultSet.getString("title"),
						resultSet.getString("birthDate"),
						resultSet.getString("hireDate"),
						resultSet.getString("phone"),
						resultSet.getString("email"),
						resultSet.getString("state"),
						resultSet.getString("country")
                )
        );

        return emps;
    }

    @Override
    public Employee createEmployee(Employee emp) {
        return null;
    }
}
