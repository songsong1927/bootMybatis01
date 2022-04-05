package com.songsong.controller;

import com.songsong.bean.Student;
import com.songsong.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/query")
    @ResponseBody
    public String queryStudent(Integer id){
        Student student = studentService.queryStudent(id);
        return student.toString();
    }
}
