package com.xue.service;

import com.xue.dao.TeacherMapper;
import com.xue.po.Teacher;
import org.springframework.beans.factory.annotation.Autowired;

public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public int creatTeacher(Teacher teacher) {
        teacherMapper.insertSelective(teacher);
        return 0;
    }
}
