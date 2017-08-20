import com.xue.dao.StudentMapper;
import com.xue.po.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {


        InputStream in= Main.class.getResourceAsStream("com/xue/resources/mybatis-config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session=factory.openSession();
        StudentMapper mapper=session.getMapper(StudentMapper.class);
        /*Student student=new Student();
        student.setSid(78);
        student.setSname("laowang");
        student.setSage(78);
        student.setSsex("男");
        int x=mapper.insertStudent(student);
        System.out.println(x);*/
        List<Student> studentList=mapper.seleceAllGoods();
        session.commit();
        session.close();
        System.out.println(studentList);
    }



}
