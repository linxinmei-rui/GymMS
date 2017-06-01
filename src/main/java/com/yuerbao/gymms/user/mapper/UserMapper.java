package com.yuerbao.gymms.user.mapper;

import com.yuerbao.gymms.user.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lhp_mac on 2017/5/30.
 */
@Repository
public interface UserMapper {
    public User findUserById(Integer uId);

    public void register(User user);

    public List<User> findAll();

    public User findUser(User user);
}
