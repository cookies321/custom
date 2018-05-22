package com.holyrobot.bean;

import java.util.ArrayList;
import java.util.List;

public class CusCusinfoServicetypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CusCusinfoServicetypeExample() {
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

        public Criteria andServiertypeidIsNull() {
            addCriterion("ServierTypeID is null");
            return (Criteria) this;
        }

        public Criteria andServiertypeidIsNotNull() {
            addCriterion("ServierTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andServiertypeidEqualTo(String value) {
            addCriterion("ServierTypeID =", value, "serviertypeid");
            return (Criteria) this;
        }

        public Criteria andServiertypeidNotEqualTo(String value) {
            addCriterion("ServierTypeID <>", value, "serviertypeid");
            return (Criteria) this;
        }

        public Criteria andServiertypeidGreaterThan(String value) {
            addCriterion("ServierTypeID >", value, "serviertypeid");
            return (Criteria) this;
        }

        public Criteria andServiertypeidGreaterThanOrEqualTo(String value) {
            addCriterion("ServierTypeID >=", value, "serviertypeid");
            return (Criteria) this;
        }

        public Criteria andServiertypeidLessThan(String value) {
            addCriterion("ServierTypeID <", value, "serviertypeid");
            return (Criteria) this;
        }

        public Criteria andServiertypeidLessThanOrEqualTo(String value) {
            addCriterion("ServierTypeID <=", value, "serviertypeid");
            return (Criteria) this;
        }

        public Criteria andServiertypeidLike(String value) {
            addCriterion("ServierTypeID like", value, "serviertypeid");
            return (Criteria) this;
        }

        public Criteria andServiertypeidNotLike(String value) {
            addCriterion("ServierTypeID not like", value, "serviertypeid");
            return (Criteria) this;
        }

        public Criteria andServiertypeidIn(List<String> values) {
            addCriterion("ServierTypeID in", values, "serviertypeid");
            return (Criteria) this;
        }

        public Criteria andServiertypeidNotIn(List<String> values) {
            addCriterion("ServierTypeID not in", values, "serviertypeid");
            return (Criteria) this;
        }

        public Criteria andServiertypeidBetween(String value1, String value2) {
            addCriterion("ServierTypeID between", value1, value2, "serviertypeid");
            return (Criteria) this;
        }

        public Criteria andServiertypeidNotBetween(String value1, String value2) {
            addCriterion("ServierTypeID not between", value1, value2, "serviertypeid");
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