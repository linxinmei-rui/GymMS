package com.yuerbao.gymms.match.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchPlanExample() {
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

        public Criteria andMpIdIsNull() {
            addCriterion("mp_id is null");
            return (Criteria) this;
        }

        public Criteria andMpIdIsNotNull() {
            addCriterion("mp_id is not null");
            return (Criteria) this;
        }

        public Criteria andMpIdEqualTo(Integer value) {
            addCriterion("mp_id =", value, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdNotEqualTo(Integer value) {
            addCriterion("mp_id <>", value, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdGreaterThan(Integer value) {
            addCriterion("mp_id >", value, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mp_id >=", value, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdLessThan(Integer value) {
            addCriterion("mp_id <", value, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdLessThanOrEqualTo(Integer value) {
            addCriterion("mp_id <=", value, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdIn(List<Integer> values) {
            addCriterion("mp_id in", values, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdNotIn(List<Integer> values) {
            addCriterion("mp_id not in", values, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdBetween(Integer value1, Integer value2) {
            addCriterion("mp_id between", value1, value2, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mp_id not between", value1, value2, "mpId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Integer value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Integer value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Integer value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Integer value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Integer> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Integer> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andTimeOnIsNull() {
            addCriterion("time_on is null");
            return (Criteria) this;
        }

        public Criteria andTimeOnIsNotNull() {
            addCriterion("time_on is not null");
            return (Criteria) this;
        }

        public Criteria andTimeOnEqualTo(Date value) {
            addCriterion("time_on =", value, "timeOn");
            return (Criteria) this;
        }

        public Criteria andTimeOnNotEqualTo(Date value) {
            addCriterion("time_on <>", value, "timeOn");
            return (Criteria) this;
        }

        public Criteria andTimeOnGreaterThan(Date value) {
            addCriterion("time_on >", value, "timeOn");
            return (Criteria) this;
        }

        public Criteria andTimeOnGreaterThanOrEqualTo(Date value) {
            addCriterion("time_on >=", value, "timeOn");
            return (Criteria) this;
        }

        public Criteria andTimeOnLessThan(Date value) {
            addCriterion("time_on <", value, "timeOn");
            return (Criteria) this;
        }

        public Criteria andTimeOnLessThanOrEqualTo(Date value) {
            addCriterion("time_on <=", value, "timeOn");
            return (Criteria) this;
        }

        public Criteria andTimeOnIn(List<Date> values) {
            addCriterion("time_on in", values, "timeOn");
            return (Criteria) this;
        }

        public Criteria andTimeOnNotIn(List<Date> values) {
            addCriterion("time_on not in", values, "timeOn");
            return (Criteria) this;
        }

        public Criteria andTimeOnBetween(Date value1, Date value2) {
            addCriterion("time_on between", value1, value2, "timeOn");
            return (Criteria) this;
        }

        public Criteria andTimeOnNotBetween(Date value1, Date value2) {
            addCriterion("time_on not between", value1, value2, "timeOn");
            return (Criteria) this;
        }

        public Criteria andTimeOffIsNull() {
            addCriterion("time_off is null");
            return (Criteria) this;
        }

        public Criteria andTimeOffIsNotNull() {
            addCriterion("time_off is not null");
            return (Criteria) this;
        }

        public Criteria andTimeOffEqualTo(Date value) {
            addCriterion("time_off =", value, "timeOff");
            return (Criteria) this;
        }

        public Criteria andTimeOffNotEqualTo(Date value) {
            addCriterion("time_off <>", value, "timeOff");
            return (Criteria) this;
        }

        public Criteria andTimeOffGreaterThan(Date value) {
            addCriterion("time_off >", value, "timeOff");
            return (Criteria) this;
        }

        public Criteria andTimeOffGreaterThanOrEqualTo(Date value) {
            addCriterion("time_off >=", value, "timeOff");
            return (Criteria) this;
        }

        public Criteria andTimeOffLessThan(Date value) {
            addCriterion("time_off <", value, "timeOff");
            return (Criteria) this;
        }

        public Criteria andTimeOffLessThanOrEqualTo(Date value) {
            addCriterion("time_off <=", value, "timeOff");
            return (Criteria) this;
        }

        public Criteria andTimeOffIn(List<Date> values) {
            addCriterion("time_off in", values, "timeOff");
            return (Criteria) this;
        }

        public Criteria andTimeOffNotIn(List<Date> values) {
            addCriterion("time_off not in", values, "timeOff");
            return (Criteria) this;
        }

        public Criteria andTimeOffBetween(Date value1, Date value2) {
            addCriterion("time_off between", value1, value2, "timeOff");
            return (Criteria) this;
        }

        public Criteria andTimeOffNotBetween(Date value1, Date value2) {
            addCriterion("time_off not between", value1, value2, "timeOff");
            return (Criteria) this;
        }

        public Criteria andRentIsNull() {
            addCriterion("rent is null");
            return (Criteria) this;
        }

        public Criteria andRentIsNotNull() {
            addCriterion("rent is not null");
            return (Criteria) this;
        }

        public Criteria andRentEqualTo(Integer value) {
            addCriterion("rent =", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotEqualTo(Integer value) {
            addCriterion("rent <>", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThan(Integer value) {
            addCriterion("rent >", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent >=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThan(Integer value) {
            addCriterion("rent <", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThanOrEqualTo(Integer value) {
            addCriterion("rent <=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentIn(List<Integer> values) {
            addCriterion("rent in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotIn(List<Integer> values) {
            addCriterion("rent not in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentBetween(Integer value1, Integer value2) {
            addCriterion("rent between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotBetween(Integer value1, Integer value2) {
            addCriterion("rent not between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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