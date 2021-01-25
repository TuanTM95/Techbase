package com.techbase.domain;

import com.techbase.domain.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService extends BaseService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeEntity> getListEmployee() {
        return employeeRepository.getListEmployee();

    }
}
