package com.xue.dao;


import com.xue.po.Student;

public interface StudentMapper {
    int insertStudent(Student student)throws Exception;

    Student selectOneById(int id)throws Exception;

    //List<Student> seleceAllGoods()throws Exception;
}
