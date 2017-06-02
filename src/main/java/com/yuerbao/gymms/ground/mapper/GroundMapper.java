package com.yuerbao.gymms.ground.mapper;

import com.yuerbao.gymms.ground.model.Ground;
import com.yuerbao.gymms.ground.model.GroundBook;
import com.yuerbao.gymms.utils.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lhp_mac on 2017/6/1.
 * 场地映射接口
 */
@Repository
public interface GroundMapper {

   public int addGround(Ground ground);

   public int deleteGroundById(int gId);

   public int updateGroundById(Ground ground);

   public List<Ground> getGroundList(int start, int count );

   public int getCount();

   public int bookGround(GroundBook groundBook);

   public  int updateBookGround(GroundBook groundBook);

}
