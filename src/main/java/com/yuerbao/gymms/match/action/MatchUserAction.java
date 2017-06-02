package com.yuerbao.gymms.match.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuerbao.gymms.match.model.MatchBooking;
import com.yuerbao.gymms.match.serviceimpl.MatchBookingService;
import com.yuerbao.gymms.match.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by lim9527 on 5/24 0024.
 */
@Controller
@RequestMapping(value = "/match/user" )
public class MatchUserAction {

    @Autowired
    MatchBookingService matchBookingService;

    /*用户赛事预约管理*/
    @RequestMapping(path = "/manager", method = RequestMethod.GET)
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
    @RequestMapping(path = "/bookings")
    @ResponseBody
    public Message getAllMatchBookingOfUser(
            @RequestParam(value = "userId") Integer userId,
            @RequestParam(value = "pn", defaultValue = "1")Integer pn){
        PageHelper.startPage(pn, 10);
        List<MatchBooking> matchBookings = matchBookingService.selectAllMatchBookingOfUser(userId);
        PageInfo pageInfo = new PageInfo(matchBookings, 5);
        return Message.success().add("pageInfo", pageInfo);
    }

    /**
     * 返回id为bkId的赛事预约
     * @param bkId
     * @return
     */
    @RequestMapping(path = "/booking/{bkId}", method = RequestMethod.GET)
    @ResponseBody
    public Message getMatchBookingById(@RequestParam(value = "bkId") Integer bkId){
        MatchBooking matchBooking = matchBookingService.selectMatchBookingById(bkId);
        return Message.success().add("booking", matchBooking);
    }


    /**
     * 提交赛事预约申请
     * @return
     */
    @RequestMapping(path = "/applyMatchBooking", method = RequestMethod.POST)
    @ResponseBody
    public Message applyMatchBooking(MatchBooking matchBooking){
        matchBookingService.saveMatchBooking(matchBooking);
        return Message.success();
    }

    /**
     * 取消赛事预约
     * @param bkId
     * @return
     */
    @RequestMapping(path = "/booking/{bkId}", method = RequestMethod.PUT)
    @ResponseBody
    public Message cancelMatchBooking(@PathVariable("bkId")Integer bkId){
        matchBookingService.cancelMatchBooking(bkId);
        return Message.success();
    }


}
