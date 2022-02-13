package com.zgm.service;

import com.zgm.dao.StudentDao;
import com.zgm.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:StudentServiceImpl
 * package:com.zgm.service
 * Description:
 *
 * @Date:2022/1/18 0018 20:08
 * @Author:zgm3331529718@qq.com
 */
@Service
public class StudentServiceImpl implements StudentService {
    //引用类型自动注入@Autowired或者@Resource
    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudents() {
        return studentDao.selectStudents();
    }
}






















