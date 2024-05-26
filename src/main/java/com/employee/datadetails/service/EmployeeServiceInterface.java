package com.employee.datadetails.service;
import com.employee.datadetails.entity.EmployeeEntity;
import com.employee.datadetails.request.EmployeeRequest;
import org.springframework.stereotype.Service;
@Service
public interface EmployeeServiceInterface {
    public EmployeeEntity createEmployee(EmployeeRequest employeeRequest);
}
