package com.zgm.service;

import com.zgm.domain.Student;

import java.util.List;

/**
 * ClassName:StudentService
 * package:com.zgm.service
 * Description:
 *
 * @Date:2022/1/18 0018 20:06
 * @Author:zgm3331529718@qq.com
 */
public interface StudentService {
    int addStudent(Student student);
    List<Student> findStudents();
}
























