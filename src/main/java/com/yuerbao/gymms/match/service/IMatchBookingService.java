package com.yuerbao.gymms.match.service;

import com.yuerbao.gymms.match.model.MatchBooking;

import java.util.List;

/**
 * Created by lim9527 on 5/27 0027.
 */
public interface IMatchBookingService {
    List<MatchBooking> selectAllMatchBooking();
    List<MatchBooking> selectAllMatchBookingOfUser(Integer userId);


}
