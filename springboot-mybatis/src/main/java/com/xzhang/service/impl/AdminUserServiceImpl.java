package com.xzhang.service.impl;

import com.xzhang.mapper.AdminUserMapper;
import com.xzhang.model.AdminUser;
import com.xzhang.service.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/1 0001.
 *
 */
@Service("adminUserService")
public class AdminUserServiceImpl implements IAdminUserService {

    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUser findAdminUser(String id) {
        return adminUserMapper.findAdminUser(id);
    }
}
