import com.xue.dao.StudentMapper;
import com.xue.po.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {


        InputStream in= Main.class.getResourceAsStream("com/xue/resources/mybatis-config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session=factory.openSession();
        StudentMapper mapper=session.getMapper(StudentMapper.class);
        /*Student student=new Student();
        student.setSid(007);
        student.setSname("laowang");
        student.setSage(78);
        student.setSsex("男");*/
        Student student=mapper.selectOneById(1);
        session.commit();
        session.close();
    }



}
