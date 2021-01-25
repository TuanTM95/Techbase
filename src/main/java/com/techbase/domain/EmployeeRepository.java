package com.techbase.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
    @Query(value = "select * from Employee;",
            nativeQuery = true)
    List<EmployeeEntity> getListEmployee();
}
