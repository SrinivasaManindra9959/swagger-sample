package com.swagger.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    public Student(){
        this.id = 1;
        this.name = "Srinivas";
    }

}
