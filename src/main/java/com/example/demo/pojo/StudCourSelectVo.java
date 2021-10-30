package com.example.demo.pojo;

import com.example.demo.entity.CourseEntity;
import com.example.demo.entity.StudentEntity;
import lombok.Data;

import java.util.List;

/**
 * @author zl
 * create 2023-01-30-17:51
 * discription
 */
@Data
public class StudCourSelectVo {
    private StudentEntity studentEntity;

    private List<CourseEntity> courseEntities;
}
