package com.yuerbao.gymms.match;

import com.github.pagehelper.PageInfo;
import com.yuerbao.gymms.match.model.MatchBooking;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * Created by lim9527 on 5/27 0027.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml",
        "classpath:spring/spring-mybatis.xml",
        "classpath:springmvc/spring-dispatcher.xml"})
public class TestMatchManagerAction {

    @Autowired
    WebApplicationContext context;

    MockMvc mockMvc;

    @Before
    public void getMockMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testGetAllMatchBooking() throws Exception{
        MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders.get("/match/manager/booking/manager")
                .param("pn", "8"))
                .andReturn();

        MockHttpServletRequest request = result.getRequest();
        PageInfo pageInfo = (PageInfo) request.getAttribute("pageInfo");
        System.out.println("当前页码" + pageInfo.getPageNum());
        System.out.println("总页码" + pageInfo.getPages());
        System.out.println("总记录数" + pageInfo.getTotal());
        System.out.println("在页面上需要连续显示的页码");
        int[] nums = pageInfo.getNavigatepageNums();
        for (int i:nums)
            System.out.print(" " + i);

        List<MatchBooking> list = pageInfo.getList();
        for (MatchBooking matchBooking : list){
            System.out.println("预约id:" + matchBooking.getBkId() + "==>" +
                    matchBooking.getMatchName());
        }

    }


}
