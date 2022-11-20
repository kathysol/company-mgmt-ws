package com.sicpa.companymgmt.repository;

import com.sicpa.companymgmt.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository  extends JpaRepository<Department,Long> {
}
