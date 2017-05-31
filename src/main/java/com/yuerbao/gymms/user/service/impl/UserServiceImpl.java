package com.yuerbao.gymms.user.service.impl;

import com.yuerbao.gymms.user.mapper.UserMapper;
import com.yuerbao.gymms.user.model.User;
import com.yuerbao.gymms.user.service.UserService;
import com.yuerbao.gymms.user.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lhp_mac on 2017/5/30.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserMapper userMapper;
    public UserVo Login(int uId) {
        User user = userMapper.findUserById(uId);
        UserVo userVo = new UserVo();
        userVo.setStatus(1);
        if(user==null){
            userVo.setStatus(0);
            userVo.setErrorMessage("用户名不存在");
        }
        if(user.getStatus() == 0 ){
            userVo.setStatus(0);
            userVo.setErrorMessage("用户尚未激活");
        }

        return userVo;
    }
}
