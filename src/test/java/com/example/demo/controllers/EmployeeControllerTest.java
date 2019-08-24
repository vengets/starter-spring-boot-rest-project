package com.example.demo.controllers;

import com.example.demo.models.Employee;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {
    private EmployeeController controller;

    @Mock
    private EmployeeService service;

    @Before
    public void init() {
        controller = new EmployeeController(service);
    }

    @Test
    public void createEmployee() {
        final String id = "id";
        final var returnedEmployee = new Employee();
        when(this.service.get(id)).thenReturn(returnedEmployee);

        final Employee result = this.controller.getEmployee(id);

        assertThat(result, is(returnedEmployee));
    }
}