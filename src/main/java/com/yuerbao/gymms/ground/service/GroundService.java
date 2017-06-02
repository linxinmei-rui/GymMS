package com.yuerbao.gymms.ground.service;

import com.yuerbao.gymms.ground.model.Ground;
import com.yuerbao.gymms.ground.model.GroundBook;
import com.yuerbao.gymms.ground.vo.BookGroundVo;
import com.yuerbao.gymms.ground.vo.GroundCrudVo;
import com.yuerbao.gymms.utils.PageBean;

/**
 * Created by lhp_mac on 2017/6/1.
 * 场地业务逻辑层接口
 */
public interface GroundService {
    public GroundCrudVo addGround(Ground ground);

    public GroundCrudVo deleteGroundById(int gId);

    public GroundCrudVo updateGroundById(Ground ground);

    public PageBean<Ground> getGroundByPage(PageBean<Ground> pageBean);

    public BookGroundVo bookGround(GroundBook groundBook);

    public  BookGroundVo examineGround(GroundBook groundBook);
}
