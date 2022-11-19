package com.sicpa.companymgmt.service;

import com.sicpa.companymgmt.model.Enterprise;

import java.util.List;

public interface EnterpriseService {
    Enterprise saveEnterprise(Enterprise enterprise);

    void deleteEnterprise(Long idEnterprise);

    List<Enterprise> findAllEnterprises();
}
