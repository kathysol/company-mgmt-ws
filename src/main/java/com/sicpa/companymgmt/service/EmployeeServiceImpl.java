package com.sicpa.companymgmt.service;

import com.sicpa.companymgmt.model.Employee;
import com.sicpa.companymgmt.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public Employee saveEmployee(Employee employee){
        employee.setCreatedDate(LocalDateTime.now());
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long idEmployee){
        employeeRepository.deleteById(idEmployee);
    }

    @Override
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

}
