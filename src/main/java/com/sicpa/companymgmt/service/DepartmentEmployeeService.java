package com.sicpa.companymgmt.service;

import com.sicpa.companymgmt.model.DepartmentEmployee;

import java.util.List;

public interface DepartmentEmployeeService {

    DepartmentEmployee saveEmployeeRepository(DepartmentEmployee departmentEmployee);

    void deleteDepartmentEmployee(Long idDepartmentEmployee);

    List<DepartmentEmployee> findAllEnterprises();
}
