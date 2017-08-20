package com.xue.dao;


import com.xue.po.Hobby;

public interface HobbyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hobby record);


    int insertSelective(Hobby record);

    Hobby selectByPrimaryKey(Integer id);

    Hobby selectByPrimaryKeyWithStudent(Integer id);
    int updateByPrimaryKeySelective(Hobby record);

    int updateByPrimaryKey(Hobby record);
}