package com.yuerbao.gymms.admin.service.impl;

import com.yuerbao.gymms.admin.mapper.AdminMapper;
import com.yuerbao.gymms.admin.model.Admin;
import com.yuerbao.gymms.admin.service.AdminService;
import com.yuerbao.gymms.admin.vo.AdminVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lhp_mac on 2017/6/3.
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    public AdminMapper adminMapper ;

    public AdminVo login(Admin admin) {
        Admin result = adminMapper.login(admin);
        AdminVo vo = new AdminVo();
        vo.setStatus(1);

        if(result == null){
            vo.setStatus(0);
            vo.setErrorMessage("用户名或者密码错误");
        }

        return vo;
    }
}
