package com.sicpa.companymgmt.service;

import com.sicpa.companymgmt.model.Department;
import com.sicpa.companymgmt.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository){
        this.departmentRepository=departmentRepository;

    }

    @Override
    public Department saveDepartment(Department department){
        department.setCreatedDate(LocalDateTime.now());
        return departmentRepository.save(department);
    }

    @Override
    public void deleteDepartment(Long idDepartment){
        departmentRepository.deleteById(idDepartment);
    }

    @Override
    public List<Department> findAllDepartments(){
        return departmentRepository.findAll();
    }
}
