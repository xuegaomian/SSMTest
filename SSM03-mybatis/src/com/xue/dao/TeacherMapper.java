package com.xue.dao;


import com.xue.po.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}