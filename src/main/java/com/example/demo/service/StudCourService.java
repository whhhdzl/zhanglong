package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.StudCourEntiry;
import com.example.demo.pojo.StudCourSaveVo;
import com.example.demo.pojo.StudCourSelectVo;
import com.example.demo.service.impl.StudCourServiceImpl;

/**
 * @author zl
 * create 2023-01-30-12:37
 * discription
 */
public interface StudCourService extends IService<StudCourEntiry> {

    void removeByStudId(Long id);

    void add(StudCourSaveVo studCourSaveVo);

    StudCourSelectVo select(Long studId);
}
