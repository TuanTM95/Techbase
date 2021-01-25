package com.techbase.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Data
@Entity
public class PositionEntity {
    @Id
    @Column(name = "Position_Code")
    private Integer positionCode;

    @Column(name = "Position_Name")
    private String positionName;


}
