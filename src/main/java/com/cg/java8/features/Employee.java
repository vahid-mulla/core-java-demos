package com.cg.java8.features;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    String name;
    String department;
    Integer age;
    Integer salary;
    String gender;
}
