package com.sicpa.companymgmt.service;

import com.sicpa.companymgmt.model.Enterprise;

import java.util.List;
import java.util.Optional;

public interface EnterpriseService {
    Enterprise saveEnterprise(Enterprise enterprise);

    void deleteEnterprise(Long idEnterprise);

    List<Enterprise> findAllEnterprises();

    Optional<Enterprise> findById(Long idEnterprise);
}
