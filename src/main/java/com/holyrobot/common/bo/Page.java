package com.holyrobot.common.bo;

/**
 * @author 赵乐
 * @create 2018-05-1810:53
 * @desc 分页实体类
 **/
public class Page {
    private Integer pageNum;
    private Integer pageSize;
    private Integer tatalNum;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTatalNum() {
        return tatalNum;
    }

    public void setTatalNum(Integer tatalNum) {
        this.tatalNum = tatalNum;
    }
}
