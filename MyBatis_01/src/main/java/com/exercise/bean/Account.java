package com.exercise.bean;

/**
 * <p>Title: Account</p>
 * <p>Description: </p>
 * <p>Copyright: </p>
 * <p>Company: </p>
 *
 * @author 卢宇航
 * @Classname Account
 * @Description TODO
 * @Date 2019/5/29 0029 下午 10:00
 */
public class Account {
    private Integer id;
    private Integer uid;
    private Double money;
    private User user;

    public Account(Integer id, Integer uid, Double money, User user) {
        this.id = id;
        this.uid = uid;
        this.money = money;
        this.user = user;
    }

    public Account() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                ", user=" + user +
                '}';
    }
}
