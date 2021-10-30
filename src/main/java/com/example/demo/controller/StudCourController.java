package com.example.demo.controller;

import com.example.demo.pojo.StudCourSaveVo;
import com.example.demo.pojo.StudCourSelectVo;
import com.example.demo.service.StudCourService;
import com.example.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zl
 * create 2023-01-30-12:34
 * discription
 */
@RestController
@RequestMapping("studCour")
public class StudCourController {
    @Resource
    StudCourService studCourService;
    /**
     * 联合保存
     */
    @PostMapping("/save")
    public R save(@RequestBody StudCourSaveVo studCourSaveVo) {
        studCourService.add(studCourSaveVo);
        return R.ok();
    }

    /**
     * 查询
     */
    @GetMapping("/select/{studId}")
    public R select(@PathVariable("studId") Long studId) {
        StudCourSelectVo studCourSelectVo = studCourService.select(studId);
        return R.ok().put("studCour", studCourSelectVo);
    }
}
