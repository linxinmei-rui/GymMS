package com.yuerbao.gymms.match.action;

import com.yuerbao.gymms.match.mapper.UserMapper;
import com.yuerbao.gymms.match.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lim9527 on 5/20 0020.
 */
@Controller
@RequestMapping(value = "/user")
public class UserAction {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String test(){

        User user = userMapper.findUserById(1);
        if (user != null)
            System.out.println(user);
        return "/match/match_index";
    }
}
