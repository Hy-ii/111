package Test;
//这是修改测试
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.testng.annotations.Test;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStream;
import java.sql.Connection;


public class UserTest {
    @Test
    public void userFindByIdTest() {
        String resources = "mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlMapper.openSession();
        User user = session.selectOne("findById", 1);
        System.out.println(user.getUname());
        session.close();
    }
}

