package com.sicpa.companymgmt.controller;

import com.sicpa.companymgmt.model.Department;
import com.sicpa.companymgmt.service.DepartmentService;
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
@RequestMapping("api/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Object> saveDepartment(@RequestBody Department department){

        return new ResponseEntity<>(departmentService.saveDepartment(department), HttpStatus.CREATED);
    }

    @DeleteMapping("{idDepartment}")
    public ResponseEntity<Object> deleteDepartment(@PathVariable Long idDepartment){

        departmentService.deleteDepartment(idDepartment);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Object> getAllDepartments(){
        return ResponseEntity.ok(departmentService.findAllDepartments());
    }
}
