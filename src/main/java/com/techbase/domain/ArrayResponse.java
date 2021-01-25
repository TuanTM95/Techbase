package com.techbase.domain;

import java.util.ArrayList;
import java.util.List;

public class ArrayResponse {

    List<PositionResponse> dataArray1;
    List<TeamResponse> dataArray2;
    List<DepartmentResponse> dataArray3;
    List<EmployeeResponse> dataArray4;

    public APIModel setRstDataArray1(List<PositionEntity> rstDataArray1) {
        this.dataArray1 = new ArrayList<>();
        for (PositionEntity item : rstDataArray1) {
            this.dataArray1.add(new PositionResponse(item));
        }
        return null;
    }

    public APIModel setRstDataArray2(List<TeamEntity> rstDataArray2) {
        this.dataArray2 = new ArrayList<>();
        for (TeamEntity item : rstDataArray2) {
            this.dataArray2.add(new TeamResponse(item));
        }
        return null;
    }

    public APIModel setRstDataArray3(List<DepartmentEntity> rstDataArray3) {
        this.dataArray3 = new ArrayList<>();
        for (DepartmentEntity item : rstDataArray3) {
            this.dataArray3.add(new DepartmentResponse(item));
        }
        return null;
    }

    public APIModel setRstDataArray4(List<EmployeeEntity> rstDataArray4) {
        this.dataArray4 = new ArrayList<>();
        for (EmployeeEntity item : rstDataArray4) {
            this.dataArray4.add(new EmployeeResponse(item));
        }
        return null;
    }

}
