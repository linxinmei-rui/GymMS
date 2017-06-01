package com.yuerbao.gymms.match;

import com.yuerbao.gymms.match.mapper.MatchBookingMapper;
import com.yuerbao.gymms.match.model.MatchBooking;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by lim9527 on 5/27 0027.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml",
        "classpath:spring/spring-mybatis.xml"})
public class MatchBookingMapperTest {

//    @Autowired
//    MatchBookingMapper matchBookingMapper;

    @Autowired
    SqlSession sqlSession;

    @Test
    public void testSelectAllMatchBooking(){
//        matchBookingMapper.insert(new MatchBooking(null, 1000,
//                "2017广东海洋大学数学与计算机学院师生排球友谊赛",
//                "友谊赛", "自备", "2个排球场", "第8周周末",
//                "陈月玲", "13420854988", null,
//                null, 100));

        MatchBookingMapper matchBookingMapper = sqlSession.getMapper(MatchBookingMapper.class);
//        for (int i=0; i<100; i++){
//            matchBookingMapper.insert(new MatchBooking(null, 1000,
//                    "2017广东海洋大学数学与计算机学院师生排球友谊赛",
//                    "友谊赛", "自备", "2个排球场", "第8周周末",
//                    "陈月玲", "13420854988", null,
//                    null, 100, new Date()));
//        }

        for (int i=0; i<100; i++){
            matchBookingMapper.insert(new MatchBooking(null, 1001,
                    "2017广东海洋大学航海学院领航杯篮球赛",
                    "有趣的篮球赛赛", "2个篮球", "2个篮球场", "第8周周末",
                    "丁晨耀", "13424357658", null,
                    null, 100, new Date()));
        }
        System.out.println("插入完成");
    }
}
