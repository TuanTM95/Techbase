package com.techbase.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Data
@Entity
public class DepartmentEntity {
    @Id
    @Column(name = "Department_Code")
    private Integer Department_Code;

    @Column(name = "Department_Name")
    private String Department_Name;

    @Column(name = "Department_Manager")
    private String Department_Manager;

    @Column(name = "Department_TeamNo")
    private String Department_TeamNo;


}
