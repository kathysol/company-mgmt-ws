package com.sicpa.companymgmt.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentEmployeeVO extends AuditBaseVO {

    private Long id;
}
