package com.yuerbao.gymms.match.model;

import java.util.ArrayList;
import java.util.List;

public class MatchQicaiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchQicaiExample() {
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

        public Criteria andTbIdIsNull() {
            addCriterion("tb_id is null");
            return (Criteria) this;
        }

        public Criteria andTbIdIsNotNull() {
            addCriterion("tb_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbIdEqualTo(Integer value) {
            addCriterion("tb_id =", value, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdNotEqualTo(Integer value) {
            addCriterion("tb_id <>", value, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdGreaterThan(Integer value) {
            addCriterion("tb_id >", value, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_id >=", value, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdLessThan(Integer value) {
            addCriterion("tb_id <", value, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdLessThanOrEqualTo(Integer value) {
            addCriterion("tb_id <=", value, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdIn(List<Integer> values) {
            addCriterion("tb_id in", values, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdNotIn(List<Integer> values) {
            addCriterion("tb_id not in", values, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdBetween(Integer value1, Integer value2) {
            addCriterion("tb_id between", value1, value2, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_id not between", value1, value2, "tbId");
            return (Criteria) this;
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

        public Criteria andQcIdIsNull() {
            addCriterion("qc_id is null");
            return (Criteria) this;
        }

        public Criteria andQcIdIsNotNull() {
            addCriterion("qc_id is not null");
            return (Criteria) this;
        }

        public Criteria andQcIdEqualTo(Integer value) {
            addCriterion("qc_id =", value, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdNotEqualTo(Integer value) {
            addCriterion("qc_id <>", value, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdGreaterThan(Integer value) {
            addCriterion("qc_id >", value, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qc_id >=", value, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdLessThan(Integer value) {
            addCriterion("qc_id <", value, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdLessThanOrEqualTo(Integer value) {
            addCriterion("qc_id <=", value, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdIn(List<Integer> values) {
            addCriterion("qc_id in", values, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdNotIn(List<Integer> values) {
            addCriterion("qc_id not in", values, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdBetween(Integer value1, Integer value2) {
            addCriterion("qc_id between", value1, value2, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qc_id not between", value1, value2, "qcId");
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