package com.coder520.user.service;

import com.coder520.user.entity.User;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface UserService {
    int creatUser(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    User findUserByUserName(String username);
}
