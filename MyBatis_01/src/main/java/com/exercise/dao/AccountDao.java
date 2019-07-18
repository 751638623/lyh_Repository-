package com.exercise.dao;

import com.exercise.bean.Account;

import java.util.List;

/**
 * <p>Title: AccountDao</p>
 * <p>Description: </p>
 * <p>Copyright: </p>
 * <p>Company: </p>
 *
 * @author 卢宇航
 * @Classname AccountDao
 * @Description TODO
 * @Date 2019/5/29 0029 下午 10:08
 */
public interface AccountDao {
// 一对一查询
public List<Account> findAccountList();


}
