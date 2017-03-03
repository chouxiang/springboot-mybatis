package com.xzhang.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/1 0001.
 * desc : 后台用户实体类
 */
public class AdminUser {

    private String id;
    private String username;//用户姓名
    private String mobile;//手机号
    private String password;//密码
    private Date createtime;//创建时间
    private String status;//状态

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatetime() {
        return createtime;
    }
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
