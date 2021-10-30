package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zl
 * create 2023-01-30-12:23
 * discription
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudCourEntiry {
    private Long id;

    private Long studId;

    private Long courId;
}
