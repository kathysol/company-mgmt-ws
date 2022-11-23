package com.sicpa.companymgmt.service;

import com.sicpa.companymgmt.model.Department;
import com.sicpa.companymgmt.model.Enterprise;
import com.sicpa.companymgmt.repository.DepartmentRepository;
import com.sicpa.companymgmt.util.TransformUtil;
import com.sicpa.companymgmt.vo.DepartmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private EnterpriseService enterpriseService;

    private TransformUtil transformUtil;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository, EnterpriseService enterpriseService){
        this.departmentRepository=departmentRepository;
        this.enterpriseService = enterpriseService;
        this.transformUtil=  new TransformUtil();
    }

    @Override
    public Department saveDepartment(Department department){
        if (department!=null){

            if (department.getId()==null){
                department.setCreatedDate(LocalDateTime.now());

            }else{
                department.setModifiedDate(LocalDateTime.now());
            }
            department.setEnterprise(null);
        }

        return departmentRepository.save(department);
    }

    @Override
    public void deleteDepartment(Long idDepartment){
        departmentRepository.deleteById(idDepartment);
    }

    @Override
    public List<DepartmentVO> findAllDepartments(){
        List<Department> departmentList= departmentRepository.findAll();

        List<DepartmentVO> departmentListVO= new ArrayList<>();

        if (!CollectionUtils.isEmpty(departmentList)){
            departmentList.forEach((dep) -> {

                Optional<Enterprise> opEnterprise= enterpriseService.findById(dep.getIdEnterprise());
                if (opEnterprise.isPresent()){
                    dep.setEnterprise(opEnterprise.get());
                    departmentListVO.add(this.transformUtil.transDepartmentVO(dep));

                }


            });
        }

        return departmentListVO;
    }
}
