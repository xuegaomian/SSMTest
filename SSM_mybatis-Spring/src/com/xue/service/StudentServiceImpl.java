package com.xue.service;

import com.xue.dao.StudentMapper;
import com.xue.po.Student;
import com.xue.po.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;
    private TeacherService teacherService;

    @Transactional
    @Override
    public int creatStudent(Student student) {
        /*测试事务*/
        studentMapper.insertSelective(student);
        Teacher teacher=new Teacher();
        teacher.setTid(3);
        teacher.setTname("laoalskjd");
        teacherService.creatTeacher(teacher);
        return 0;
    }

    @Override
    public int delectStudent(int id) {
        studentMapper.deleteByPrimaryKey(id);
        return 0;
    }
}
