package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.StudentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zl
 * create 2023-01-30-13:15
 * discription
 */
@Mapper
public interface StudentDao extends BaseMapper<StudentEntity> {
}
