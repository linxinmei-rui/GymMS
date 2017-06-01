package com.yuerbao.gymms.match.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchBookingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchBookingExample() {
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

        public Criteria andBkIdIsNull() {
            addCriterion("bk_id is null");
            return (Criteria) this;
        }

        public Criteria andBkIdIsNotNull() {
            addCriterion("bk_id is not null");
            return (Criteria) this;
        }

        public Criteria andBkIdEqualTo(Integer value) {
            addCriterion("bk_id =", value, "bkId");
            return (Criteria) this;
        }

        public Criteria andBkIdNotEqualTo(Integer value) {
            addCriterion("bk_id <>", value, "bkId");
            return (Criteria) this;
        }

        public Criteria andBkIdGreaterThan(Integer value) {
            addCriterion("bk_id >", value, "bkId");
            return (Criteria) this;
        }

        public Criteria andBkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bk_id >=", value, "bkId");
            return (Criteria) this;
        }

        public Criteria andBkIdLessThan(Integer value) {
            addCriterion("bk_id <", value, "bkId");
            return (Criteria) this;
        }

        public Criteria andBkIdLessThanOrEqualTo(Integer value) {
            addCriterion("bk_id <=", value, "bkId");
            return (Criteria) this;
        }

        public Criteria andBkIdIn(List<Integer> values) {
            addCriterion("bk_id in", values, "bkId");
            return (Criteria) this;
        }

        public Criteria andBkIdNotIn(List<Integer> values) {
            addCriterion("bk_id not in", values, "bkId");
            return (Criteria) this;
        }

        public Criteria andBkIdBetween(Integer value1, Integer value2) {
            addCriterion("bk_id between", value1, value2, "bkId");
            return (Criteria) this;
        }

        public Criteria andBkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bk_id not between", value1, value2, "bkId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMatchNameIsNull() {
            addCriterion("match_name is null");
            return (Criteria) this;
        }

        public Criteria andMatchNameIsNotNull() {
            addCriterion("match_name is not null");
            return (Criteria) this;
        }

        public Criteria andMatchNameEqualTo(String value) {
            addCriterion("match_name =", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameNotEqualTo(String value) {
            addCriterion("match_name <>", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameGreaterThan(String value) {
            addCriterion("match_name >", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameGreaterThanOrEqualTo(String value) {
            addCriterion("match_name >=", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameLessThan(String value) {
            addCriterion("match_name <", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameLessThanOrEqualTo(String value) {
            addCriterion("match_name <=", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameLike(String value) {
            addCriterion("match_name like", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameNotLike(String value) {
            addCriterion("match_name not like", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameIn(List<String> values) {
            addCriterion("match_name in", values, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameNotIn(List<String> values) {
            addCriterion("match_name not in", values, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameBetween(String value1, String value2) {
            addCriterion("match_name between", value1, value2, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameNotBetween(String value1, String value2) {
            addCriterion("match_name not between", value1, value2, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchDescIsNull() {
            addCriterion("match_desc is null");
            return (Criteria) this;
        }

        public Criteria andMatchDescIsNotNull() {
            addCriterion("match_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMatchDescEqualTo(String value) {
            addCriterion("match_desc =", value, "matchDesc");
            return (Criteria) this;
        }

        public Criteria andMatchDescNotEqualTo(String value) {
            addCriterion("match_desc <>", value, "matchDesc");
            return (Criteria) this;
        }

        public Criteria andMatchDescGreaterThan(String value) {
            addCriterion("match_desc >", value, "matchDesc");
            return (Criteria) this;
        }

        public Criteria andMatchDescGreaterThanOrEqualTo(String value) {
            addCriterion("match_desc >=", value, "matchDesc");
            return (Criteria) this;
        }

        public Criteria andMatchDescLessThan(String value) {
            addCriterion("match_desc <", value, "matchDesc");
            return (Criteria) this;
        }

        public Criteria andMatchDescLessThanOrEqualTo(String value) {
            addCriterion("match_desc <=", value, "matchDesc");
            return (Criteria) this;
        }

        public Criteria andMatchDescLike(String value) {
            addCriterion("match_desc like", value, "matchDesc");
            return (Criteria) this;
        }

        public Criteria andMatchDescNotLike(String value) {
            addCriterion("match_desc not like", value, "matchDesc");
            return (Criteria) this;
        }

        public Criteria andMatchDescIn(List<String> values) {
            addCriterion("match_desc in", values, "matchDesc");
            return (Criteria) this;
        }

        public Criteria andMatchDescNotIn(List<String> values) {
            addCriterion("match_desc not in", values, "matchDesc");
            return (Criteria) this;
        }

        public Criteria andMatchDescBetween(String value1, String value2) {
            addCriterion("match_desc between", value1, value2, "matchDesc");
            return (Criteria) this;
        }

        public Criteria andMatchDescNotBetween(String value1, String value2) {
            addCriterion("match_desc not between", value1, value2, "matchDesc");
            return (Criteria) this;
        }

        public Criteria andQcDescIsNull() {
            addCriterion("qc_desc is null");
            return (Criteria) this;
        }

        public Criteria andQcDescIsNotNull() {
            addCriterion("qc_desc is not null");
            return (Criteria) this;
        }

        public Criteria andQcDescEqualTo(String value) {
            addCriterion("qc_desc =", value, "qcDesc");
            return (Criteria) this;
        }

        public Criteria andQcDescNotEqualTo(String value) {
            addCriterion("qc_desc <>", value, "qcDesc");
            return (Criteria) this;
        }

        public Criteria andQcDescGreaterThan(String value) {
            addCriterion("qc_desc >", value, "qcDesc");
            return (Criteria) this;
        }

        public Criteria andQcDescGreaterThanOrEqualTo(String value) {
            addCriterion("qc_desc >=", value, "qcDesc");
            return (Criteria) this;
        }

        public Criteria andQcDescLessThan(String value) {
            addCriterion("qc_desc <", value, "qcDesc");
            return (Criteria) this;
        }

        public Criteria andQcDescLessThanOrEqualTo(String value) {
            addCriterion("qc_desc <=", value, "qcDesc");
            return (Criteria) this;
        }

        public Criteria andQcDescLike(String value) {
            addCriterion("qc_desc like", value, "qcDesc");
            return (Criteria) this;
        }

        public Criteria andQcDescNotLike(String value) {
            addCriterion("qc_desc not like", value, "qcDesc");
            return (Criteria) this;
        }

        public Criteria andQcDescIn(List<String> values) {
            addCriterion("qc_desc in", values, "qcDesc");
            return (Criteria) this;
        }

        public Criteria andQcDescNotIn(List<String> values) {
            addCriterion("qc_desc not in", values, "qcDesc");
            return (Criteria) this;
        }

        public Criteria andQcDescBetween(String value1, String value2) {
            addCriterion("qc_desc between", value1, value2, "qcDesc");
            return (Criteria) this;
        }

        public Criteria andQcDescNotBetween(String value1, String value2) {
            addCriterion("qc_desc not between", value1, value2, "qcDesc");
            return (Criteria) this;
        }

        public Criteria andCdDescIsNull() {
            addCriterion("cd_desc is null");
            return (Criteria) this;
        }

        public Criteria andCdDescIsNotNull() {
            addCriterion("cd_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCdDescEqualTo(String value) {
            addCriterion("cd_desc =", value, "cdDesc");
            return (Criteria) this;
        }

        public Criteria andCdDescNotEqualTo(String value) {
            addCriterion("cd_desc <>", value, "cdDesc");
            return (Criteria) this;
        }

        public Criteria andCdDescGreaterThan(String value) {
            addCriterion("cd_desc >", value, "cdDesc");
            return (Criteria) this;
        }

        public Criteria andCdDescGreaterThanOrEqualTo(String value) {
            addCriterion("cd_desc >=", value, "cdDesc");
            return (Criteria) this;
        }

        public Criteria andCdDescLessThan(String value) {
            addCriterion("cd_desc <", value, "cdDesc");
            return (Criteria) this;
        }

        public Criteria andCdDescLessThanOrEqualTo(String value) {
            addCriterion("cd_desc <=", value, "cdDesc");
            return (Criteria) this;
        }

        public Criteria andCdDescLike(String value) {
            addCriterion("cd_desc like", value, "cdDesc");
            return (Criteria) this;
        }

        public Criteria andCdDescNotLike(String value) {
            addCriterion("cd_desc not like", value, "cdDesc");
            return (Criteria) this;
        }

        public Criteria andCdDescIn(List<String> values) {
            addCriterion("cd_desc in", values, "cdDesc");
            return (Criteria) this;
        }

        public Criteria andCdDescNotIn(List<String> values) {
            addCriterion("cd_desc not in", values, "cdDesc");
            return (Criteria) this;
        }

        public Criteria andCdDescBetween(String value1, String value2) {
            addCriterion("cd_desc between", value1, value2, "cdDesc");
            return (Criteria) this;
        }

        public Criteria andCdDescNotBetween(String value1, String value2) {
            addCriterion("cd_desc not between", value1, value2, "cdDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescIsNull() {
            addCriterion("time_desc is null");
            return (Criteria) this;
        }

        public Criteria andTimeDescIsNotNull() {
            addCriterion("time_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTimeDescEqualTo(String value) {
            addCriterion("time_desc =", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescNotEqualTo(String value) {
            addCriterion("time_desc <>", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescGreaterThan(String value) {
            addCriterion("time_desc >", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescGreaterThanOrEqualTo(String value) {
            addCriterion("time_desc >=", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescLessThan(String value) {
            addCriterion("time_desc <", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescLessThanOrEqualTo(String value) {
            addCriterion("time_desc <=", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescLike(String value) {
            addCriterion("time_desc like", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescNotLike(String value) {
            addCriterion("time_desc not like", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescIn(List<String> values) {
            addCriterion("time_desc in", values, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescNotIn(List<String> values) {
            addCriterion("time_desc not in", values, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescBetween(String value1, String value2) {
            addCriterion("time_desc between", value1, value2, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescNotBetween(String value1, String value2) {
            addCriterion("time_desc not between", value1, value2, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andContactName1IsNull() {
            addCriterion("contact_name_1 is null");
            return (Criteria) this;
        }

        public Criteria andContactName1IsNotNull() {
            addCriterion("contact_name_1 is not null");
            return (Criteria) this;
        }

        public Criteria andContactName1EqualTo(String value) {
            addCriterion("contact_name_1 =", value, "contactName1");
            return (Criteria) this;
        }

        public Criteria andContactName1NotEqualTo(String value) {
            addCriterion("contact_name_1 <>", value, "contactName1");
            return (Criteria) this;
        }

        public Criteria andContactName1GreaterThan(String value) {
            addCriterion("contact_name_1 >", value, "contactName1");
            return (Criteria) this;
        }

        public Criteria andContactName1GreaterThanOrEqualTo(String value) {
            addCriterion("contact_name_1 >=", value, "contactName1");
            return (Criteria) this;
        }

        public Criteria andContactName1LessThan(String value) {
            addCriterion("contact_name_1 <", value, "contactName1");
            return (Criteria) this;
        }

        public Criteria andContactName1LessThanOrEqualTo(String value) {
            addCriterion("contact_name_1 <=", value, "contactName1");
            return (Criteria) this;
        }

        public Criteria andContactName1Like(String value) {
            addCriterion("contact_name_1 like", value, "contactName1");
            return (Criteria) this;
        }

        public Criteria andContactName1NotLike(String value) {
            addCriterion("contact_name_1 not like", value, "contactName1");
            return (Criteria) this;
        }

        public Criteria andContactName1In(List<String> values) {
            addCriterion("contact_name_1 in", values, "contactName1");
            return (Criteria) this;
        }

        public Criteria andContactName1NotIn(List<String> values) {
            addCriterion("contact_name_1 not in", values, "contactName1");
            return (Criteria) this;
        }

        public Criteria andContactName1Between(String value1, String value2) {
            addCriterion("contact_name_1 between", value1, value2, "contactName1");
            return (Criteria) this;
        }

        public Criteria andContactName1NotBetween(String value1, String value2) {
            addCriterion("contact_name_1 not between", value1, value2, "contactName1");
            return (Criteria) this;
        }

        public Criteria andContactPhone1IsNull() {
            addCriterion("contact_phone_1 is null");
            return (Criteria) this;
        }

        public Criteria andContactPhone1IsNotNull() {
            addCriterion("contact_phone_1 is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhone1EqualTo(String value) {
            addCriterion("contact_phone_1 =", value, "contactPhone1");
            return (Criteria) this;
        }

        public Criteria andContactPhone1NotEqualTo(String value) {
            addCriterion("contact_phone_1 <>", value, "contactPhone1");
            return (Criteria) this;
        }

        public Criteria andContactPhone1GreaterThan(String value) {
            addCriterion("contact_phone_1 >", value, "contactPhone1");
            return (Criteria) this;
        }

        public Criteria andContactPhone1GreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone_1 >=", value, "contactPhone1");
            return (Criteria) this;
        }

        public Criteria andContactPhone1LessThan(String value) {
            addCriterion("contact_phone_1 <", value, "contactPhone1");
            return (Criteria) this;
        }

        public Criteria andContactPhone1LessThanOrEqualTo(String value) {
            addCriterion("contact_phone_1 <=", value, "contactPhone1");
            return (Criteria) this;
        }

        public Criteria andContactPhone1Like(String value) {
            addCriterion("contact_phone_1 like", value, "contactPhone1");
            return (Criteria) this;
        }

        public Criteria andContactPhone1NotLike(String value) {
            addCriterion("contact_phone_1 not like", value, "contactPhone1");
            return (Criteria) this;
        }

        public Criteria andContactPhone1In(List<String> values) {
            addCriterion("contact_phone_1 in", values, "contactPhone1");
            return (Criteria) this;
        }

        public Criteria andContactPhone1NotIn(List<String> values) {
            addCriterion("contact_phone_1 not in", values, "contactPhone1");
            return (Criteria) this;
        }

        public Criteria andContactPhone1Between(String value1, String value2) {
            addCriterion("contact_phone_1 between", value1, value2, "contactPhone1");
            return (Criteria) this;
        }

        public Criteria andContactPhone1NotBetween(String value1, String value2) {
            addCriterion("contact_phone_1 not between", value1, value2, "contactPhone1");
            return (Criteria) this;
        }

        public Criteria andContactName2IsNull() {
            addCriterion("contact_name_2 is null");
            return (Criteria) this;
        }

        public Criteria andContactName2IsNotNull() {
            addCriterion("contact_name_2 is not null");
            return (Criteria) this;
        }

        public Criteria andContactName2EqualTo(String value) {
            addCriterion("contact_name_2 =", value, "contactName2");
            return (Criteria) this;
        }

        public Criteria andContactName2NotEqualTo(String value) {
            addCriterion("contact_name_2 <>", value, "contactName2");
            return (Criteria) this;
        }

        public Criteria andContactName2GreaterThan(String value) {
            addCriterion("contact_name_2 >", value, "contactName2");
            return (Criteria) this;
        }

        public Criteria andContactName2GreaterThanOrEqualTo(String value) {
            addCriterion("contact_name_2 >=", value, "contactName2");
            return (Criteria) this;
        }

        public Criteria andContactName2LessThan(String value) {
            addCriterion("contact_name_2 <", value, "contactName2");
            return (Criteria) this;
        }

        public Criteria andContactName2LessThanOrEqualTo(String value) {
            addCriterion("contact_name_2 <=", value, "contactName2");
            return (Criteria) this;
        }

        public Criteria andContactName2Like(String value) {
            addCriterion("contact_name_2 like", value, "contactName2");
            return (Criteria) this;
        }

        public Criteria andContactName2NotLike(String value) {
            addCriterion("contact_name_2 not like", value, "contactName2");
            return (Criteria) this;
        }

        public Criteria andContactName2In(List<String> values) {
            addCriterion("contact_name_2 in", values, "contactName2");
            return (Criteria) this;
        }

        public Criteria andContactName2NotIn(List<String> values) {
            addCriterion("contact_name_2 not in", values, "contactName2");
            return (Criteria) this;
        }

        public Criteria andContactName2Between(String value1, String value2) {
            addCriterion("contact_name_2 between", value1, value2, "contactName2");
            return (Criteria) this;
        }

        public Criteria andContactName2NotBetween(String value1, String value2) {
            addCriterion("contact_name_2 not between", value1, value2, "contactName2");
            return (Criteria) this;
        }

        public Criteria andContactPhone2IsNull() {
            addCriterion("contact_phone_2 is null");
            return (Criteria) this;
        }

        public Criteria andContactPhone2IsNotNull() {
            addCriterion("contact_phone_2 is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhone2EqualTo(String value) {
            addCriterion("contact_phone_2 =", value, "contactPhone2");
            return (Criteria) this;
        }

        public Criteria andContactPhone2NotEqualTo(String value) {
            addCriterion("contact_phone_2 <>", value, "contactPhone2");
            return (Criteria) this;
        }

        public Criteria andContactPhone2GreaterThan(String value) {
            addCriterion("contact_phone_2 >", value, "contactPhone2");
            return (Criteria) this;
        }

        public Criteria andContactPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone_2 >=", value, "contactPhone2");
            return (Criteria) this;
        }

        public Criteria andContactPhone2LessThan(String value) {
            addCriterion("contact_phone_2 <", value, "contactPhone2");
            return (Criteria) this;
        }

        public Criteria andContactPhone2LessThanOrEqualTo(String value) {
            addCriterion("contact_phone_2 <=", value, "contactPhone2");
            return (Criteria) this;
        }

        public Criteria andContactPhone2Like(String value) {
            addCriterion("contact_phone_2 like", value, "contactPhone2");
            return (Criteria) this;
        }

        public Criteria andContactPhone2NotLike(String value) {
            addCriterion("contact_phone_2 not like", value, "contactPhone2");
            return (Criteria) this;
        }

        public Criteria andContactPhone2In(List<String> values) {
            addCriterion("contact_phone_2 in", values, "contactPhone2");
            return (Criteria) this;
        }

        public Criteria andContactPhone2NotIn(List<String> values) {
            addCriterion("contact_phone_2 not in", values, "contactPhone2");
            return (Criteria) this;
        }

        public Criteria andContactPhone2Between(String value1, String value2) {
            addCriterion("contact_phone_2 between", value1, value2, "contactPhone2");
            return (Criteria) this;
        }

        public Criteria andContactPhone2NotBetween(String value1, String value2) {
            addCriterion("contact_phone_2 not between", value1, value2, "contactPhone2");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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