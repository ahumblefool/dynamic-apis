package com.artifactsbyrake.pocs.dynamicapis.service;

import com.artifactsbyrake.pocs.dynamicapis.model.Employee;

import java.util.List;

/**
 * @author ahumblefool
 * Date: 2/24/22
 * Description: Default
 */
public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee createEmployee(Employee emp);
}
