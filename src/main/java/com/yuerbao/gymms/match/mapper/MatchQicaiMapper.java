package com.yuerbao.gymms.match.mapper;

import com.yuerbao.gymms.match.model.MatchQicai;
import com.yuerbao.gymms.match.model.MatchQicaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MatchQicaiMapper {
    long countByExample(MatchQicaiExample example);

    int deleteByExample(MatchQicaiExample example);

    int deleteByPrimaryKey(Integer tbId);

    int insert(MatchQicai record);

    int insertSelective(MatchQicai record);

    List<MatchQicai> selectByExample(MatchQicaiExample example);

    MatchQicai selectByPrimaryKey(Integer tbId);

    int updateByExampleSelective(@Param("record") MatchQicai record, @Param("example") MatchQicaiExample example);

    int updateByExample(@Param("record") MatchQicai record, @Param("example") MatchQicaiExample example);

    int updateByPrimaryKeySelective(MatchQicai record);

    int updateByPrimaryKey(MatchQicai record);
}