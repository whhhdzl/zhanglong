package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.CourseDao;
import com.example.demo.entity.CourseEntity;
import com.example.demo.service.CourseService;
import com.example.utils.PageUtils;
import com.example.utils.Query;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author zl
 * create 2023-01-30-12:37
 * discription
 */
@Service("courseService")
public class CourseServieImpl extends ServiceImpl<CourseDao, CourseEntity> implements CourseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params, String str) {
        QueryWrapper<CourseEntity> courseEntityQueryWrapper = new QueryWrapper<>();
        courseEntityQueryWrapper.like("Course_name()", str);

        IPage<CourseEntity> page = this.page(
                new Query<CourseEntity>().getPage(params),
                courseEntityQueryWrapper
        );
        return new PageUtils(page);
    }
}
