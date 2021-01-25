package com.techbase.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jsondoc.core.annotation.ApiObjectField;

public class PositionRequest {
    @JsonProperty("Position_Code")
    @ApiObjectField(name = "Position_Code")
    Integer Position_Code;

    @JsonProperty("Position_Name")
    @ApiObjectField(name = "Position_Name")
    String Position_Name;
}
