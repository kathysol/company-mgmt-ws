package com.sicpa.companymgmt.repository;

import com.sicpa.companymgmt.model.DepartmentEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentEmployeeRepository extends JpaRepository<DepartmentEmployee,Long> {
}
