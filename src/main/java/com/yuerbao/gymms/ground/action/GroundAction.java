package com.yuerbao.gymms.ground.action;

import com.yuerbao.gymms.ground.model.Ground;
import com.yuerbao.gymms.ground.model.GroundBook;
import com.yuerbao.gymms.ground.service.GroundService;
import com.yuerbao.gymms.ground.vo.BookGroundVo;
import com.yuerbao.gymms.ground.vo.GroundCrudVo;
import com.yuerbao.gymms.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


/**
 * Created by lhp_mac on 2017/6/1.
 */
@Controller
@RequestMapping(value = "ground")
public class GroundAction {

    @Autowired
    public GroundService groundService;

    /**
     * @param ground ${gName,gFee,gRemark}
     * @return
     */
    @RequestMapping(value = "addGround", method = RequestMethod.POST)
    public @ResponseBody
    GroundCrudVo addGround(@RequestBody Ground ground) {

        return groundService.addGround(ground);
    }

    /**
     * @param gId ${gId}
     *            场地id
     * @return
     */
    @RequestMapping(value = "deleteGroundById", method = RequestMethod.GET)
    public @ResponseBody
    GroundCrudVo
    deleteGroundById(@RequestParam("gId") int gId) {
        return groundService.deleteGroundById(gId);
    }

    /**
     * @param ground ${Ground}
     *               整个对象，不管改变还是未改变的值
     * @return
     */
    @RequestMapping(value = "deleteGroundById", method = RequestMethod.POST)
    public @ResponseBody
    GroundCrudVo
    updateGroundById(@RequestBody Ground ground) {
        return groundService.updateGroundById(ground);
    }

    /**
     * @param pageBean ${currentPage 第几页,[limitCount]可选，每一页的页数}
     * @return ${pageBean 返回数据}
     */
    @RequestMapping(value = "getGroundByPage", method = RequestMethod.POST)
    public @ResponseBody
    PageBean<Ground> getGroundByPage(@RequestBody  PageBean<Ground> pageBean) {
        pageBean =    groundService.getGroundByPage(pageBean);
        return pageBean;
    }


    /**
     * @param groundBook ${ground.gId 场地名称，bStartTime 开始时间 ，bEndTime 结束时间，bFee 费用}
     * @return BookGroundVo
     */
    @RequestMapping(value = "bookGround", method = RequestMethod.POST)
    public @ResponseBody
    BookGroundVo bookGround(@RequestBody GroundBook groundBook, HttpSession session) {

        BookGroundVo vo = groundService.bookGround(groundBook);
        return vo;

    }

    /**
     *
     * @param groundBook  ${bId 场地预定项id，bStatus 状态 1表示给通过 2表示不给通过}
     * @return
     */
    @RequestMapping(value = "examineGround",method = RequestMethod.POST)
    public @ResponseBody
    BookGroundVo examineGround(@RequestBody GroundBook groundBook) {

        return groundService.examineGround(groundBook);
    }









}
