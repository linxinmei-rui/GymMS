package com.yuerbao.gymms.match.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuerbao.gymms.match.model.MatchBooking;
import com.yuerbao.gymms.match.service.IMatchBookingService;
import com.yuerbao.gymms.match.serviceimpl.MatchBookingService;
import com.yuerbao.gymms.match.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by lim9527 on 5/24 0024.
 */
@Controller
@RequestMapping(value = "/match/user" )
public class MatchUserAction {

    @Autowired
    IMatchBookingService matchBookingService;

    /*用户赛事预约管理*/
    @RequestMapping(path = "/booking/manager", method = RequestMethod.GET)
    public ModelAndView manager(){
        ModelAndView mv = new ModelAndView("match/user/booking_manager");
        return mv;
    }

    /*用户赛事预约申请*/
    @RequestMapping(path = "/apply", method = RequestMethod.GET)
    public ModelAndView apply(){
        ModelAndView mv = new ModelAndView("match/user/booking_apply");
        return mv;
    }

    /*用户赛事预约结果*/
    @RequestMapping(path = "/result", method = RequestMethod.GET)
    public ModelAndView result(){
        ModelAndView mv = new ModelAndView("match/user/booking_result");
        return mv;
    }


    /*用户赛事预约条目数据*/
    @RequestMapping(path = "/getAllItem")
    @ResponseBody
    public Message getAllMatchBookingWithJson(
            @RequestParam(value = "userId") Integer userId,
            @RequestParam(value = "pn", defaultValue = "1")Integer pn){
        PageHelper.startPage(pn, 10);
        List<MatchBooking> matchBookings = matchBookingService.selectAllMatchBookingOfUser(userId);
        PageInfo pageInfo = new PageInfo(matchBookings, 5);
        return Message.success().add("pageInfo", pageInfo);
    }
}
