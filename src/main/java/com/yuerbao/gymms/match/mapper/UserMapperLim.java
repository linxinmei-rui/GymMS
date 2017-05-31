package com.yuerbao.gymms.match.mapper;

import com.yuerbao.gymms.match.model.User;

/**
 * Created by lim9527 on 5/23 0023.
 */
public interface UserMapperLim {

    //@Select("SELECT * FROM user_t WHERE id = #{userId}")
    User findUserById(Integer userId);
}
