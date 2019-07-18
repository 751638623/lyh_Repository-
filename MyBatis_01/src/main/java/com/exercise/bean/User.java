package com.exercise.bean;

import java.util.Date;
import java.util.List;

/**
 * <p>Title: User</p>
 * <p>Description: </p>
 * <p>Copyright: </p>
 * <p>Company: </p>
 *
 * @author 卢宇航
 * @Classname User
 * @Description TODO
 * @Date 2019/5/27 0027 下午 3:14
 */
public class User {
    private Integer id;
    private Date birthday;
    private String username;
    private String sex;
    private String address;
    private List<Account> accList;

    public User(Integer id, Date birthday, String username, String sex, String address, List<Account> accList) {
        this.id = id;
        this.birthday = birthday;
        this.username = username;
        this.sex = sex;
        this.address = address;
        this.accList = accList;
    }

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", birthday=" + birthday +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", accList=" + accList +
                '}';
    }
}

