package com.techbase.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class APIModel {
    public static final String SUCCESS = "SUCCESS";
    public static final String VERSION = "V1.0";

    String Cd;
    String Ver;

}
