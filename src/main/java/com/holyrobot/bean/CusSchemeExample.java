package com.holyrobot.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CusSchemeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CusSchemeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCusnameIsNull() {
            addCriterion("CusName is null");
            return (Criteria) this;
        }

        public Criteria andCusnameIsNotNull() {
            addCriterion("CusName is not null");
            return (Criteria) this;
        }

        public Criteria andCusnameEqualTo(String value) {
            addCriterion("CusName =", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameNotEqualTo(String value) {
            addCriterion("CusName <>", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameGreaterThan(String value) {
            addCriterion("CusName >", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameGreaterThanOrEqualTo(String value) {
            addCriterion("CusName >=", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameLessThan(String value) {
            addCriterion("CusName <", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameLessThanOrEqualTo(String value) {
            addCriterion("CusName <=", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameLike(String value) {
            addCriterion("CusName like", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameNotLike(String value) {
            addCriterion("CusName not like", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameIn(List<String> values) {
            addCriterion("CusName in", values, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameNotIn(List<String> values) {
            addCriterion("CusName not in", values, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameBetween(String value1, String value2) {
            addCriterion("CusName between", value1, value2, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameNotBetween(String value1, String value2) {
            addCriterion("CusName not between", value1, value2, "cusname");
            return (Criteria) this;
        }

        public Criteria andAliasenameIsNull() {
            addCriterion("AliaseName is null");
            return (Criteria) this;
        }

        public Criteria andAliasenameIsNotNull() {
            addCriterion("AliaseName is not null");
            return (Criteria) this;
        }

        public Criteria andAliasenameEqualTo(String value) {
            addCriterion("AliaseName =", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameNotEqualTo(String value) {
            addCriterion("AliaseName <>", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameGreaterThan(String value) {
            addCriterion("AliaseName >", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameGreaterThanOrEqualTo(String value) {
            addCriterion("AliaseName >=", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameLessThan(String value) {
            addCriterion("AliaseName <", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameLessThanOrEqualTo(String value) {
            addCriterion("AliaseName <=", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameLike(String value) {
            addCriterion("AliaseName like", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameNotLike(String value) {
            addCriterion("AliaseName not like", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameIn(List<String> values) {
            addCriterion("AliaseName in", values, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameNotIn(List<String> values) {
            addCriterion("AliaseName not in", values, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameBetween(String value1, String value2) {
            addCriterion("AliaseName between", value1, value2, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameNotBetween(String value1, String value2) {
            addCriterion("AliaseName not between", value1, value2, "aliasename");
            return (Criteria) this;
        }

        public Criteria andCusnoIsNull() {
            addCriterion("CusNo is null");
            return (Criteria) this;
        }

        public Criteria andCusnoIsNotNull() {
            addCriterion("CusNo is not null");
            return (Criteria) this;
        }

        public Criteria andCusnoEqualTo(String value) {
            addCriterion("CusNo =", value, "cusno");
            return (Criteria) this;
        }

        public Criteria andCusnoNotEqualTo(String value) {
            addCriterion("CusNo <>", value, "cusno");
            return (Criteria) this;
        }

        public Criteria andCusnoGreaterThan(String value) {
            addCriterion("CusNo >", value, "cusno");
            return (Criteria) this;
        }

        public Criteria andCusnoGreaterThanOrEqualTo(String value) {
            addCriterion("CusNo >=", value, "cusno");
            return (Criteria) this;
        }

        public Criteria andCusnoLessThan(String value) {
            addCriterion("CusNo <", value, "cusno");
            return (Criteria) this;
        }

        public Criteria andCusnoLessThanOrEqualTo(String value) {
            addCriterion("CusNo <=", value, "cusno");
            return (Criteria) this;
        }

        public Criteria andCusnoLike(String value) {
            addCriterion("CusNo like", value, "cusno");
            return (Criteria) this;
        }

        public Criteria andCusnoNotLike(String value) {
            addCriterion("CusNo not like", value, "cusno");
            return (Criteria) this;
        }

        public Criteria andCusnoIn(List<String> values) {
            addCriterion("CusNo in", values, "cusno");
            return (Criteria) this;
        }

        public Criteria andCusnoNotIn(List<String> values) {
            addCriterion("CusNo not in", values, "cusno");
            return (Criteria) this;
        }

        public Criteria andCusnoBetween(String value1, String value2) {
            addCriterion("CusNo between", value1, value2, "cusno");
            return (Criteria) this;
        }

        public Criteria andCusnoNotBetween(String value1, String value2) {
            addCriterion("CusNo not between", value1, value2, "cusno");
            return (Criteria) this;
        }

        public Criteria andCusdaysIsNull() {
            addCriterion("CusDays is null");
            return (Criteria) this;
        }

        public Criteria andCusdaysIsNotNull() {
            addCriterion("CusDays is not null");
            return (Criteria) this;
        }

        public Criteria andCusdaysEqualTo(Integer value) {
            addCriterion("CusDays =", value, "cusdays");
            return (Criteria) this;
        }

        public Criteria andCusdaysNotEqualTo(Integer value) {
            addCriterion("CusDays <>", value, "cusdays");
            return (Criteria) this;
        }

        public Criteria andCusdaysGreaterThan(Integer value) {
            addCriterion("CusDays >", value, "cusdays");
            return (Criteria) this;
        }

        public Criteria andCusdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("CusDays >=", value, "cusdays");
            return (Criteria) this;
        }

        public Criteria andCusdaysLessThan(Integer value) {
            addCriterion("CusDays <", value, "cusdays");
            return (Criteria) this;
        }

        public Criteria andCusdaysLessThanOrEqualTo(Integer value) {
            addCriterion("CusDays <=", value, "cusdays");
            return (Criteria) this;
        }

        public Criteria andCusdaysIn(List<Integer> values) {
            addCriterion("CusDays in", values, "cusdays");
            return (Criteria) this;
        }

        public Criteria andCusdaysNotIn(List<Integer> values) {
            addCriterion("CusDays not in", values, "cusdays");
            return (Criteria) this;
        }

        public Criteria andCusdaysBetween(Integer value1, Integer value2) {
            addCriterion("CusDays between", value1, value2, "cusdays");
            return (Criteria) this;
        }

        public Criteria andCusdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("CusDays not between", value1, value2, "cusdays");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("StartDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("StartDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("StartDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("StartDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("StartDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("StartDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("StartDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("StartDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("StartDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("StartDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("StartDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNull() {
            addCriterion("DueDate is null");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNotNull() {
            addCriterion("DueDate is not null");
            return (Criteria) this;
        }

        public Criteria andDuedateEqualTo(Date value) {
            addCriterion("DueDate =", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotEqualTo(Date value) {
            addCriterion("DueDate <>", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThan(Date value) {
            addCriterion("DueDate >", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThanOrEqualTo(Date value) {
            addCriterion("DueDate >=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThan(Date value) {
            addCriterion("DueDate <", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThanOrEqualTo(Date value) {
            addCriterion("DueDate <=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateIn(List<Date> values) {
            addCriterion("DueDate in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotIn(List<Date> values) {
            addCriterion("DueDate not in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateBetween(Date value1, Date value2) {
            addCriterion("DueDate between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotBetween(Date value1, Date value2) {
            addCriterion("DueDate not between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidIsNull() {
            addCriterion("Cus_CusInfoID is null");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidIsNotNull() {
            addCriterion("Cus_CusInfoID is not null");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidEqualTo(String value) {
            addCriterion("Cus_CusInfoID =", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidNotEqualTo(String value) {
            addCriterion("Cus_CusInfoID <>", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidGreaterThan(String value) {
            addCriterion("Cus_CusInfoID >", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidGreaterThanOrEqualTo(String value) {
            addCriterion("Cus_CusInfoID >=", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidLessThan(String value) {
            addCriterion("Cus_CusInfoID <", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidLessThanOrEqualTo(String value) {
            addCriterion("Cus_CusInfoID <=", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidLike(String value) {
            addCriterion("Cus_CusInfoID like", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidNotLike(String value) {
            addCriterion("Cus_CusInfoID not like", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidIn(List<String> values) {
            addCriterion("Cus_CusInfoID in", values, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidNotIn(List<String> values) {
            addCriterion("Cus_CusInfoID not in", values, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidBetween(String value1, String value2) {
            addCriterion("Cus_CusInfoID between", value1, value2, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidNotBetween(String value1, String value2) {
            addCriterion("Cus_CusInfoID not between", value1, value2, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("OrderDate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("OrderDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(Date value) {
            addCriterion("OrderDate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(Date value) {
            addCriterion("OrderDate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(Date value) {
            addCriterion("OrderDate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("OrderDate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(Date value) {
            addCriterion("OrderDate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(Date value) {
            addCriterion("OrderDate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<Date> values) {
            addCriterion("OrderDate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<Date> values) {
            addCriterion("OrderDate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(Date value1, Date value2) {
            addCriterion("OrderDate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(Date value1, Date value2) {
            addCriterion("OrderDate not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andDatastatusIsNull() {
            addCriterion("DataStatus is null");
            return (Criteria) this;
        }

        public Criteria andDatastatusIsNotNull() {
            addCriterion("DataStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDatastatusEqualTo(Integer value) {
            addCriterion("DataStatus =", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusNotEqualTo(Integer value) {
            addCriterion("DataStatus <>", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusGreaterThan(Integer value) {
            addCriterion("DataStatus >", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("DataStatus >=", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusLessThan(Integer value) {
            addCriterion("DataStatus <", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusLessThanOrEqualTo(Integer value) {
            addCriterion("DataStatus <=", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusIn(List<Integer> values) {
            addCriterion("DataStatus in", values, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusNotIn(List<Integer> values) {
            addCriterion("DataStatus not in", values, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusBetween(Integer value1, Integer value2) {
            addCriterion("DataStatus between", value1, value2, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusNotBetween(Integer value1, Integer value2) {
            addCriterion("DataStatus not between", value1, value2, "datastatus");
            return (Criteria) this;
        }

        public Criteria andSchemefeaturesIsNull() {
            addCriterion("SchemeFeatures is null");
            return (Criteria) this;
        }

        public Criteria andSchemefeaturesIsNotNull() {
            addCriterion("SchemeFeatures is not null");
            return (Criteria) this;
        }

        public Criteria andSchemefeaturesEqualTo(String value) {
            addCriterion("SchemeFeatures =", value, "schemefeatures");
            return (Criteria) this;
        }

        public Criteria andSchemefeaturesNotEqualTo(String value) {
            addCriterion("SchemeFeatures <>", value, "schemefeatures");
            return (Criteria) this;
        }

        public Criteria andSchemefeaturesGreaterThan(String value) {
            addCriterion("SchemeFeatures >", value, "schemefeatures");
            return (Criteria) this;
        }

        public Criteria andSchemefeaturesGreaterThanOrEqualTo(String value) {
            addCriterion("SchemeFeatures >=", value, "schemefeatures");
            return (Criteria) this;
        }

        public Criteria andSchemefeaturesLessThan(String value) {
            addCriterion("SchemeFeatures <", value, "schemefeatures");
            return (Criteria) this;
        }

        public Criteria andSchemefeaturesLessThanOrEqualTo(String value) {
            addCriterion("SchemeFeatures <=", value, "schemefeatures");
            return (Criteria) this;
        }

        public Criteria andSchemefeaturesLike(String value) {
            addCriterion("SchemeFeatures like", value, "schemefeatures");
            return (Criteria) this;
        }

        public Criteria andSchemefeaturesNotLike(String value) {
            addCriterion("SchemeFeatures not like", value, "schemefeatures");
            return (Criteria) this;
        }

        public Criteria andSchemefeaturesIn(List<String> values) {
            addCriterion("SchemeFeatures in", values, "schemefeatures");
            return (Criteria) this;
        }

        public Criteria andSchemefeaturesNotIn(List<String> values) {
            addCriterion("SchemeFeatures not in", values, "schemefeatures");
            return (Criteria) this;
        }

        public Criteria andSchemefeaturesBetween(String value1, String value2) {
            addCriterion("SchemeFeatures between", value1, value2, "schemefeatures");
            return (Criteria) this;
        }

        public Criteria andSchemefeaturesNotBetween(String value1, String value2) {
            addCriterion("SchemeFeatures not between", value1, value2, "schemefeatures");
            return (Criteria) this;
        }

        public Criteria andOrderpriceIsNull() {
            addCriterion("OrderPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrderpriceIsNotNull() {
            addCriterion("OrderPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpriceEqualTo(Integer value) {
            addCriterion("OrderPrice =", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotEqualTo(Integer value) {
            addCriterion("OrderPrice <>", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceGreaterThan(Integer value) {
            addCriterion("OrderPrice >", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderPrice >=", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceLessThan(Integer value) {
            addCriterion("OrderPrice <", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceLessThanOrEqualTo(Integer value) {
            addCriterion("OrderPrice <=", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceIn(List<Integer> values) {
            addCriterion("OrderPrice in", values, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotIn(List<Integer> values) {
            addCriterion("OrderPrice not in", values, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceBetween(Integer value1, Integer value2) {
            addCriterion("OrderPrice between", value1, value2, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderPrice not between", value1, value2, "orderprice");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNull() {
            addCriterion("Attention is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNotNull() {
            addCriterion("Attention is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionEqualTo(String value) {
            addCriterion("Attention =", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotEqualTo(String value) {
            addCriterion("Attention <>", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThan(String value) {
            addCriterion("Attention >", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("Attention >=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThan(String value) {
            addCriterion("Attention <", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThanOrEqualTo(String value) {
            addCriterion("Attention <=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLike(String value) {
            addCriterion("Attention like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotLike(String value) {
            addCriterion("Attention not like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionIn(List<String> values) {
            addCriterion("Attention in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotIn(List<String> values) {
            addCriterion("Attention not in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionBetween(String value1, String value2) {
            addCriterion("Attention between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotBetween(String value1, String value2) {
            addCriterion("Attention not between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNull() {
            addCriterion("CreatedDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNotNull() {
            addCriterion("CreatedDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateddateEqualTo(Date value) {
            addCriterion("CreatedDate =", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotEqualTo(Date value) {
            addCriterion("CreatedDate <>", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThan(Date value) {
            addCriterion("CreatedDate >", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreatedDate >=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThan(Date value) {
            addCriterion("CreatedDate <", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThanOrEqualTo(Date value) {
            addCriterion("CreatedDate <=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateIn(List<Date> values) {
            addCriterion("CreatedDate in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotIn(List<Date> values) {
            addCriterion("CreatedDate not in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateBetween(Date value1, Date value2) {
            addCriterion("CreatedDate between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotBetween(Date value1, Date value2) {
            addCriterion("CreatedDate not between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("CreatedBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("CreatedBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(String value) {
            addCriterion("CreatedBy =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(String value) {
            addCriterion("CreatedBy <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(String value) {
            addCriterion("CreatedBy >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(String value) {
            addCriterion("CreatedBy >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(String value) {
            addCriterion("CreatedBy <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(String value) {
            addCriterion("CreatedBy <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLike(String value) {
            addCriterion("CreatedBy like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotLike(String value) {
            addCriterion("CreatedBy not like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<String> values) {
            addCriterion("CreatedBy in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<String> values) {
            addCriterion("CreatedBy not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(String value1, String value2) {
            addCriterion("CreatedBy between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(String value1, String value2) {
            addCriterion("CreatedBy not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidIsNull() {
            addCriterion("CreatedByID is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidIsNotNull() {
            addCriterion("CreatedByID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidEqualTo(String value) {
            addCriterion("CreatedByID =", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidNotEqualTo(String value) {
            addCriterion("CreatedByID <>", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidGreaterThan(String value) {
            addCriterion("CreatedByID >", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidGreaterThanOrEqualTo(String value) {
            addCriterion("CreatedByID >=", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidLessThan(String value) {
            addCriterion("CreatedByID <", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidLessThanOrEqualTo(String value) {
            addCriterion("CreatedByID <=", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidLike(String value) {
            addCriterion("CreatedByID like", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidNotLike(String value) {
            addCriterion("CreatedByID not like", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidIn(List<String> values) {
            addCriterion("CreatedByID in", values, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidNotIn(List<String> values) {
            addCriterion("CreatedByID not in", values, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidBetween(String value1, String value2) {
            addCriterion("CreatedByID between", value1, value2, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidNotBetween(String value1, String value2) {
            addCriterion("CreatedByID not between", value1, value2, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DeptID is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DeptID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(String value) {
            addCriterion("DeptID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(String value) {
            addCriterion("DeptID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(String value) {
            addCriterion("DeptID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("DeptID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(String value) {
            addCriterion("DeptID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(String value) {
            addCriterion("DeptID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLike(String value) {
            addCriterion("DeptID like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotLike(String value) {
            addCriterion("DeptID not like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<String> values) {
            addCriterion("DeptID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<String> values) {
            addCriterion("DeptID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(String value1, String value2) {
            addCriterion("DeptID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(String value1, String value2) {
            addCriterion("DeptID not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("OrgID is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("OrgID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("OrgID =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("OrgID <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("OrgID >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("OrgID >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("OrgID <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("OrgID <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("OrgID like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("OrgID not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("OrgID in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("OrgID not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("OrgID between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("OrgID not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andReviseddateIsNull() {
            addCriterion("RevisedDate is null");
            return (Criteria) this;
        }

        public Criteria andReviseddateIsNotNull() {
            addCriterion("RevisedDate is not null");
            return (Criteria) this;
        }

        public Criteria andReviseddateEqualTo(Date value) {
            addCriterion("RevisedDate =", value, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateNotEqualTo(Date value) {
            addCriterion("RevisedDate <>", value, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateGreaterThan(Date value) {
            addCriterion("RevisedDate >", value, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateGreaterThanOrEqualTo(Date value) {
            addCriterion("RevisedDate >=", value, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateLessThan(Date value) {
            addCriterion("RevisedDate <", value, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateLessThanOrEqualTo(Date value) {
            addCriterion("RevisedDate <=", value, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateIn(List<Date> values) {
            addCriterion("RevisedDate in", values, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateNotIn(List<Date> values) {
            addCriterion("RevisedDate not in", values, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateBetween(Date value1, Date value2) {
            addCriterion("RevisedDate between", value1, value2, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateNotBetween(Date value1, Date value2) {
            addCriterion("RevisedDate not between", value1, value2, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andRevisedbyIsNull() {
            addCriterion("RevisedBy is null");
            return (Criteria) this;
        }

        public Criteria andRevisedbyIsNotNull() {
            addCriterion("RevisedBy is not null");
            return (Criteria) this;
        }

        public Criteria andRevisedbyEqualTo(String value) {
            addCriterion("RevisedBy =", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyNotEqualTo(String value) {
            addCriterion("RevisedBy <>", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyGreaterThan(String value) {
            addCriterion("RevisedBy >", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyGreaterThanOrEqualTo(String value) {
            addCriterion("RevisedBy >=", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyLessThan(String value) {
            addCriterion("RevisedBy <", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyLessThanOrEqualTo(String value) {
            addCriterion("RevisedBy <=", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyLike(String value) {
            addCriterion("RevisedBy like", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyNotLike(String value) {
            addCriterion("RevisedBy not like", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyIn(List<String> values) {
            addCriterion("RevisedBy in", values, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyNotIn(List<String> values) {
            addCriterion("RevisedBy not in", values, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyBetween(String value1, String value2) {
            addCriterion("RevisedBy between", value1, value2, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyNotBetween(String value1, String value2) {
            addCriterion("RevisedBy not between", value1, value2, "revisedby");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}