package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.CourseEntity;
import com.example.utils.PageUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author zl
 * create 2023-01-30-12:36
 * discription
 */
public interface CourseService extends IService<CourseEntity> {

    PageUtils queryPage(Map<String, Object> params, String str);
}
