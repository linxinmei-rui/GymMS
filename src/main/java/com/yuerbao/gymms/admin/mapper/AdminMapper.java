package com.yuerbao.gymms.admin.mapper;

import com.yuerbao.gymms.admin.model.Admin;
import org.springframework.stereotype.Repository;

/**
 * Created by lhp_mac on 2017/6/3.
 */
@Repository
public interface AdminMapper {

    public Admin login(Admin admin);
}
