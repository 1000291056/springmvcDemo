package mybatis.dao;

import com.bean.User;

import java.util.List;

/**
 * Created by wufeifei on 2016/12/29.
 */
public interface UserDao {
    User getUserById(int id);

    List<User> getUsers();

    void insert(User user);

    void insertUsers(List<User> list);
}
