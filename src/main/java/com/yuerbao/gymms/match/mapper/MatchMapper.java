package com.yuerbao.gymms.match.mapper;

import com.yuerbao.gymms.match.model.Match;
import com.yuerbao.gymms.match.model.MatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MatchMapper {
    long countByExample(MatchExample example);

    int deleteByExample(MatchExample example);

    int deleteByPrimaryKey(Integer matchId);

    int insert(Match record);

    int insertSelective(Match record);

    List<Match> selectByExample(MatchExample example);

    Match selectByPrimaryKey(Integer matchId);

    int updateByExampleSelective(@Param("record") Match record, @Param("example") MatchExample example);

    int updateByExample(@Param("record") Match record, @Param("example") MatchExample example);

    int updateByPrimaryKeySelective(Match record);

    int updateByPrimaryKey(Match record);
}