package com.holyrobot.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CusScenicspot implements Serializable{
    private String id;

    private String scenicname;

    private String scenicsummary;

    private String spell;

    private String destinationid;

    private String destinationname;

    private Boolean ishot;

    private Boolean isshopping;

    private Boolean isextraitem;

    private BigDecimal mincost;

    private BigDecimal maxcost;

    private Boolean ismultiple;

    private String scenicintroduction;

    private String shortname;

    private Integer sortindex;

    private Date createddate;

    private String createdby;

    private String createdbyid;

    private String deptid;

    private String orgid;

    private Date reviseddate;

    private String revisedby;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getScenicname() {
        return scenicname;
    }

    public void setScenicname(String scenicname) {
        this.scenicname = scenicname == null ? null : scenicname.trim();
    }

    public String getScenicsummary() {
        return scenicsummary;
    }

    public void setScenicsummary(String scenicsummary) {
        this.scenicsummary = scenicsummary == null ? null : scenicsummary.trim();
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell == null ? null : spell.trim();
    }

    public String getDestinationid() {
        return destinationid;
    }

    public void setDestinationid(String destinationid) {
        this.destinationid = destinationid == null ? null : destinationid.trim();
    }

    public String getDestinationname() {
        return destinationname;
    }

    public void setDestinationname(String destinationname) {
        this.destinationname = destinationname == null ? null : destinationname.trim();
    }

    public Boolean getIshot() {
        return ishot;
    }

    public void setIshot(Boolean ishot) {
        this.ishot = ishot;
    }

    public Boolean getIsshopping() {
        return isshopping;
    }

    public void setIsshopping(Boolean isshopping) {
        this.isshopping = isshopping;
    }

    public Boolean getIsextraitem() {
        return isextraitem;
    }

    public void setIsextraitem(Boolean isextraitem) {
        this.isextraitem = isextraitem;
    }

    public BigDecimal getMincost() {
        return mincost;
    }

    public void setMincost(BigDecimal mincost) {
        this.mincost = mincost;
    }

    public BigDecimal getMaxcost() {
        return maxcost;
    }

    public void setMaxcost(BigDecimal maxcost) {
        this.maxcost = maxcost;
    }

    public Boolean getIsmultiple() {
        return ismultiple;
    }

    public void setIsmultiple(Boolean ismultiple) {
        this.ismultiple = ismultiple;
    }

    public String getScenicintroduction() {
        return scenicintroduction;
    }

    public void setScenicintroduction(String scenicintroduction) {
        this.scenicintroduction = scenicintroduction == null ? null : scenicintroduction.trim();
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public Integer getSortindex() {
        return sortindex;
    }

    public void setSortindex(Integer sortindex) {
        this.sortindex = sortindex;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public String getCreatedbyid() {
        return createdbyid;
    }

    public void setCreatedbyid(String createdbyid) {
        this.createdbyid = createdbyid == null ? null : createdbyid.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public Date getReviseddate() {
        return reviseddate;
    }

    public void setReviseddate(Date reviseddate) {
        this.reviseddate = reviseddate;
    }

    public String getRevisedby() {
        return revisedby;
    }

    public void setRevisedby(String revisedby) {
        this.revisedby = revisedby == null ? null : revisedby.trim();
    }

    @Override
    public String toString() {
        return "CusScenicspot{" +
                "id='" + id + '\'' +
                ", scenicname='" + scenicname + '\'' +
                ", scenicsummary='" + scenicsummary + '\'' +
                ", spell='" + spell + '\'' +
                ", destinationid='" + destinationid + '\'' +
                ", destinationname='" + destinationname + '\'' +
                ", ishot=" + ishot +
                ", isshopping=" + isshopping +
                ", isextraitem=" + isextraitem +
                ", mincost=" + mincost +
                ", maxcost=" + maxcost +
                ", ismultiple=" + ismultiple +
                ", scenicintroduction='" + scenicintroduction + '\'' +
                ", shortname='" + shortname + '\'' +
                ", sortindex=" + sortindex +
                ", createddate=" + createddate +
                ", createdby='" + createdby + '\'' +
                ", createdbyid='" + createdbyid + '\'' +
                ", deptid='" + deptid + '\'' +
                ", orgid='" + orgid + '\'' +
                ", reviseddate=" + reviseddate +
                ", revisedby='" + revisedby + '\'' +
                '}';
    }
}