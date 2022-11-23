package com.sicpa.companymgmt.service;

import com.sicpa.companymgmt.model.Department;
import com.sicpa.companymgmt.vo.DepartmentVO;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    void deleteDepartment(Long idDepartment);

    List<DepartmentVO>findAllDepartments();

}
