package com.example.demo.repository;

import com.example.demo.models.Employee;
import org.springframework.data.repository.CrudRepository;

public abstract class EmployeeRepository implements CrudRepository<Employee, String> {
}
