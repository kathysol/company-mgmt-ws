package com.sicpa.companymgmt.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "enterprise")
@Data
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_ent",length =100,nullable = false )
    private String name;

    @Column(name = "address_ent",length =200)
    private String address;

    @Column(name = "phone_ent",length =10)
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

}
