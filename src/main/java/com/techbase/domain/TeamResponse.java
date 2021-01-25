package com.techbase.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jsondoc.core.annotation.ApiObjectField;

@Data
@NoArgsConstructor
public class TeamResponse {
    @ApiObjectField(name = "Team_Code")
    Integer Team_Code;

    @JsonProperty(value = "Team_Name")
    @ApiObjectField(name = "Team_Name")
    String Team_Name;

    @JsonProperty(value = "Team_ProjectName")
    @ApiObjectField(name = "Team_ProjectName")
    String Team_ProjectName;

    public TeamResponse(TeamEntity entity) {
        this.Team_Code = entity.getTeam_Code();
        this.Team_Name = entity.getTeam_Name();
        this.Team_ProjectName  = entity.getTeam_ProjectName();

    }
}
