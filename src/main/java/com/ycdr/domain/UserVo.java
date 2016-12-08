package com.ycdr.domain;

/**
 * Created by YcDr on 2016/12/7.
 */
public class UserVo {
    private String userIds;
    private String userName;

    public UserVo() {
        super();
    }

    public UserVo(String userIds, String userName) {
        this.userIds = userIds;
        this.userName = userName;
    }

    public String getUserIds() {
        return userIds;
    }

    public void setUserIds(String userIds) {
        this.userIds = userIds;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
