package com.artifactsbyrake.pocs.dynamicapis.controller.base;

import com.artifactsbyrake.pocs.dynamicapis.model.Employee;
import com.artifactsbyrake.pocs.dynamicapis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author ahumblefool
 * Date: 2/25/22
 * Description: Default
 */
public class EmpBaseController {

    @Autowired
    EmployeeService employeeService;

    public ResponseEntity getAllEmps() {
        List<Employee> emps = null;
        try {
            emps = employeeService.getAllEmployees();
        } catch (Exception e) {
            System.out.println("Failed to fetch emps - " + e.getMessage());
            return ResponseEntity.internalServerError().body("Unable to fetch emps. Pls try later");
        }
        return ResponseEntity.ok(emps);
    }

}
