package com.sicpa.companymgmt.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class DepartmentVO extends AuditBaseVO{

    private Long id;
    private String name;
    private String description;
    private String phone;
    private Long idEnterprise;
    private EnterpriseVO enterprise;
    private Collection<DepartmentEmployeeVO> departmentEmployees;

}
