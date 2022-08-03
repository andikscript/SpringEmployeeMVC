package com.andikscript.springemployee.service;

import com.andikscript.springemployee.model.Employee;

import java.util.List;

public interface EmployeeService {

    void saveEmployee(Employee employee);

    List<Employee> getAllEmployee();
}
