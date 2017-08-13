package com.xue.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        //properties的读写
        /*Properties pop=new Properties();
        pop.load(new FileInputStream("resources/test.properties"));
        System.out.println(pop.getProperty("url"));*/



        //XML的读写
        /*SAXReader sr=new SAXReader();
        Document doc = sr.read(new File("resources/demo.xml"));
        Element element = doc.getRootElement();
        //System.out.println(element.getText());
        List<Element> list = element.elements("student");
        List<Student> slist=new ArrayList();
        Student stu=new Student();
        for (Element em:list ) {
            Element nameEle = em.element("name");
            Element ageEle = em.element("age");
            String name=nameEle.getText();
            String age=ageEle.getText();

            stu.setName(name);
            stu.setAge(age);
            slist.add(stu);
        }
        for (Student s: slist ) {
            System.out.println(s.getName());
            System.out.println(s.getAge());
        }*/


        //反射
        Class clazz=Class.forName("Student");
        Student student=(Student) clazz.newInstance();
        //int x=student.add(3,5);

        //获取成员变量
        /*Field file = clazz.getDeclaredField("name");
        file.setAccessible(true);//不管成员是否私有，都能访问
        file.set(student,"laowang");
        System.out.println(student.getName());*/

        //获取构造方法
        //Constructor con = clazz.getConstructor();//只能访问共有的方法
        Constructor con=clazz.getDeclaredConstructor();//获取所都权限的构造方法
        System.out.println(con.getName());

        //获取所有的方法
        /*Method[] methods = clazz.getDeclaredMethods();
        for (Method mes:methods ) {
            System.out.println(mes.getName());
        }*/

        //获取指定方法

        Method method = clazz.getDeclaredMethod("add", int.class, int.class);
        int i=(int)method.invoke(student,2,3);//student是new Instance出来的；
        System.out.println(i);
    }
}
