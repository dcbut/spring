package com.dcxuexi.domain;

import java.io.Serializable;

/***
 * @Title User
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/23 11:46
 * @Version 1.0.0
 */
public class User implements Serializable {
    private Integer userId;
    private String email;
    private String userName;
    private String branchName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", branchName='" + branchName + '\'' +
                '}';
    }
}
