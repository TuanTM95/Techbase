package com.techbase.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Data
@Entity
public class EmployeeEntity {
    @Id
    @Column(name = "Employee_Code")
    private Integer Employee_Code;

    @Column(name = "Employee_Fullname")
    private String Employee_Fullname;

    @Column(name = "Employee_Gender")
    private Boolean Employee_Gender;

    @Column(name = "Employee_Address")
    private String Employee_Address;

    @Column(name = "Employee_DateOfBirth")
    private Date Employee_DateOfBirth;

    @Column(name = "Employee_PhoneNumber")
    private String Employee_PhoneNumber;

    @Column(name = "Employee_TeamNo")
    private Integer Employee_TeamNo;
}
