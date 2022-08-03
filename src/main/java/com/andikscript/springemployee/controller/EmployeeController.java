package com.andikscript.springemployee.controller;

import com.andikscript.springemployee.model.Employee;
import com.andikscript.springemployee.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/")
    public String index(Model model){
        model.addAttribute("list", employeeService.getAllEmployee());
        return "index";
    }

    @GetMapping(value = "/save")
    public String getSaveEmployee() {
        return "save";
    }

    @PostMapping(value = "/add")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "save";
    }
}
