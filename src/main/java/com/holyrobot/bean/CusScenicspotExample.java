package com.holyrobot.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CusScenicspotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CusScenicspotExample() {
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

        public Criteria andScenicnameIsNull() {
            addCriterion("ScenicName is null");
            return (Criteria) this;
        }

        public Criteria andScenicnameIsNotNull() {
            addCriterion("ScenicName is not null");
            return (Criteria) this;
        }

        public Criteria andScenicnameEqualTo(String value) {
            addCriterion("ScenicName =", value, "scenicname");
            return (Criteria) this;
        }

        public Criteria andScenicnameNotEqualTo(String value) {
            addCriterion("ScenicName <>", value, "scenicname");
            return (Criteria) this;
        }

        public Criteria andScenicnameGreaterThan(String value) {
            addCriterion("ScenicName >", value, "scenicname");
            return (Criteria) this;
        }

        public Criteria andScenicnameGreaterThanOrEqualTo(String value) {
            addCriterion("ScenicName >=", value, "scenicname");
            return (Criteria) this;
        }

        public Criteria andScenicnameLessThan(String value) {
            addCriterion("ScenicName <", value, "scenicname");
            return (Criteria) this;
        }

        public Criteria andScenicnameLessThanOrEqualTo(String value) {
            addCriterion("ScenicName <=", value, "scenicname");
            return (Criteria) this;
        }

        public Criteria andScenicnameLike(String value) {
            addCriterion("ScenicName like", value, "scenicname");
            return (Criteria) this;
        }

        public Criteria andScenicnameNotLike(String value) {
            addCriterion("ScenicName not like", value, "scenicname");
            return (Criteria) this;
        }

        public Criteria andScenicnameIn(List<String> values) {
            addCriterion("ScenicName in", values, "scenicname");
            return (Criteria) this;
        }

        public Criteria andScenicnameNotIn(List<String> values) {
            addCriterion("ScenicName not in", values, "scenicname");
            return (Criteria) this;
        }

        public Criteria andScenicnameBetween(String value1, String value2) {
            addCriterion("ScenicName between", value1, value2, "scenicname");
            return (Criteria) this;
        }

        public Criteria andScenicnameNotBetween(String value1, String value2) {
            addCriterion("ScenicName not between", value1, value2, "scenicname");
            return (Criteria) this;
        }

        public Criteria andScenicsummaryIsNull() {
            addCriterion("ScenicSummary is null");
            return (Criteria) this;
        }

        public Criteria andScenicsummaryIsNotNull() {
            addCriterion("ScenicSummary is not null");
            return (Criteria) this;
        }

        public Criteria andScenicsummaryEqualTo(String value) {
            addCriterion("ScenicSummary =", value, "scenicsummary");
            return (Criteria) this;
        }

        public Criteria andScenicsummaryNotEqualTo(String value) {
            addCriterion("ScenicSummary <>", value, "scenicsummary");
            return (Criteria) this;
        }

        public Criteria andScenicsummaryGreaterThan(String value) {
            addCriterion("ScenicSummary >", value, "scenicsummary");
            return (Criteria) this;
        }

        public Criteria andScenicsummaryGreaterThanOrEqualTo(String value) {
            addCriterion("ScenicSummary >=", value, "scenicsummary");
            return (Criteria) this;
        }

        public Criteria andScenicsummaryLessThan(String value) {
            addCriterion("ScenicSummary <", value, "scenicsummary");
            return (Criteria) this;
        }

        public Criteria andScenicsummaryLessThanOrEqualTo(String value) {
            addCriterion("ScenicSummary <=", value, "scenicsummary");
            return (Criteria) this;
        }

        public Criteria andScenicsummaryLike(String value) {
            addCriterion("ScenicSummary like", value, "scenicsummary");
            return (Criteria) this;
        }

        public Criteria andScenicsummaryNotLike(String value) {
            addCriterion("ScenicSummary not like", value, "scenicsummary");
            return (Criteria) this;
        }

        public Criteria andScenicsummaryIn(List<String> values) {
            addCriterion("ScenicSummary in", values, "scenicsummary");
            return (Criteria) this;
        }

        public Criteria andScenicsummaryNotIn(List<String> values) {
            addCriterion("ScenicSummary not in", values, "scenicsummary");
            return (Criteria) this;
        }

        public Criteria andScenicsummaryBetween(String value1, String value2) {
            addCriterion("ScenicSummary between", value1, value2, "scenicsummary");
            return (Criteria) this;
        }

        public Criteria andScenicsummaryNotBetween(String value1, String value2) {
            addCriterion("ScenicSummary not between", value1, value2, "scenicsummary");
            return (Criteria) this;
        }

        public Criteria andSpellIsNull() {
            addCriterion("Spell is null");
            return (Criteria) this;
        }

        public Criteria andSpellIsNotNull() {
            addCriterion("Spell is not null");
            return (Criteria) this;
        }

        public Criteria andSpellEqualTo(String value) {
            addCriterion("Spell =", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotEqualTo(String value) {
            addCriterion("Spell <>", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellGreaterThan(String value) {
            addCriterion("Spell >", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellGreaterThanOrEqualTo(String value) {
            addCriterion("Spell >=", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLessThan(String value) {
            addCriterion("Spell <", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLessThanOrEqualTo(String value) {
            addCriterion("Spell <=", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLike(String value) {
            addCriterion("Spell like", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotLike(String value) {
            addCriterion("Spell not like", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellIn(List<String> values) {
            addCriterion("Spell in", values, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotIn(List<String> values) {
            addCriterion("Spell not in", values, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellBetween(String value1, String value2) {
            addCriterion("Spell between", value1, value2, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotBetween(String value1, String value2) {
            addCriterion("Spell not between", value1, value2, "spell");
            return (Criteria) this;
        }

        public Criteria andDestinationidIsNull() {
            addCriterion("DestinationID is null");
            return (Criteria) this;
        }

        public Criteria andDestinationidIsNotNull() {
            addCriterion("DestinationID is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationidEqualTo(String value) {
            addCriterion("DestinationID =", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidNotEqualTo(String value) {
            addCriterion("DestinationID <>", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidGreaterThan(String value) {
            addCriterion("DestinationID >", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidGreaterThanOrEqualTo(String value) {
            addCriterion("DestinationID >=", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidLessThan(String value) {
            addCriterion("DestinationID <", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidLessThanOrEqualTo(String value) {
            addCriterion("DestinationID <=", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidLike(String value) {
            addCriterion("DestinationID like", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidNotLike(String value) {
            addCriterion("DestinationID not like", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidIn(List<String> values) {
            addCriterion("DestinationID in", values, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidNotIn(List<String> values) {
            addCriterion("DestinationID not in", values, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidBetween(String value1, String value2) {
            addCriterion("DestinationID between", value1, value2, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidNotBetween(String value1, String value2) {
            addCriterion("DestinationID not between", value1, value2, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationnameIsNull() {
            addCriterion("DestinationName is null");
            return (Criteria) this;
        }

        public Criteria andDestinationnameIsNotNull() {
            addCriterion("DestinationName is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationnameEqualTo(String value) {
            addCriterion("DestinationName =", value, "destinationname");
            return (Criteria) this;
        }

        public Criteria andDestinationnameNotEqualTo(String value) {
            addCriterion("DestinationName <>", value, "destinationname");
            return (Criteria) this;
        }

        public Criteria andDestinationnameGreaterThan(String value) {
            addCriterion("DestinationName >", value, "destinationname");
            return (Criteria) this;
        }

        public Criteria andDestinationnameGreaterThanOrEqualTo(String value) {
            addCriterion("DestinationName >=", value, "destinationname");
            return (Criteria) this;
        }

        public Criteria andDestinationnameLessThan(String value) {
            addCriterion("DestinationName <", value, "destinationname");
            return (Criteria) this;
        }

        public Criteria andDestinationnameLessThanOrEqualTo(String value) {
            addCriterion("DestinationName <=", value, "destinationname");
            return (Criteria) this;
        }

        public Criteria andDestinationnameLike(String value) {
            addCriterion("DestinationName like", value, "destinationname");
            return (Criteria) this;
        }

        public Criteria andDestinationnameNotLike(String value) {
            addCriterion("DestinationName not like", value, "destinationname");
            return (Criteria) this;
        }

        public Criteria andDestinationnameIn(List<String> values) {
            addCriterion("DestinationName in", values, "destinationname");
            return (Criteria) this;
        }

        public Criteria andDestinationnameNotIn(List<String> values) {
            addCriterion("DestinationName not in", values, "destinationname");
            return (Criteria) this;
        }

        public Criteria andDestinationnameBetween(String value1, String value2) {
            addCriterion("DestinationName between", value1, value2, "destinationname");
            return (Criteria) this;
        }

        public Criteria andDestinationnameNotBetween(String value1, String value2) {
            addCriterion("DestinationName not between", value1, value2, "destinationname");
            return (Criteria) this;
        }

        public Criteria andIshotIsNull() {
            addCriterion("IsHot is null");
            return (Criteria) this;
        }

        public Criteria andIshotIsNotNull() {
            addCriterion("IsHot is not null");
            return (Criteria) this;
        }

        public Criteria andIshotEqualTo(Boolean value) {
            addCriterion("IsHot =", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotEqualTo(Boolean value) {
            addCriterion("IsHot <>", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThan(Boolean value) {
            addCriterion("IsHot >", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsHot >=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThan(Boolean value) {
            addCriterion("IsHot <", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThanOrEqualTo(Boolean value) {
            addCriterion("IsHot <=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotIn(List<Boolean> values) {
            addCriterion("IsHot in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotIn(List<Boolean> values) {
            addCriterion("IsHot not in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsHot between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsHot not between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIsshoppingIsNull() {
            addCriterion("IsShopping is null");
            return (Criteria) this;
        }

        public Criteria andIsshoppingIsNotNull() {
            addCriterion("IsShopping is not null");
            return (Criteria) this;
        }

        public Criteria andIsshoppingEqualTo(Boolean value) {
            addCriterion("IsShopping =", value, "isshopping");
            return (Criteria) this;
        }

        public Criteria andIsshoppingNotEqualTo(Boolean value) {
            addCriterion("IsShopping <>", value, "isshopping");
            return (Criteria) this;
        }

        public Criteria andIsshoppingGreaterThan(Boolean value) {
            addCriterion("IsShopping >", value, "isshopping");
            return (Criteria) this;
        }

        public Criteria andIsshoppingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsShopping >=", value, "isshopping");
            return (Criteria) this;
        }

        public Criteria andIsshoppingLessThan(Boolean value) {
            addCriterion("IsShopping <", value, "isshopping");
            return (Criteria) this;
        }

        public Criteria andIsshoppingLessThanOrEqualTo(Boolean value) {
            addCriterion("IsShopping <=", value, "isshopping");
            return (Criteria) this;
        }

        public Criteria andIsshoppingIn(List<Boolean> values) {
            addCriterion("IsShopping in", values, "isshopping");
            return (Criteria) this;
        }

        public Criteria andIsshoppingNotIn(List<Boolean> values) {
            addCriterion("IsShopping not in", values, "isshopping");
            return (Criteria) this;
        }

        public Criteria andIsshoppingBetween(Boolean value1, Boolean value2) {
            addCriterion("IsShopping between", value1, value2, "isshopping");
            return (Criteria) this;
        }

        public Criteria andIsshoppingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsShopping not between", value1, value2, "isshopping");
            return (Criteria) this;
        }

        public Criteria andIsextraitemIsNull() {
            addCriterion("IsExtraItem is null");
            return (Criteria) this;
        }

        public Criteria andIsextraitemIsNotNull() {
            addCriterion("IsExtraItem is not null");
            return (Criteria) this;
        }

        public Criteria andIsextraitemEqualTo(Boolean value) {
            addCriterion("IsExtraItem =", value, "isextraitem");
            return (Criteria) this;
        }

        public Criteria andIsextraitemNotEqualTo(Boolean value) {
            addCriterion("IsExtraItem <>", value, "isextraitem");
            return (Criteria) this;
        }

        public Criteria andIsextraitemGreaterThan(Boolean value) {
            addCriterion("IsExtraItem >", value, "isextraitem");
            return (Criteria) this;
        }

        public Criteria andIsextraitemGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsExtraItem >=", value, "isextraitem");
            return (Criteria) this;
        }

        public Criteria andIsextraitemLessThan(Boolean value) {
            addCriterion("IsExtraItem <", value, "isextraitem");
            return (Criteria) this;
        }

        public Criteria andIsextraitemLessThanOrEqualTo(Boolean value) {
            addCriterion("IsExtraItem <=", value, "isextraitem");
            return (Criteria) this;
        }

        public Criteria andIsextraitemIn(List<Boolean> values) {
            addCriterion("IsExtraItem in", values, "isextraitem");
            return (Criteria) this;
        }

        public Criteria andIsextraitemNotIn(List<Boolean> values) {
            addCriterion("IsExtraItem not in", values, "isextraitem");
            return (Criteria) this;
        }

        public Criteria andIsextraitemBetween(Boolean value1, Boolean value2) {
            addCriterion("IsExtraItem between", value1, value2, "isextraitem");
            return (Criteria) this;
        }

        public Criteria andIsextraitemNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsExtraItem not between", value1, value2, "isextraitem");
            return (Criteria) this;
        }

        public Criteria andMincostIsNull() {
            addCriterion("MinCost is null");
            return (Criteria) this;
        }

        public Criteria andMincostIsNotNull() {
            addCriterion("MinCost is not null");
            return (Criteria) this;
        }

        public Criteria andMincostEqualTo(BigDecimal value) {
            addCriterion("MinCost =", value, "mincost");
            return (Criteria) this;
        }

        public Criteria andMincostNotEqualTo(BigDecimal value) {
            addCriterion("MinCost <>", value, "mincost");
            return (Criteria) this;
        }

        public Criteria andMincostGreaterThan(BigDecimal value) {
            addCriterion("MinCost >", value, "mincost");
            return (Criteria) this;
        }

        public Criteria andMincostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MinCost >=", value, "mincost");
            return (Criteria) this;
        }

        public Criteria andMincostLessThan(BigDecimal value) {
            addCriterion("MinCost <", value, "mincost");
            return (Criteria) this;
        }

        public Criteria andMincostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MinCost <=", value, "mincost");
            return (Criteria) this;
        }

        public Criteria andMincostIn(List<BigDecimal> values) {
            addCriterion("MinCost in", values, "mincost");
            return (Criteria) this;
        }

        public Criteria andMincostNotIn(List<BigDecimal> values) {
            addCriterion("MinCost not in", values, "mincost");
            return (Criteria) this;
        }

        public Criteria andMincostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MinCost between", value1, value2, "mincost");
            return (Criteria) this;
        }

        public Criteria andMincostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MinCost not between", value1, value2, "mincost");
            return (Criteria) this;
        }

        public Criteria andMaxcostIsNull() {
            addCriterion("MaxCost is null");
            return (Criteria) this;
        }

        public Criteria andMaxcostIsNotNull() {
            addCriterion("MaxCost is not null");
            return (Criteria) this;
        }

        public Criteria andMaxcostEqualTo(BigDecimal value) {
            addCriterion("MaxCost =", value, "maxcost");
            return (Criteria) this;
        }

        public Criteria andMaxcostNotEqualTo(BigDecimal value) {
            addCriterion("MaxCost <>", value, "maxcost");
            return (Criteria) this;
        }

        public Criteria andMaxcostGreaterThan(BigDecimal value) {
            addCriterion("MaxCost >", value, "maxcost");
            return (Criteria) this;
        }

        public Criteria andMaxcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MaxCost >=", value, "maxcost");
            return (Criteria) this;
        }

        public Criteria andMaxcostLessThan(BigDecimal value) {
            addCriterion("MaxCost <", value, "maxcost");
            return (Criteria) this;
        }

        public Criteria andMaxcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MaxCost <=", value, "maxcost");
            return (Criteria) this;
        }

        public Criteria andMaxcostIn(List<BigDecimal> values) {
            addCriterion("MaxCost in", values, "maxcost");
            return (Criteria) this;
        }

        public Criteria andMaxcostNotIn(List<BigDecimal> values) {
            addCriterion("MaxCost not in", values, "maxcost");
            return (Criteria) this;
        }

        public Criteria andMaxcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MaxCost between", value1, value2, "maxcost");
            return (Criteria) this;
        }

        public Criteria andMaxcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MaxCost not between", value1, value2, "maxcost");
            return (Criteria) this;
        }

        public Criteria andIsmultipleIsNull() {
            addCriterion("IsMultiple is null");
            return (Criteria) this;
        }

        public Criteria andIsmultipleIsNotNull() {
            addCriterion("IsMultiple is not null");
            return (Criteria) this;
        }

        public Criteria andIsmultipleEqualTo(Boolean value) {
            addCriterion("IsMultiple =", value, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleNotEqualTo(Boolean value) {
            addCriterion("IsMultiple <>", value, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleGreaterThan(Boolean value) {
            addCriterion("IsMultiple >", value, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsMultiple >=", value, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleLessThan(Boolean value) {
            addCriterion("IsMultiple <", value, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleLessThanOrEqualTo(Boolean value) {
            addCriterion("IsMultiple <=", value, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleIn(List<Boolean> values) {
            addCriterion("IsMultiple in", values, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleNotIn(List<Boolean> values) {
            addCriterion("IsMultiple not in", values, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleBetween(Boolean value1, Boolean value2) {
            addCriterion("IsMultiple between", value1, value2, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsMultiple not between", value1, value2, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andScenicintroductionIsNull() {
            addCriterion("ScenicIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andScenicintroductionIsNotNull() {
            addCriterion("ScenicIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andScenicintroductionEqualTo(String value) {
            addCriterion("ScenicIntroduction =", value, "scenicintroduction");
            return (Criteria) this;
        }

        public Criteria andScenicintroductionNotEqualTo(String value) {
            addCriterion("ScenicIntroduction <>", value, "scenicintroduction");
            return (Criteria) this;
        }

        public Criteria andScenicintroductionGreaterThan(String value) {
            addCriterion("ScenicIntroduction >", value, "scenicintroduction");
            return (Criteria) this;
        }

        public Criteria andScenicintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("ScenicIntroduction >=", value, "scenicintroduction");
            return (Criteria) this;
        }

        public Criteria andScenicintroductionLessThan(String value) {
            addCriterion("ScenicIntroduction <", value, "scenicintroduction");
            return (Criteria) this;
        }

        public Criteria andScenicintroductionLessThanOrEqualTo(String value) {
            addCriterion("ScenicIntroduction <=", value, "scenicintroduction");
            return (Criteria) this;
        }

        public Criteria andScenicintroductionLike(String value) {
            addCriterion("ScenicIntroduction like", value, "scenicintroduction");
            return (Criteria) this;
        }

        public Criteria andScenicintroductionNotLike(String value) {
            addCriterion("ScenicIntroduction not like", value, "scenicintroduction");
            return (Criteria) this;
        }

        public Criteria andScenicintroductionIn(List<String> values) {
            addCriterion("ScenicIntroduction in", values, "scenicintroduction");
            return (Criteria) this;
        }

        public Criteria andScenicintroductionNotIn(List<String> values) {
            addCriterion("ScenicIntroduction not in", values, "scenicintroduction");
            return (Criteria) this;
        }

        public Criteria andScenicintroductionBetween(String value1, String value2) {
            addCriterion("ScenicIntroduction between", value1, value2, "scenicintroduction");
            return (Criteria) this;
        }

        public Criteria andScenicintroductionNotBetween(String value1, String value2) {
            addCriterion("ScenicIntroduction not between", value1, value2, "scenicintroduction");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("ShortName is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("ShortName is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("ShortName =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("ShortName <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("ShortName >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("ShortName >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("ShortName <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("ShortName <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("ShortName like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("ShortName not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("ShortName in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("ShortName not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("ShortName between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("ShortName not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andSortindexIsNull() {
            addCriterion("SortIndex is null");
            return (Criteria) this;
        }

        public Criteria andSortindexIsNotNull() {
            addCriterion("SortIndex is not null");
            return (Criteria) this;
        }

        public Criteria andSortindexEqualTo(Integer value) {
            addCriterion("SortIndex =", value, "sortindex");
            return (Criteria) this;
        }

        public Criteria andSortindexNotEqualTo(Integer value) {
            addCriterion("SortIndex <>", value, "sortindex");
            return (Criteria) this;
        }

        public Criteria andSortindexGreaterThan(Integer value) {
            addCriterion("SortIndex >", value, "sortindex");
            return (Criteria) this;
        }

        public Criteria andSortindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("SortIndex >=", value, "sortindex");
            return (Criteria) this;
        }

        public Criteria andSortindexLessThan(Integer value) {
            addCriterion("SortIndex <", value, "sortindex");
            return (Criteria) this;
        }

        public Criteria andSortindexLessThanOrEqualTo(Integer value) {
            addCriterion("SortIndex <=", value, "sortindex");
            return (Criteria) this;
        }

        public Criteria andSortindexIn(List<Integer> values) {
            addCriterion("SortIndex in", values, "sortindex");
            return (Criteria) this;
        }

        public Criteria andSortindexNotIn(List<Integer> values) {
            addCriterion("SortIndex not in", values, "sortindex");
            return (Criteria) this;
        }

        public Criteria andSortindexBetween(Integer value1, Integer value2) {
            addCriterion("SortIndex between", value1, value2, "sortindex");
            return (Criteria) this;
        }

        public Criteria andSortindexNotBetween(Integer value1, Integer value2) {
            addCriterion("SortIndex not between", value1, value2, "sortindex");
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