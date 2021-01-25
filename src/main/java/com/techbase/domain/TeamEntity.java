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
public class TeamEntity {

    @Id
    @Column(name = "Team_Code")
    private Integer Team_Code;

    @Column(name = "Team_Name")
    private String Team_Name;

    @Column(name = "Team_ProjectName")
    private String Team_ProjectName;

}
