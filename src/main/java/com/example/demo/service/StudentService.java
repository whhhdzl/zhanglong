package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.StudentEntity;
import com.example.utils.PageUtils;

import java.util.Map;

/**
 * @author zl
 * create 2023-01-30-12:35
 * discription
 */
public interface StudentService extends IService<StudentEntity> {


    PageUtils queryPage(Map<String, Object> params, String str);
}
