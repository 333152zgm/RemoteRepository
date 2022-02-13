package com.zgm.vo;

/**
 * ClassName:Student
 * package:com.zgm.vo
 * Description:
 *
 * @Date:2022/1/17 0017 21:19
 * @Author:zgm3331529718@qq.com
 */
public class Student {
    //属性名和参数名一样
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

















