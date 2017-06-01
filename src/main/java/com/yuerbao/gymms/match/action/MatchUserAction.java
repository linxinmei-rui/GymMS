package com.yuerbao.gymms.match.action;

import com.yuerbao.gymms.match.service.IMatchBookingService;
import com.yuerbao.gymms.match.serviceimpl.MatchBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    @RequestMapping(path = "/booking/apply", method = RequestMethod.GET)
    public ModelAndView apply(){
        ModelAndView mv = new ModelAndView("match/user/booking_apply");
        return mv;
    }

    /*用户赛事预约结果*/
    @RequestMapping(path = "/booking/result", method = RequestMethod.GET)
    public ModelAndView result(){
        ModelAndView mv = new ModelAndView("match/user/booking_result");
        return mv;
    }


    /*用户赛事预约条目数据*/
    @ResponseBody
    @RequestMapping(path = "/items", method = RequestMethod.GET)
    public String requestBookingItem(){
        String json = "{\"name\":\"test\",\"num\":\"3\",\"info\":[" +
                "{\"id\":\"20161024\",\"user\":\"周杰伦\",\"match\":\"魔杰座-2016校园巡回演唱会湛江站\",\"status\":\"申请中\",\"url\":\"http://www.baidu.com\"}," +
                "{\"id\":\"20161025\",\"user\":\"周杰伦\",\"match\":\"魔杰座-2016校园巡回演唱会湛江站\",\"status\":\"申请中\",\"url\":\"www.baidu.com\"}," +
                "{\"id\":\"20161026\",\"user\":\"周杰伦\",\"match\":\"魔杰座-2016校园巡回演唱会湛江站\",\"status\":\"申请中\",\"url\":\"www.baidu.com\"}" +
                "]}";
//        String json="你好啊abc";
        //System.out.println(json);
        return json;
    }
}
