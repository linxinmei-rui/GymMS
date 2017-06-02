package com.yuerbao.gymms.utils;

import java.util.List;

/**
 * Created by lhp_mac on 2017/6/1.
 */
public class PageBean<T>  {

    private int currentPage = 1   ; //当前页,默认为1
    private int totalCount; // 数据总数
    private int totalPage; //   总页数
    private int limitCount = 20; //  每页数据

    //  每页的数据
    private List<T> list;


    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        if(totalCount%limitCount==0){
            return totalCount/limitCount;
        }else{
            return  totalCount/limitCount + 1;
        }
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(int limitCount) {
        this.limitCount = limitCount;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageBean [currentPage=" + currentPage + ", totalCount="
                + totalCount + ", totalPage=" + totalPage + ", limitCount="
                + limitCount  + ", list=" + list + "]" ;
    }






}
