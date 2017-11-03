package com.cdyy.loan.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanExpenditureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanExpenditureExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Long value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Long value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Long value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Long value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Long value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Long value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Long> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Long> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Long value1, Long value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Long value1, Long value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andEtypeIsNull() {
            addCriterion("etype is null");
            return (Criteria) this;
        }

        public Criteria andEtypeIsNotNull() {
            addCriterion("etype is not null");
            return (Criteria) this;
        }

        public Criteria andEtypeEqualTo(Integer value) {
            addCriterion("etype =", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeNotEqualTo(Integer value) {
            addCriterion("etype <>", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeGreaterThan(Integer value) {
            addCriterion("etype >", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("etype >=", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeLessThan(Integer value) {
            addCriterion("etype <", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeLessThanOrEqualTo(Integer value) {
            addCriterion("etype <=", value, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeIn(List<Integer> values) {
            addCriterion("etype in", values, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeNotIn(List<Integer> values) {
            addCriterion("etype not in", values, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeBetween(Integer value1, Integer value2) {
            addCriterion("etype between", value1, value2, "etype");
            return (Criteria) this;
        }

        public Criteria andEtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("etype not between", value1, value2, "etype");
            return (Criteria) this;
        }

        public Criteria andEmoneyIsNull() {
            addCriterion("emoney is null");
            return (Criteria) this;
        }

        public Criteria andEmoneyIsNotNull() {
            addCriterion("emoney is not null");
            return (Criteria) this;
        }

        public Criteria andEmoneyEqualTo(Double value) {
            addCriterion("emoney =", value, "emoney");
            return (Criteria) this;
        }

        public Criteria andEmoneyNotEqualTo(Double value) {
            addCriterion("emoney <>", value, "emoney");
            return (Criteria) this;
        }

        public Criteria andEmoneyGreaterThan(Double value) {
            addCriterion("emoney >", value, "emoney");
            return (Criteria) this;
        }

        public Criteria andEmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("emoney >=", value, "emoney");
            return (Criteria) this;
        }

        public Criteria andEmoneyLessThan(Double value) {
            addCriterion("emoney <", value, "emoney");
            return (Criteria) this;
        }

        public Criteria andEmoneyLessThanOrEqualTo(Double value) {
            addCriterion("emoney <=", value, "emoney");
            return (Criteria) this;
        }

        public Criteria andEmoneyIn(List<Double> values) {
            addCriterion("emoney in", values, "emoney");
            return (Criteria) this;
        }

        public Criteria andEmoneyNotIn(List<Double> values) {
            addCriterion("emoney not in", values, "emoney");
            return (Criteria) this;
        }

        public Criteria andEmoneyBetween(Double value1, Double value2) {
            addCriterion("emoney between", value1, value2, "emoney");
            return (Criteria) this;
        }

        public Criteria andEmoneyNotBetween(Double value1, Double value2) {
            addCriterion("emoney not between", value1, value2, "emoney");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNull() {
            addCriterion("etime is null");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNotNull() {
            addCriterion("etime is not null");
            return (Criteria) this;
        }

        public Criteria andEtimeEqualTo(Date value) {
            addCriterion("etime =", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotEqualTo(Date value) {
            addCriterion("etime <>", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThan(Date value) {
            addCriterion("etime >", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("etime >=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThan(Date value) {
            addCriterion("etime <", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThanOrEqualTo(Date value) {
            addCriterion("etime <=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeIn(List<Date> values) {
            addCriterion("etime in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotIn(List<Date> values) {
            addCriterion("etime not in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeBetween(Date value1, Date value2) {
            addCriterion("etime between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotBetween(Date value1, Date value2) {
            addCriterion("etime not between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andEremarksIsNull() {
            addCriterion("eremarks is null");
            return (Criteria) this;
        }

        public Criteria andEremarksIsNotNull() {
            addCriterion("eremarks is not null");
            return (Criteria) this;
        }

        public Criteria andEremarksEqualTo(String value) {
            addCriterion("eremarks =", value, "eremarks");
            return (Criteria) this;
        }

        public Criteria andEremarksNotEqualTo(String value) {
            addCriterion("eremarks <>", value, "eremarks");
            return (Criteria) this;
        }

        public Criteria andEremarksGreaterThan(String value) {
            addCriterion("eremarks >", value, "eremarks");
            return (Criteria) this;
        }

        public Criteria andEremarksGreaterThanOrEqualTo(String value) {
            addCriterion("eremarks >=", value, "eremarks");
            return (Criteria) this;
        }

        public Criteria andEremarksLessThan(String value) {
            addCriterion("eremarks <", value, "eremarks");
            return (Criteria) this;
        }

        public Criteria andEremarksLessThanOrEqualTo(String value) {
            addCriterion("eremarks <=", value, "eremarks");
            return (Criteria) this;
        }

        public Criteria andEremarksLike(String value) {
            addCriterion("eremarks like", value, "eremarks");
            return (Criteria) this;
        }

        public Criteria andEremarksNotLike(String value) {
            addCriterion("eremarks not like", value, "eremarks");
            return (Criteria) this;
        }

        public Criteria andEremarksIn(List<String> values) {
            addCriterion("eremarks in", values, "eremarks");
            return (Criteria) this;
        }

        public Criteria andEremarksNotIn(List<String> values) {
            addCriterion("eremarks not in", values, "eremarks");
            return (Criteria) this;
        }

        public Criteria andEremarksBetween(String value1, String value2) {
            addCriterion("eremarks between", value1, value2, "eremarks");
            return (Criteria) this;
        }

        public Criteria andEremarksNotBetween(String value1, String value2) {
            addCriterion("eremarks not between", value1, value2, "eremarks");
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