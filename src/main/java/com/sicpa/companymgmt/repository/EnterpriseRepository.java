package com.sicpa.companymgmt.repository;

import com.sicpa.companymgmt.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseRepository extends JpaRepository<Enterprise,Long> {
}
