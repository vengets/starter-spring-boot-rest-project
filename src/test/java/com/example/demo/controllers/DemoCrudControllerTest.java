package com.example.demo.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class DemoCrudControllerTest {
    private DemoCrudController controller;

    @Before
    public void init() {
        controller = new DemoCrudController();
    }

    @Test
    public void shouldGetHelloWorld() {
        final var result = controller.get();

        assertEquals(result, "Hello world");
    }

}