package com.exercise.dao;

import com.exercise.bean.Account;
import com.exercise.bean.User;

import java.util.List;

/**
 * <p>Title: UserDao</p>
 * <p>Description: </p>
 * <p>Copyright: </p>
 * <p>Company: </p>
 *
 * @author 卢宇航
 * @Classname UserDao
 * @Description TODO
 * @Date 2019/5/26 0026 下午 11:50
 */
public interface UserDao {
//查询所有接口
    public List<User> findAll();
//插入数据接口
    public boolean saveUser(User user);
//根据姓名查找数据
    public User findByName(String username);
//根据id删除数据
    public boolean deleteUserByID(Integer id);
//根据id修改数据
    public User updataUserByID(Integer id);
// 多对多查询
    public List<User> findUserAccountList();


}
