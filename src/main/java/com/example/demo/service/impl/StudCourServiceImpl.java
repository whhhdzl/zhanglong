package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.StudCourDao;
import com.example.demo.entity.CourseEntity;
import com.example.demo.entity.StudCourEntiry;
import com.example.demo.entity.StudentEntity;
import com.example.demo.pojo.StudCourSaveVo;
import com.example.demo.pojo.StudCourSelectVo;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudCourService;
import com.example.demo.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zl
 * create 2023-01-30-12:38
 * discription
 */
@Service("studCourService")
public class StudCourServiceImpl extends ServiceImpl<StudCourDao, StudCourEntiry> implements StudCourService {

    @Resource
    private StudCourDao studCourDao;

    @Resource
    private StudentService studentService;

    @Resource
    private StudCourService studCourService;

    @Resource
    private CourseService courseService;


    @Override
    public void removeByStudId(Long id) {
        baseMapper.delete(new QueryWrapper<StudCourEntiry>().eq("stud_id", id));
    }

    @Override
    public void add(StudCourSaveVo studCourSaveVo) {
        StudCourEntiry studCour = studCourDao.selectOne(new QueryWrapper<StudCourEntiry>()
                .eq("cour_id", studCourSaveVo.getCourId().toString())
                .eq("stud_id", studCourSaveVo.getStudId().toString())
        );
        if (studCour == null) {
            BeanUtils.copyProperties(studCourSaveVo, studCour);
            baseMapper.insert(studCour);
        }
    }

    @Override
    public StudCourSelectVo select(Long studId) {
        StudCourSelectVo studCourSelectVo = new StudCourSelectVo();
        StudCourEntiry studCour = studCourService.getOne(new QueryWrapper<StudCourEntiry>().eq("stud_id", studId));
        studCourSelectVo.setStudentEntity(studentService.getById(studId));
        List<CourseEntity> courseEntities = courseService.getBaseMapper().selectList(new QueryWrapper<CourseEntity>().eq("id", studCour.getCourId()));
        studCourSelectVo.setCourseEntities(courseEntities);
        return studCourSelectVo;
    }
}
