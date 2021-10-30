package com.example.demo.controller;

import com.alibaba.druid.sql.PagerUtils;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudCourService;
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
@RequestMapping("student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @Resource
    private StudCourService studCourService;
    /**
     * 添加student
     */
    @PostMapping("/save")
    public R add(@RequestBody StudentEntity student) {
        studentService.save(student);
        return R.ok();
    }

    @DeleteMapping("/remove")
    public R delete(@RequestBody Long id) {
        studentService.removeById(id);
        studCourService.removeByStudId(id);
        return R.ok();
    }

    @PostMapping("/update")
    public R update(@RequestBody StudentEntity studentEntity) {
        studentService.updateById(studentEntity);
        return R.ok();
    }

    /**
     * 查询
     */
    @GetMapping("/getStudentList")
    public R studentList(@RequestParam Map<String, Object> params, @RequestParam String str) {
        PageUtils page = studentService.queryPage(params, str);
        return R.ok().put("page", page);
    }
}
