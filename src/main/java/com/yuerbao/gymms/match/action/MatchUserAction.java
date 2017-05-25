package com.yuerbao.gymms.match.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lim9527 on 5/24 0024.
 */
@Controller
@RequestMapping(value = "/match" )
public class MatchUserAction {

    @RequestMapping(path = "/a", method = RequestMethod.GET)
    public ModelAndView write(){
        ModelAndView mv = new ModelAndView("/match/match_test");
        return mv;
    }

    @RequestMapping(path = "/b", method = RequestMethod.GET)
    public ModelAndView writeb(){
        ModelAndView mv = new ModelAndView("/match/match_booking_item_table_user");
        return mv;
    }

    @ResponseBody
    @RequestMapping(path = "/bookingItemTableAjax", method = RequestMethod.GET)
    public String jsonTest(){
        String json = "{\"name\":\"test\",\"num\":\"3\",\"info\":[" +
                "{\"id\":\"20161024\",\"user\":\"周杰伦\",\"match\":\"魔杰座-2016校园巡回演唱会湛江站\",\"status\":\"申请中\",\"url\":\"www.baidu.com\"}," +
                "{\"id\":\"20161025\",\"user\":\"周杰伦\",\"match\":\"魔杰座-2016校园巡回演唱会湛江站\",\"status\":\"申请中\",\"url\":\"www.baidu.com\"}," +
                "{\"id\":\"20161026\",\"user\":\"周杰伦\",\"match\":\"魔杰座-2016校园巡回演唱会湛江站\",\"status\":\"申请中\",\"url\":\"www.baidu.com\"}," +
                "]}";
        System.out.println(json);
        return json;
    }
}
