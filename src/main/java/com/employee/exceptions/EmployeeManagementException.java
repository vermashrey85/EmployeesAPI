package com.employee.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeManagementException {

    @ExceptionHandler(Exception.class)
    public void handleException(){
        System.out.println("An error occured in Employee Management App!");
    }
}
