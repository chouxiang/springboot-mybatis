package com.xzhang.mapper;

import com.xzhang.model.AdminUser;

/**
 * Created by Administrator on 2017/3/1 0001.
 * desc : 后台用户mapper接口
 */
public interface AdminUserMapper {

    /**
     * 根据id找到后台用户
     * @return
     */
    public AdminUser findAdminUser(String id);

}
