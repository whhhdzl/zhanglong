package com.example.demo.controller;

import com.example.demo.entity.CourseEntity;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudentService;
import com.example.utils.PageUtils;
import com.example.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author zl
 * create 2023-01-30-12:34
 * discription
 */
@RestController
@RequestMapping("course")
public class CourseController {
    @Resource
    private CourseService courseService;

    /**
     *
     */
    @PostMapping("/save")
    public R add(@RequestBody CourseEntity courseEntity) {
        courseService.save(courseEntity);
        return R.ok();
    }

    @DeleteMapping("/delete")
    public R delete(@RequestBody Long id) {
        courseService.removeById(id);
        return R.ok();
    }

    @PostMapping("/update")
    public R update(@RequestBody CourseEntity courseEntity) {
        courseService.updateById(courseEntity);
        return R.ok();
    }

    @GetMapping("/get")
    public R studentList(@RequestParam Map<String, Object> params, @RequestParam String str) {
        PageUtils page = courseService.queryPage(params, str);
        return R.ok().put("page", page);
    }
}
