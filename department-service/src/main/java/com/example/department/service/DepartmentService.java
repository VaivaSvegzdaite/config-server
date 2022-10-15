package com.example.department.service;

import com.example.department.entity.Department;
import com.example.department.repo.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartments of DepartmentsService");
        return departmentRepo.save(department);
    }

    public Department findByDepartmentId(Long departmentId) {
        log.info("Inside findDepartmentById of DepartmentsService");
        return departmentRepo.findByDepartmentId(departmentId);
    }

}
