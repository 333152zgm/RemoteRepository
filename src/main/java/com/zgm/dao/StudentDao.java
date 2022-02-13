package com.zgm.dao;

import com.zgm.domain.Student;

import java.util.List;

/**
 * ClassName:StudentDao
 * package:com.zgm.dao
 * Description:
 *
 * @Date:2022/1/18 0018 19:59
 * @Author:zgm3331529718@qq.com
 */
public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudents();
}























