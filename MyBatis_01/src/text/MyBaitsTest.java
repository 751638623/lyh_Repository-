import com.exercise.bean.Account;
import com.exercise.bean.User;
import com.exercise.dao.AccountDao;
import com.exercise.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * <p>Title: MyBaitsTest</p>
 * <p>Description: </p>
 * <p>Copyright: </p>
 * <p>Company: </p>
 *
 * @author 卢宇航
 * @Classname MyBaitsTest
 * @Description TODO
 * @Date 2019/5/27 0027 下午 3:29
 */
public class MyBaitsTest {
    private SqlSessionFactory sqlSessionFactory = null;
//为SqlSessionFactoryBuilder 构造不同的SqlSession做准备
// 1.解析数据源配置文件
// 2.创建SqlSession
    @Before
    public void init() throws Exception {
        // 1. 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        // 2. 加载SqlMapConfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");

        // 3. 创建SqlSessionFactory对象
        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

//    查找所有数据
    @Test
    public void testFindAll() throws Exception {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 5. 执行SqlSession对象执行查询，获取结果User

        // 获取接口代理对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> list = userDao.findAll();

        // 6. 打印结果
        for (User user : list) {
            System.out.println(user);
        }

        // 7. 释放资源
        sqlSession.close();
    }
//保存数据
    @Test
    public void testSaveUser() {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 5. 执行SqlSession对象执行查询，获取结果User

        // 获取接口代理对象
        User user = new User();
        user.setSex("女");
        user.setAddress("河南");
        user.setUsername("团子");
        //参数1:namespace+sqlID唯一标识
        //参数2.传递给sql语句的一个参数
        sqlSession.insert("saveUser", user);
        sqlSession.commit();

    }
//根据名字查找数据
    @Test
    public void textFindByName() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user = userDao.findByName("团子");
        System.out.println(user);

    }
//单表删除
    @Test
    public void textDeleteById() {
        SqlSession sqlsession = sqlSessionFactory.openSession();
        sqlsession.delete("deleteUserByID", 43);
        sqlsession.commit();

    }
//单表修改
    @Test
    public void textUpdataUserByID() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user =new User();
        user.setId(48);
        user.setBirthday(new Date());
        user.setUsername("年少有为");
        user.setSex("男");
        user.setAddress("广州");
        sqlSession.update("updataUserByID",user);
        sqlSession.commit();

    }
// 一对多查询
    @Test
    public void TestfindAccountList(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        Account account = new Account();
        List<Account> accounts = accountDao.findAccountList();
        for (Account ac:accounts) {
            System.out.println(ac);
        }


    }
    //    多对多查询
    @Test
    public void testFindUserAccountList(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> accList = userDao.findUserAccountList();
        for (User user:accList) {
            System.out.println(user);
        }
    }

}
