package com.techbase.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jsondoc.core.annotation.ApiObjectField;

@Data
@NoArgsConstructor
public class PositionResponse {

    @JsonProperty(value = "Position_Code")
    @ApiObjectField(name = "Position_Code")
    Integer Position_Code;

    @JsonProperty(value = "Position_Name")
    @ApiObjectField(name = "Position_Name")
    String Position_Name;

    public PositionResponse(PositionEntity entity) {
        this.Position_Code = entity.getPositionCode();
        this.Position_Name = entity.getPositionName();

    }

}