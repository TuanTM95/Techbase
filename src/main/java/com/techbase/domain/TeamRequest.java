package com.techbase.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jsondoc.core.annotation.ApiObjectField;

public class TeamRequest {
    @JsonProperty("Team_Code")
    @ApiObjectField(name = "Team_Code")
    Integer Team_Code;

    @JsonProperty("Team_Name")
    @ApiObjectField(name = "Team_Name")
    String Team_Name;

    @JsonProperty("Team_ProjectName")
    @ApiObjectField(name = "Team_ProjectName")
    String Team_ProjectName;
}