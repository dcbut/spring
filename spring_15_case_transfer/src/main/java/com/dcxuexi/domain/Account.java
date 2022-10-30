package com.dcxuexi.domain;

/***
 * @Title Account
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/30 10:47
 * @Version 1.0.0
 */
public class Account {
    private Integer id;
    private String userName;
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", money=" + money +
                '}';
    }
}
