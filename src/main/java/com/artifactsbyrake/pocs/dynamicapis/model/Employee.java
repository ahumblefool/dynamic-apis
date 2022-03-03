package com.artifactsbyrake.pocs.dynamicapis.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ahumblefool
 * Date: 2/24/22
 * Description: Default
 */
@Getter
@Setter
@NoArgsConstructor
public class Employee {
    private String employeeId;
    private String lastName;
    private String firstName;
    private String title;
    private String birthDate;
    private String hireDate;
    private String phone;
    private String email;
    private String state;
    private String country;

    public Employee(String employeeId, String lastName, String firstName, String title, String birthDate, String hireDate, String phone, String email, String state, String country) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.phone = phone;
        this.email = email;
        this.state = state;
        this.country = country;
    }

    public Employee(String employeeId, String lastName, String firstName) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
