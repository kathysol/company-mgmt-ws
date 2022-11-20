package com.sicpa.companymgmt.repository;

import com.sicpa.companymgmt.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
