package com.sicpa.companymgmt.controller;

import com.sicpa.companymgmt.model.DepartmentEmployee;
import com.sicpa.companymgmt.service.DepartmentEmployeeService;
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
@RequestMapping("api/departmentEmployee")
public class DepartmentEmployeeController {

    @Autowired
    public DepartmentEmployeeService departmentEmployeeService;

    @PostMapping
    public ResponseEntity<Object> saveEnterprise(@RequestBody DepartmentEmployee departmentEmployee){

        return new ResponseEntity<>(departmentEmployeeService.saveDepartmentEmployee(departmentEmployee), HttpStatus.CREATED);
    }

    @DeleteMapping("{idInmueble}")
    public ResponseEntity<Object> deleteEnterprise(@PathVariable Long idDepartmentEmployee){

        departmentEmployeeService.deleteDepartmentEmployee(idDepartmentEmployee);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Object> getAllEnterprises(){
        return ResponseEntity.ok(departmentEmployeeService.findAllDepartmentEmployees());
    }

}
