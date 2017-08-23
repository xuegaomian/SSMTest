package com.coder520.user.service;

import com.coder520.common.util.SecurityUtils;
import com.coder520.user.dao.UserMapper;
import com.coder520.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int creatUser(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        user.setPassword(SecurityUtils.encrtyPassword(user.getPassword()));
        userMapper.insertSelective(user);
        return 0;
    }

    @Override
    public User findUserByUserName(String username) {
        return userMapper.selectByUserName(username);

    }
}
