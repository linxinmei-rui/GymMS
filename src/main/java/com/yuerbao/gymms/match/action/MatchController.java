package com.yuerbao.gymms.match.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuerbao.gymms.match.model.MatchBooking;
import com.yuerbao.gymms.match.serviceimpl.MatchBookingService;
import com.yuerbao.gymms.match.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by lim9527 on 6/1 0001.
 */
@Controller
@RequestMapping(value = "/match")
public class MatchController {

    @Autowired
    MatchBookingService matchBookingService;


    /**********************页面***************************************************************************************/

    /**
     * 跳转到用户赛事预约管理界面
     * @return
     */
    @RequestMapping(path = "/manager/user", method = RequestMethod.GET)
    public String userManager(){
        return "match/user/booking_manager";
    }

    /**
     * 转发到赛事预约管理页面
     * @return
     */
    @RequestMapping(path = "/manager/manager", method = RequestMethod.GET)
    public String managerManager(){
        return "/match/manager/booking_manager";
    }

    /**
     * 用户赛事预约申请
     * @return
     */
    @RequestMapping(path = "/apply", method = RequestMethod.GET)
    public String apply(){
        return "match/user/booking_apply";
    }

    /**
     * 跳转到赛事预约结果页面
     * @return
     */
    @RequestMapping(path = "/result", method = RequestMethod.GET)
    public String result(){
        return "match/user/booking_result";
    }


    /**********************数据***************************************************************************************/

    /**
     * 分页获取所有赛事预约数据
     * @param pn
     * @return
     */
    @RequestMapping(path = "/bookings", method = RequestMethod.GET)
    @ResponseBody
    public Message getAllMatchBooking(
            @RequestParam(value = "pn", defaultValue = "1")Integer pn){
        PageHelper.startPage(pn, 10);
        List<MatchBooking> matchBookings = matchBookingService.selectAllMatchBooking();
        PageInfo pageInfo = new PageInfo(matchBookings, 5);
        return Message.success().add("pageInfo", pageInfo);
    }



    /**
     * 返回用户的所有赛事预约
     * @param userId
     * @param pn
     * @return
     */
    @RequestMapping(path = "/bookings/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public Message getAllMatchBookingOfUser(
            @PathVariable("userId")Integer userId,
            @RequestParam(value = "pn", defaultValue = "1")Integer pn){
        PageHelper.startPage(pn, 10);
        List<MatchBooking> matchBookings = matchBookingService.selectAllMatchBookingOfUser(userId);
        PageInfo pageInfo = new PageInfo(matchBookings, 5);
        return Message.success().add("pageInfo", pageInfo);
    }

    /**
     * 根据bkId查询赛事预约
     * @param bkId
     * @return
     */
    @RequestMapping(path = "/booking/{bkId}", method = RequestMethod.GET)
    @ResponseBody
    public Message getMatchBookingById(@PathVariable(value = "bkId") Integer bkId){
        MatchBooking matchBooking = matchBookingService.selectMatchBookingById(bkId);
        return Message.success().add("booking", matchBooking);
    }

    /**
     * 提交赛事预约申请
     * @return
     */
    @RequestMapping(path = "/booking", method = RequestMethod.POST)
    @ResponseBody
    public Message applyMatchBooking(MatchBooking matchBooking){
        matchBookingService.saveMatchBooking(matchBooking);
        return Message.success();
    }

    /**
     * 修改id为bkId的赛事预约
     * @param matchBooking
     * @return
     */
    @RequestMapping(path = "/booking/{bkId}", method = RequestMethod.PUT)
    @ResponseBody
    public Message updateMatchBooking(MatchBooking matchBooking){
        System.out.println(matchBooking.getBkId());
        System.out.println(matchBooking.getMatchDesc());
        matchBookingService.updateMatchBooking(matchBooking);
        return Message.success();
    }

    /**
     * 取消赛事预约
     * @param bkId
     * @return
     */
    @RequestMapping(path = "/booking/cancel/{bkId}", method = RequestMethod.PUT)
    @ResponseBody
    public Message cancelMatchBooking(@PathVariable("bkId")Integer bkId){
        matchBookingService.cancelMatchBooking(bkId);
        return Message.success();
    }


}
