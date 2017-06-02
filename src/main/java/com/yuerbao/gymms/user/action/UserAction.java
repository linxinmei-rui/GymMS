package com.yuerbao.gymms.user.action;

import com.yuerbao.gymms.user.model.User;
import com.yuerbao.gymms.user.service.UserService;
import com.yuerbao.gymms.user.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.nio.cs.US_ASCII;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lhp_mac on 2017/5/30.
 */
@Controller
@RequestMapping(value = "/user")
public class UserAction {

	@Autowired
	public UserService userService;

	/**
	 * @param  user {uName,uPassword}
	 * @return  userVo
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public @ResponseBody UserVo login(HttpSession session,@RequestBody  User user) {
		UserVo vo = userService.Login(user);
		if (vo.getStatus()==1){
			session.setAttribute("user",user);
		}
		return vo;
	}

	/**
	 *
	 * @param user  {uName,uPassword,uEmail,uStudentId,uPhone}
	 * @return UserVo
	 */
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public @ResponseBody UserVo register(@RequestBody User user) {
		UserVo uservo = userService.register(user);
		return uservo;
	}

	/**
	 * @return List<User>
	 *
	 */
	@RequestMapping(value = "getAllUser", method = RequestMethod.GET)
	@ResponseBody
	public List<User> getAllUser() {
		List<User> list = userService.findAll();
		return list;
	}


	/**
	 * @return  获取当前登录用户的id
	 */
	public @ResponseBody  int getId(HttpSession session){
			return userService.getUser((User)session.
					getAttribute("user")).
					getuId();

	}




}