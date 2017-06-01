package com.yuerbao.gymms.match.mapper;

import com.yuerbao.gymms.match.model.MatchBooking;
import com.yuerbao.gymms.match.model.MatchBookingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MatchBookingMapper {
    long countByExample(MatchBookingExample example);

    int deleteByExample(MatchBookingExample example);

    int deleteByPrimaryKey(Integer bkId);

    int insert(MatchBooking record);

    int insertSelective(MatchBooking record);

    List<MatchBooking> selectByExample(MatchBookingExample example);

    MatchBooking selectByPrimaryKey(Integer bkId);

    int updateByExampleSelective(@Param("record") MatchBooking record, @Param("example") MatchBookingExample example);

    int updateByExample(@Param("record") MatchBooking record, @Param("example") MatchBookingExample example);

    int updateByPrimaryKeySelective(MatchBooking record);

    int updateByPrimaryKey(MatchBooking record);
}