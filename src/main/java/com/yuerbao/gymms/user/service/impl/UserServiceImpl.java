package com.yuerbao.gymms.user.service.impl;

import com.yuerbao.gymms.user.mapper.UserMapper;
import com.yuerbao.gymms.user.model.User;
import com.yuerbao.gymms.user.service.UserService;
import com.yuerbao.gymms.user.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lhp_mac on 2017/5/30.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserMapper userMapper;

    public UserVo Login(User user) {
        User loginUser = userMapper.findUser(user);

        UserVo userVo = new UserVo();
        userVo.setStatus(1);

        if(loginUser==null){
            userVo.setStatus(0);
            userVo.setErrorMessage("用户名不存在或密码错误");
        }
        if(loginUser.getStatus() == 0 ){
            userVo.setStatus(0);
            userVo.setErrorMessage("用户尚未激活");
        }

        return userVo;
    }


    public User getUser(User user) {
        return userMapper.findUser(user);
    }

    public UserVo register(User user) {

        userMapper.register(user);
        UserVo userVo = new UserVo();
        userVo.setStatus(1);

        return userVo;
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
