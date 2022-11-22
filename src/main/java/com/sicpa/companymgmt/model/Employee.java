package com.sicpa.companymgmt.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Table(name = "employee")
@Data
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "age_emp")
    private Integer age;

    @Column(name = "email_emp",length =100 )
    private String email;

    @Column(name = "name_emp",length =200,nullable = false)
    private String name;

    @Column(name = "position_emp",length =100)
    private String position;

    @Column(name = "surname_emp",length =100)
    private String surname;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "created_by",length =6)
    private String createdBy;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "modified_by",length =6)
    private String modifiedBy;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @OneToMany(mappedBy = "employee")
    private Collection<DepartmentEmployee> departmentEmployees;
}
