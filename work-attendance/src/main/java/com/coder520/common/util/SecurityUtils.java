package com.coder520.common.util;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
* 对密码进行MD5加密
* */
public  class SecurityUtils {
    public static String encrtyPassword(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder=new BASE64Encoder();
        //直接生成的会乱码，所以需要这一步
        String result=base64Encoder.encode(md5.digest(password.getBytes("utf-8")));

        return result;
    }
    public static boolean checkPasswprd(String inputPwd, String dbPwd) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        //校验加密后的密码和数据库里的密码
        String result=encrtyPassword(inputPwd);
        if (result.equals(dbPwd)){
            return true;
        }else
            return false;
    }
}
