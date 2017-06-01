package com.yuerbao.gymms.user.action;

import com.yuerbao.gymms.user.model.User;
import com.yuerbao.gymms.user.service.UserService;
import com.yuerbao.gymms.user.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.nio.cs.US_ASCII;

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

	@RequestMapping(method = RequestMethod.GET)
	public String tets() {
		// User user = new User();
		// user.setuId(1);
		// userService.Login(user.getuId());

		// userService.Login(new User());
		return "/match/match_index";
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public @ResponseBody UserVo login(User user) {
		user = new User();
		user.setuName("luhaipeng");
		user.setuPassword("123");
		UserVo vo = userService.Login(user);
		return vo;
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public @ResponseBody UserVo register(@RequestBody User user) {
		/*
		 * user.setuName("luhaipeng"); user.setuEmail("782580908@qq.com");
		 * user.setuPassword("123"); user.setuPhone("13432882795");
		 * user.setuStudentId("201411701122");
		 */
		UserVo uservo = userService.register(user);
		return uservo;
	}

	@RequestMapping(value = "getAllUser", method = RequestMethod.GET)
	@ResponseBody
	public List<User> getAllUser() {
		List<User> list = userService.findAll();
		return list;
	}

}