package com.techbase.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jsondoc.core.annotation.ApiObjectField;

@Data
@NoArgsConstructor
public class DepartmentResponse {
    @ApiObjectField(name = "Department_Code")
    Integer Department_Code;

    @JsonProperty(value = "Department_Name")
    @ApiObjectField(name = "Department_Name")
    String Department_Name;

    @JsonProperty(value = "Department_Manager")
    @ApiObjectField(name = "Department_Manager")
    String Department_Manager;

    @JsonProperty(value = "Department_TeamNo")
    @ApiObjectField(name = "Department_TeamNo")
    String Department_TeamNo;

    public DepartmentResponse(DepartmentEntity entity) {
        this.Department_Code = entity.getDepartment_Code();
        this.Department_Name = entity.getDepartment_Name();
        this.Department_Manager  = entity.getDepartment_Manager();
        this.Department_TeamNo  = entity.getDepartment_TeamNo();

    }
}
