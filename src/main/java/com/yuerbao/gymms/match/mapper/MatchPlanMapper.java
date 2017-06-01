package com.yuerbao.gymms.match.mapper;

import com.yuerbao.gymms.match.model.MatchPlan;
import com.yuerbao.gymms.match.model.MatchPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MatchPlanMapper {
    long countByExample(MatchPlanExample example);

    int deleteByExample(MatchPlanExample example);

    int deleteByPrimaryKey(Integer mpId);

    int insert(MatchPlan record);

    int insertSelective(MatchPlan record);

    List<MatchPlan> selectByExample(MatchPlanExample example);

    MatchPlan selectByPrimaryKey(Integer mpId);

    int updateByExampleSelective(@Param("record") MatchPlan record, @Param("example") MatchPlanExample example);

    int updateByExample(@Param("record") MatchPlan record, @Param("example") MatchPlanExample example);

    int updateByPrimaryKeySelective(MatchPlan record);

    int updateByPrimaryKey(MatchPlan record);
}