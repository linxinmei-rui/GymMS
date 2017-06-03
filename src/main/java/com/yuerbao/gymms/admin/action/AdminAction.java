package com.yuerbao.gymms.admin.action;

import com.yuerbao.gymms.admin.mapper.AdminMapper;
import com.yuerbao.gymms.admin.model.Admin;
import com.yuerbao.gymms.admin.service.AdminService;
import com.yuerbao.gymms.admin.vo.AdminVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by lhp_mac on 2017/6/3.
 */
@Controller
@RequestMapping(value = "admin")
public class AdminAction {

    @Autowired
    public AdminService adminService;


    @RequestMapping(value = "login" ,method = RequestMethod.GET)
    public  @ResponseBody
    AdminVo login(HttpSession session,  Admin admin){
        admin.setaName("luhaipeng");
        admin.setaPassword("123456");

        AdminVo vo = adminService.login(admin);

        if(vo.getStatus() == 1 ){
            session.setAttribute("admin",admin);
        }
        return vo ;
    }





}
