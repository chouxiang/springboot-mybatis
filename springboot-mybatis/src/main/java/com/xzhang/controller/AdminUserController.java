package com.xzhang.controller;

import com.xzhang.model.AdminUser;
import com.xzhang.service.IAdminUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/3/1 0001.
 */
@Controller
@RequestMapping("adminUserController")
public class AdminUserController {
    protected Logger logger = Logger.getLogger(AdminUserController.class);

    @Autowired
    private IAdminUserService adminUserService;

    @RequestMapping("getAdminUser")
    //@ResponseBody   //用于返回json
    public String getAdminUser(HttpServletRequest request, HttpServletResponse response,String id){
        AdminUser user = this.adminUserService.findAdminUser(id);
        logger.info(user.getUsername());

        request.setAttribute("adminname",user.getUsername());
        return "adminUserTest";
    }



}
