package com.techbase.domain;

import com.techbase.domain.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService extends BaseService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<DepartmentEntity> getListDepartment() {
        return departmentRepository.getListDepartment();

    }
}
