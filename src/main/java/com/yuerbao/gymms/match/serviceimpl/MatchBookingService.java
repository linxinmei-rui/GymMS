package com.yuerbao.gymms.match.serviceimpl;

import com.yuerbao.gymms.match.mapper.MatchBookingMapper;
import com.yuerbao.gymms.match.model.MatchBooking;
import com.yuerbao.gymms.match.service.IMatchBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lim9527 on 5/27 0027.
 */
@Service
public class MatchBookingService implements IMatchBookingService {

    @Autowired
    MatchBookingMapper matchBookingMapper;

    public List<MatchBooking> selectMatchBookingByUser() {
        return null;
    }

    /**
     * 返回所有赛事预约
     * @return
     */
    public List<MatchBooking> selectAllMatchBooking() {
        return matchBookingMapper.selectByExample(null);
    }
}
