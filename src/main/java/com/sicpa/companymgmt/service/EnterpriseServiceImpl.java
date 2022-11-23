package com.sicpa.companymgmt.service;

import com.sicpa.companymgmt.model.Enterprise;
import com.sicpa.companymgmt.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseServiceImpl implements EnterpriseService{

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    public EnterpriseServiceImpl(EnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }

    @Override
    public Enterprise saveEnterprise(Enterprise enterprise){
        if (enterprise.getId()==null){
            enterprise.setCreatedDate(LocalDateTime.now());
        }else{
            enterprise.setModifiedDate(LocalDateTime.now());
        }
      return enterpriseRepository.save(enterprise);
    }

    @Override
    public void deleteEnterprise(Long idEnterprise){
        enterpriseRepository.deleteById(idEnterprise);
    }

    @Override
    public List<Enterprise> findAllEnterprises(){
          return enterpriseRepository.findAll();
    }
    @Override
    public Optional<Enterprise> findById(Long idEnterprise){
        return enterpriseRepository.findById(idEnterprise);
    }
}
