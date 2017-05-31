package com.yuerbao.gymms.match.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuerbao.gymms.match.model.MatchBooking;
import com.yuerbao.gymms.match.serviceimpl.MatchBookingService;
import com.yuerbao.gymms.match.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lim9527 on 5/27 0027.
 */
@Controller
@RequestMapping("/match/manager")
public class MatchManagerAction {

    @Autowired
    MatchBookingService matchBookingService;


    /**
     * 转发到赛事预约管理页面,分页查询
     * @return
     */
    @RequestMapping(path = "/booking/manager")
    public String getAllMatchBooking(
            @RequestParam(value = "pn", defaultValue = "1")Integer pn,
            Model model){
        PageHelper.startPage(pn, 10);
        List<MatchBooking> matchBookings = matchBookingService.selectAllMatchBooking();
        PageInfo pageInfo = new PageInfo(matchBookings, 5);
        model.addAttribute("pageInfo", pageInfo);
        return "/match/manager/booking_manager";
    }


    @RequestMapping(path = "/booking/getAllItem")
    @ResponseBody
    public Message getAllMatchBookingWithJson(
            @RequestParam(value = "pn", defaultValue = "1")Integer pn){
        PageHelper.startPage(pn, 10);
        List<MatchBooking> matchBookings = matchBookingService.selectAllMatchBooking();
        PageInfo pageInfo = new PageInfo(matchBookings, 5);
        return Message.success().add("pageInfo", pageInfo);
    }
}
