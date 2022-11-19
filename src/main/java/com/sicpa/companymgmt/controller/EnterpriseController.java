package com.sicpa.companymgmt.controller;

import com.sicpa.companymgmt.model.Enterprise;
import com.sicpa.companymgmt.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;

    @PostMapping
    public ResponseEntity<Object> saveEnterprise(@RequestBody Enterprise enterprise){

        return new ResponseEntity<>(enterpriseService.saveEnterprise(enterprise), HttpStatus.CREATED);
    }

    @DeleteMapping("{idInmueble}")
    public ResponseEntity<Object> deleteEnterprise(@PathVariable Long idInmueble){

        enterpriseService.deleteEnterprise(idInmueble);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Object> getAllEnterprises(){
            return ResponseEntity.ok(enterpriseService.findAllEnterprises());
    }
}
