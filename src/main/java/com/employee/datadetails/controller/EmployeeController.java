package com.employee.datadetails.controller;
import com.employee.datadetails.request.EmployeeRequest;
import com.employee.datadetails.service.EmployeeServiceImpl;
import com.employee.datadetails.utility.EmployeeUtility;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("api/v1")
@Validated
public class EmployeeController {
    @Autowired private EmployeeUtility employeeUtility;
    @Autowired private EmployeeServiceImpl employeeServiceImpl;
    @PostMapping("/saveEmployee")
    public String createEmployee(@Valid @RequestBody EmployeeRequest employeeRequest) {
        employeeServiceImpl.createEmployee(employeeRequest);
        return "Record saved !";
    }
    }



































