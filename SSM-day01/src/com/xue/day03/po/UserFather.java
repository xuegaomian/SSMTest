package com.xue.day03.po;

/**
 * Created by Mr.xue on 2017/8/10.
 */
public class UserFather {
    private String FatherName;
    private User user;

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "UserFather{" +
                "FatherName='" + FatherName + '\'' +
                ", user=" + user +
                '}';
    }

    public void setUser(User user) {
        this.user = user;

    }
}
