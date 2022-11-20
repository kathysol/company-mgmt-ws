package com.sicpa.companymgmt.service;

import com.sicpa.companymgmt.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    void deleteEmployee(Long idEmployee);

    List<Employee> findAllEmployees();
}
