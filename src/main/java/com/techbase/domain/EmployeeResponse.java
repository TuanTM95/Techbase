package com.techbase.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jsondoc.core.annotation.ApiObjectField;

import java.util.Date;

@Data
@NoArgsConstructor
public class EmployeeResponse {
    @ApiObjectField(name = "Employee_Code")
    Integer Employee_Code;

    @JsonProperty(value = "Employee_Fullname")
    @ApiObjectField(name = "Employee_Fullname")
    String Employee_Fullname;

    @JsonProperty(value = "Employee_Gender")
    @ApiObjectField(name = "Employee_Gender")
    Boolean Employee_Gender;

    @JsonProperty(value = "Employee_Address")
    @ApiObjectField(name = "Employee_Address")
    String Employee_Address;

    @JsonProperty(value = "Employee_DateOfBirth")
    @ApiObjectField(name = "Employee_DateOfBirth")
    Date Employee_DateOfBirth;

    @JsonProperty(value = "Employee_PhoneNumber")
    @ApiObjectField(name = "Employee_PhoneNumber")
    String Employee_PhoneNumber;

    @JsonProperty(value = "Employee_TeamNo")
    @ApiObjectField(name = "Employee_TeamNo")
    Integer Employee_TeamNo;

    public EmployeeResponse(EmployeeEntity entity) {
        this.Employee_Code = entity.getEmployee_Code();
        this.Employee_Fullname = entity.getEmployee_Fullname();
        this.Employee_Gender  = entity.getEmployee_Gender();
        this.Employee_Address  = entity.getEmployee_Address();
        this.Employee_DateOfBirth = entity.getEmployee_DateOfBirth();
        this.Employee_PhoneNumber  = entity.getEmployee_PhoneNumber();
        this.Employee_TeamNo  = entity.getEmployee_TeamNo();

    }
}
