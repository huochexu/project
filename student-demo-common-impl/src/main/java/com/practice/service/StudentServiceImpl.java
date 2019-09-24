package com.practice.service;

import com.practice.common.mapper.StudentMapper;
import com.practice.common.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: student-demo
 * @Package: com.practice.service
 * @ClassName: StudentServiceImpl
 * @Author: dong
 * @Description: ${description}
 * @Date: 2019/9/11 19:17
 * @Version: 1.0
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired(required = false)
    private StudentMapper studentMapper;
    @Override
    public List<Student> queryAllStudents() {
        return studentMapper.selectAll();
    }
}
