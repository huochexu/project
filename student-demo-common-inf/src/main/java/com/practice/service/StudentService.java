package com.practice.service;

import com.practice.common.model.Student;

import java.util.List;

/**
 * @ProjectName: student-demo
 * @Package: com.practice.service
 * @ClassName: StudentService
 * @Author: dong
 * @Description: ${description}
 * @Date: 2019/9/11 19:18
 * @Version: 1.0
 */
public interface StudentService {
    List<Student> queryAllStudents();
}
