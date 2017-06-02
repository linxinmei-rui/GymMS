package com.yuerbao.gymms.match.serviceimpl;

import com.yuerbao.gymms.match.mapper.MatchBookingMapper;
import com.yuerbao.gymms.match.model.Match;
import com.yuerbao.gymms.match.model.MatchBooking;
import com.yuerbao.gymms.match.model.MatchBookingExample;
import com.yuerbao.gymms.match.service.IMatchBookingService;
import com.yuerbao.gymms.match.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by lim9527 on 5/27 0027.
 */
@Service
public class MatchBookingService {

    @Autowired
    MatchBookingMapper matchBookingMapper;


    /**
     * 返回所有赛事预约
     * @return
     */
    public List<MatchBooking> selectAllMatchBooking() {
        return matchBookingMapper.selectByExample(null);
    }

    /**
     * 返回用户id为userId的用户赛事预约数据。
     * @param userId
     * @return
     */
    public List<MatchBooking> selectAllMatchBookingOfUser(Integer userId) {
        MatchBookingExample example = new MatchBookingExample();
        MatchBookingExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);

        return matchBookingMapper.selectByExample(example);
    }

    /**
     * 根据bkId查询赛事预约。
     * @param bkId
     * @return
     */
    public MatchBooking selectMatchBookingById(Integer bkId){
        return matchBookingMapper.selectByPrimaryKey(bkId);
    }

    /**
     * 保存赛事预约申请。
     * @param matchBooking
     */
    public void saveMatchBooking(MatchBooking matchBooking){

        //处理表单未完成部分
        matchBooking.setCreateTime(new Date());
        matchBooking.setStatus(100);
        matchBooking.setUserId(1002);
        matchBookingMapper.insertSelective(matchBooking);
    }

    public void updateMatchBooking(MatchBooking matchBooking){
        matchBookingMapper.updateByPrimaryKeySelective(matchBooking);
    }

    /**
     * 取消赛事预约
     * @param bkId
     */
    public void cancelMatchBooking(Integer bkId){
        MatchBooking matchBooking = new MatchBooking();
        matchBooking.setBkId(bkId);
        matchBooking.setStatus(200);
        matchBookingMapper.updateByPrimaryKeySelective(matchBooking);
    }


}
