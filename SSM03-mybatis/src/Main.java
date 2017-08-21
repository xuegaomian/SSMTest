
import com.xue.dao.StudentMapper;
import com.xue.dao.TeacherMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {


        InputStream in= Main.class.getResourceAsStream("com/xue/resources/mybatis-config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session=factory.openSession();
        StudentMapper studentMapper=session.getMapper(StudentMapper.class);
        TeacherMapper teacherMapper=session.getMapper(TeacherMapper.class);
        /*Student student=new Student();
        student.setSid(78);
        student.setSname("laowang");
        student.setSage(78);
        student.setSsex("男");
        int x=mapper.insertStudent(student);
        System.out.println(x);*/
        session.commit();
        session.close();
    }



}
