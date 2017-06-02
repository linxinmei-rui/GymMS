package com.yuerbao.gymms.ground.service.impl;

import com.sun.org.apache.regexp.internal.RE;
import com.yuerbao.gymms.ground.mapper.GroundMapper;
import com.yuerbao.gymms.ground.model.Ground;
import com.yuerbao.gymms.ground.model.GroundBook;
import com.yuerbao.gymms.ground.service.GroundService;
import com.yuerbao.gymms.ground.vo.BookGroundVo;
import com.yuerbao.gymms.ground.vo.GroundCrudVo;
import com.yuerbao.gymms.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by lhp_mac on 2017/6/1.
 * 场地管理业务逻辑层实现类
 */
@Service
public class GroundServiceImpl implements GroundService {

    @Autowired
    public GroundMapper groundMapper;

    public GroundCrudVo addGround(Ground ground){
        int result = groundMapper.addGround(ground);
        GroundCrudVo vo = new GroundCrudVo();
        vo.setStatus(1);
        if(result<=0){
            vo.setStatus(0);
        }

        return  vo;
    }

    public GroundCrudVo deleteGroundById(int gId){
        int result = groundMapper.deleteGroundById(gId);
        GroundCrudVo vo = new GroundCrudVo();
        vo.setStatus(1);
        if(result<=0){
            vo.setStatus(0);
        }

        return  vo;
    }

    public GroundCrudVo updateGroundById(Ground ground){
        int result = groundMapper.updateGroundById(ground);
        GroundCrudVo vo = new GroundCrudVo();
        vo.setStatus(1);
        if(result<=0){
            vo.setStatus(0);
        }

        return  vo;
    }


    public PageBean<Ground> getGroundByPage(PageBean<Ground> pageBean) {
        int totalCount = groundMapper.getCount();

        //设置总页数和总数量
        pageBean.setTotalCount(totalCount);
        pageBean.setTotalPage(pageBean.getTotalPage());

        //每页数据
        int start = (pageBean.getCurrentPage()-1) * pageBean.getLimitCount();
        List<Ground> dataList = groundMapper.getGroundList(start,pageBean.getLimitCount());

        pageBean.setList(dataList);

        return pageBean;
    }


    public BookGroundVo bookGround(GroundBook groundBook) {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

        groundBook.setbDate(df.format(new Date()));

        int result = groundMapper.bookGround(groundBook);

        BookGroundVo vo = new BookGroundVo();
        if(result<=0){
            vo.setStatus(0);
            vo.setMessage("预定失败，网络繁忙");
        }

        return vo;
    }


    //审核场地
    public BookGroundVo examineGround(GroundBook groundBook) {
        int result = groundMapper.updateBookGround(groundBook);

        BookGroundVo vo = new BookGroundVo();
        vo.setMessage("审核成功");
        if(result <=0){
            vo.setStatus(0);
            vo.setMessage("审核失败，网络繁忙");
        }
        return vo;
    }
}
