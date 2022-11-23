package com.sicpa.companymgmt.util;

import com.sicpa.companymgmt.model.Department;
import com.sicpa.companymgmt.model.Enterprise;
import com.sicpa.companymgmt.vo.DepartmentVO;
import com.sicpa.companymgmt.vo.EnterpriseVO;

import java.util.ArrayList;
import java.util.Collection;

public class TransformUtil {

    public DepartmentVO transDepartmentVO(Department department){
        DepartmentVO resp= new DepartmentVO();
        if (department!=null){
            resp.setId(department.getId());
            resp.setName(department.getName());
            resp.setDescription(department.getDescription());
            resp.setPhone(department.getPhone());
            resp.setIdEnterprise(department.getIdEnterprise());

            if (department.getEnterprise()!=null){
                resp.setEnterprise(transEnterpriseVO(department.getEnterprise()));

            }else{
                resp.setEnterprise(new EnterpriseVO());
            }

            resp.setStatus(department.getStatus());
            resp.setCreatedBy(department.getCreatedBy());
            resp.setCreatedDate(department.getCreatedDate());
            resp.setModifiedBy(department.getModifiedBy());
            resp.setModifiedDate(department.getModifiedDate());

        }
        return resp;
    }

    public EnterpriseVO transEnterpriseVO(Enterprise enterprise){
       EnterpriseVO resp = new EnterpriseVO();
       if (enterprise!=null){
           resp.setId(enterprise.getId());
           resp.setName(enterprise.getName());
           resp.setAddress(enterprise.getAddress());
           resp.setPhone(enterprise.getPhone());
           Collection<DepartmentVO> departments= new ArrayList<>();
           resp.setDepartments(departments);
           resp.setStatus(enterprise.getStatus());
           resp.setCreatedBy(enterprise.getCreatedBy());
           resp.setCreatedDate(enterprise.getCreatedDate());
           resp.setModifiedBy(enterprise.getModifiedBy());
           resp.setModifiedDate(enterprise.getModifiedDate());

       }
       return resp;
    }
}
