package com.yuerbao.gymms.user.service;

import com.yuerbao.gymms.user.model.User;
import com.yuerbao.gymms.user.vo.UserVo;

/**
 * Created by lhp_mac on 2017/5/30.
 */
public interface UserService {
    public UserVo Login(int uId);
}
