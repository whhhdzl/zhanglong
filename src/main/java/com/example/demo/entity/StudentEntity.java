package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zl
 * create 2023-01-30-12:22
 * discription
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
    private Long id;

    private String studName;

    private Integer sex;

    private Integer grade;
}
