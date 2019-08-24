package com.example.demo.controllers;

import com.example.demo.models.Employee;

public class EmployeeController {
    private EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    public Employee getEmployee(String id) {
        return service.get(id);
    }
}
