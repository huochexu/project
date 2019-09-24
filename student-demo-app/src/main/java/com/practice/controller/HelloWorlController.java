package com.practice.controller;

import com.practice.common.model.Student;
import com.practice.service.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ProjectName: student-demo
 * @Package: com.practice.controller
 * @ClassName: HelloWorlController
 * @Author: dong
 * @Description: ${description}
 * @Date: 2019/9/11 19:54
 * @Version: 1.0
 */
@RestController
@Slf4j
public class HelloWorlController {
    @Autowired(required = false)
    private StudentServiceImpl studentService;

    @RequestMapping("/all")
    public List<Student> queryAllStudent(@RequestParam String base){
        log.info("请求参数：【{}】",base);
        List<Student> students = studentService.queryAllStudents();
        if (students==null||students.size()==0)
            log.info("响应内容---姓名:【{}】,性别：【{}】,年龄：【{}】,成绩：【{}】",students.get(0).getName(),students.get(0).getSex(),students.get(0).getAge(),students.get(0).getScore());
        return students;
    }
}
