package com.techbase.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {
    @Query(value = "select * from Department;",
            nativeQuery = true)
    List<DepartmentEntity> getListDepartment();

}