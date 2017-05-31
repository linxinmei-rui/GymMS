package com.yuerbao.gymms.user.action;

import com.yuerbao.gymms.user.model.User;
import com.yuerbao.gymms.user.service.UserService;
import com.yuerbao.gymms.user.vo.UserVo;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lhp_mac on 2017/5/30.
 */
@Controller
@RequestMapping(value = "/user")
public class UserAction {

    @Autowired
    public UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String tets(){
//        User user = new User();
//        user.setuId(1);
//        userService.Login(user.getuId());

        //userService.Login(new User());
        return "/match/match_index";
    }


    @RequestMapping(value = "login" ,method= RequestMethod.GET)
    public  @ResponseBody
    UserVo login(@RequestBody User user){
        UserVo vo = userService.Login(user.getuId());
        return vo ;
    }
}