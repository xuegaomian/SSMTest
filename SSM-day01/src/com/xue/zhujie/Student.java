package com.xue.zhujie;

/**
 * Created by Mr.xue on 2017/8/6.
 */
public class Student {
    private String name;
    private String age;
    @test(value = "student")
     public int add(int a,int b){
         return a+b;
     }

    Student(){}
    public String getAge() {
        return age;
    }

    public String getName() {

        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {

        this.name = name;
    }
}
