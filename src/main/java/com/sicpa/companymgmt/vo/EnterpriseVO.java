package com.sicpa.companymgmt.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnterpriseVO extends AuditBaseVO{

    private Long id;
    private String name;
    private String address;
    private String phone;
    private Collection<DepartmentVO> departments;
}
