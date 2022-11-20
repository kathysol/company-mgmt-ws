package com.sicpa.companymgmt.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "department")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_dep",length =100,nullable = false )
    private String name;

    @Column(name = "description_dep",length =500)
    private String description;

    @Column(name = "phone_dep",length =10)
    private String phone;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_enterprise", referencedColumnName = "id", insertable = false, updatable = false)
    private Enterprise enterprise;
}
