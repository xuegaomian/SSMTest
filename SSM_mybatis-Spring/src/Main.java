public class Main {

    public static void main(String[] args) throws Exception {


        /*InputStream in= Main.class.getResourceAsStream("com/xue/resources/mybatis-config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session=factory.openSession();
        StudentMapper studentMapper=session.getMapper(StudentMapper.class);
        TeacherMapper teacherMapper=session.getMapper(TeacherMapper.class);*/
        /*Student student=new Student();
        student.setSid(78);
        student.setSname("laowang");
        student.setSage(78);
        student.setSsex("男");
        int x=mapper.insertStudent(student);
        System.out.println(x);*/
        //ApplicationContext context=new ClassPathXmlApplicationContext("com/xue/resources/spring-config.xml");
        //SqlSessionFactory sqlSessionFactory= (SqlSessionFactory) context.getBean("dataSource");
        //Student student= studentMapper.selectByPrimaryKey(1);
        //System.out.println(student);
        /*session.commit();
        session.close();*/
    }
}
