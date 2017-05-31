package com.yuerbao.gymms.user.mapper;

import com.yuerbao.gymms.user.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

/**
 * Created by lhp_mac on 2017/5/30.
 */
@Repository
public interface UserMapper {
    public User findUserById(Integer uId);

}
