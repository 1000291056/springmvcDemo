package mybatis;

import com.bean.User;
import mybatis.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wufeifei on 2016/12/30.
 */
public class Test {
    private static SqlSessionFactory sqlSessionFactory;

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            URL url=new URL("http://www.baidu.com");
           HttpURLConnection connection= (HttpURLConnection) url.openConnection();
            connection.getResponseCode();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Reader reader = Resources.getResourceAsReader("mybatis_config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlSessionFactory.openSession();
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            User user = userDao.getUserById(6);
            List<User> users=userDao.getUsers();
            User user1=new User("wwwwww1","aaaaa","23232323");
            User user2=new User("wwwwww2","aaaaa","23232323");
            User user3=new User("wwwww3","aaaaa","23232323");
            User user4=new User("wwwwww4","aaaaa","23232323");
            User user5=new User("wwwwww5","aaaaa","9999999999");
//            userDao.insert(user1);
            List<User> userList=new ArrayList<User>();
            userList.add(user1);
            userList.add(user2);
            userList.add(user3);
            userList.add(user4);
            userList.add(user5);
//            userDao.insertUsers(userList);
userDao.update(user5);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (sqlSession!=null){
                sqlSession.rollback();
            }

        }
    }
}
