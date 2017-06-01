package com.yuerbao.gymms.match.mapper;

import com.yuerbao.gymms.match.model.MatchChangdi;
import com.yuerbao.gymms.match.model.MatchChangdiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MatchChangdiMapper {
    long countByExample(MatchChangdiExample example);

    int deleteByExample(MatchChangdiExample example);

    int deleteByPrimaryKey(Integer tbId);

    int insert(MatchChangdi record);

    int insertSelective(MatchChangdi record);

    List<MatchChangdi> selectByExample(MatchChangdiExample example);

    MatchChangdi selectByPrimaryKey(Integer tbId);

    int updateByExampleSelective(@Param("record") MatchChangdi record, @Param("example") MatchChangdiExample example);

    int updateByExample(@Param("record") MatchChangdi record, @Param("example") MatchChangdiExample example);

    int updateByPrimaryKeySelective(MatchChangdi record);

    int updateByPrimaryKey(MatchChangdi record);
}