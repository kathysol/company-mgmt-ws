package com.sicpa.companymgmt.service;

import com.sicpa.companymgmt.model.DepartmentEmployee;
import com.sicpa.companymgmt.repository.DepartmentEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class DepartmentEmployeeImpl implements DepartmentEmployeeService {

    @Autowired
    private DepartmentEmployeeRepository departmentEmployeeRepository;

    public DepartmentEmployeeImpl(DepartmentEmployeeRepository departmentEmployeeRepository) {
        this.departmentEmployeeRepository = departmentEmployeeRepository;
    }

    @Override
    public DepartmentEmployee saveEmployeeRepository(DepartmentEmployee departmentEmployee){
        departmentEmployee.setCreatedDate(LocalDateTime.now());
        return departmentEmployeeRepository.save(departmentEmployee);
    }

    @Override
    public void deleteDepartmentEmployee(Long idDepartmentEmployee){
        departmentEmployeeRepository.deleteById(idDepartmentEmployee);
    }

    @Override
    public List<DepartmentEmployee> findAllEnterprises(){
        return departmentEmployeeRepository.findAll();
    }
}
