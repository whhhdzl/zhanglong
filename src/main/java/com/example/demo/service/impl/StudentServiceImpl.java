package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.StudentDao;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import com.example.utils.PageUtils;
import com.example.utils.Query;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author zl
 * create 2023-01-30-12:38
 * discription
 */
@Service("studentService")
public class StudentServiceImpl extends ServiceImpl<StudentDao, StudentEntity> implements StudentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params, String str) {
        QueryWrapper<StudentEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("stud_name", str)
                .or().eq("sex", str)
                .or().eq("grade", str);
        IPage<StudentEntity> page = this.page(
                new Query<StudentEntity>().getPage(params),
                queryWrapper
        );
        return new PageUtils(page);
    }

}
