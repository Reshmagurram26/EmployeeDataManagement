package com.employee.datadetails.service;
import com.employee.datadetails.request.EmployeeRequest;
import com.employee.datadetails.utility.EmployeeUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.datadetails.repository.EmployeeRepository;
import com.employee.datadetails.entity.EmployeeEntity;
@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {
	@Autowired private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public EmployeeEntity createEmployee(EmployeeRequest employeeRequest) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setCountry(employeeRequest.getCountry());
        employeeEntity.setCity(employeeRequest.getCity());
        employeeEntity.setZipcode(employeeRequest.getZipcode());
        employeeEntity.setApt(employeeRequest.getApt());
        employeeEntity.setAddressLineOne(employeeRequest.getAddressLineOne());
        employeeEntity.setEnrollmentNumber(employeeRequest.getEnrollmentNumber());
        employeeEntity.setFirstName(employeeRequest.getFirstName());
        employeeEntity.setLastName(employeeRequest.getLastName());
        EmployeeUtility utility= new EmployeeUtility();
        String stateName = employeeRequest.getState();
        String stateCode= utility.convertSatenameToStatecode(stateName);
        employeeEntity.setState(stateCode);
        return  employeeRepository.save(employeeEntity);
    }
}
