package com.andikscript.springemployee.service;

import com.andikscript.springemployee.model.Employee;
import com.andikscript.springemployee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
