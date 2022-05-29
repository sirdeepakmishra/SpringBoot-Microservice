package com.micro.department.service;


import com.micro.department.entity.Department;
import com.micro.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private  DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){
        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.save(department);
    }


    public Department findByDepartmentId(Long departmentId) {
        log.info("Inside findByDepartmentId method of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}

