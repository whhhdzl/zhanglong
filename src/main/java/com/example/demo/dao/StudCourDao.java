package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.StudCourEntiry;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zl
 * create 2023-01-30-13:16
 * discription
 */
@Mapper
public interface StudCourDao extends BaseMapper<StudCourEntiry> {
}
