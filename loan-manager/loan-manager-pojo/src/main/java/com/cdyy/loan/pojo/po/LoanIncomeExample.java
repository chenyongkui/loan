package com.cdyy.loan.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanIncomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanIncomeExample() {
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

        public Criteria andIidIsNull() {
            addCriterion("iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Long value) {
            addCriterion("iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Long value) {
            addCriterion("iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Long value) {
            addCriterion("iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Long value) {
            addCriterion("iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Long value) {
            addCriterion("iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Long value) {
            addCriterion("iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Long> values) {
            addCriterion("iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Long> values) {
            addCriterion("iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Long value1, Long value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Long value1, Long value2) {
            addCriterion("iid not between", value1, value2, "iid");
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

        public Criteria andItypeIsNull() {
            addCriterion("itype is null");
            return (Criteria) this;
        }

        public Criteria andItypeIsNotNull() {
            addCriterion("itype is not null");
            return (Criteria) this;
        }

        public Criteria andItypeEqualTo(Integer value) {
            addCriterion("itype =", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeNotEqualTo(Integer value) {
            addCriterion("itype <>", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeGreaterThan(Integer value) {
            addCriterion("itype >", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("itype >=", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeLessThan(Integer value) {
            addCriterion("itype <", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeLessThanOrEqualTo(Integer value) {
            addCriterion("itype <=", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeIn(List<Integer> values) {
            addCriterion("itype in", values, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeNotIn(List<Integer> values) {
            addCriterion("itype not in", values, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeBetween(Integer value1, Integer value2) {
            addCriterion("itype between", value1, value2, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeNotBetween(Integer value1, Integer value2) {
            addCriterion("itype not between", value1, value2, "itype");
            return (Criteria) this;
        }

        public Criteria andImoneyIsNull() {
            addCriterion("imoney is null");
            return (Criteria) this;
        }

        public Criteria andImoneyIsNotNull() {
            addCriterion("imoney is not null");
            return (Criteria) this;
        }

        public Criteria andImoneyEqualTo(Double value) {
            addCriterion("imoney =", value, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyNotEqualTo(Double value) {
            addCriterion("imoney <>", value, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyGreaterThan(Double value) {
            addCriterion("imoney >", value, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("imoney >=", value, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyLessThan(Double value) {
            addCriterion("imoney <", value, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyLessThanOrEqualTo(Double value) {
            addCriterion("imoney <=", value, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyIn(List<Double> values) {
            addCriterion("imoney in", values, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyNotIn(List<Double> values) {
            addCriterion("imoney not in", values, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyBetween(Double value1, Double value2) {
            addCriterion("imoney between", value1, value2, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyNotBetween(Double value1, Double value2) {
            addCriterion("imoney not between", value1, value2, "imoney");
            return (Criteria) this;
        }

        public Criteria andItimeIsNull() {
            addCriterion("itime is null");
            return (Criteria) this;
        }

        public Criteria andItimeIsNotNull() {
            addCriterion("itime is not null");
            return (Criteria) this;
        }

        public Criteria andItimeEqualTo(Date value) {
            addCriterion("itime =", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeNotEqualTo(Date value) {
            addCriterion("itime <>", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeGreaterThan(Date value) {
            addCriterion("itime >", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeGreaterThanOrEqualTo(Date value) {
            addCriterion("itime >=", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeLessThan(Date value) {
            addCriterion("itime <", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeLessThanOrEqualTo(Date value) {
            addCriterion("itime <=", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeIn(List<Date> values) {
            addCriterion("itime in", values, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeNotIn(List<Date> values) {
            addCriterion("itime not in", values, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeBetween(Date value1, Date value2) {
            addCriterion("itime between", value1, value2, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeNotBetween(Date value1, Date value2) {
            addCriterion("itime not between", value1, value2, "itime");
            return (Criteria) this;
        }

        public Criteria andIremarksIsNull() {
            addCriterion("iremarks is null");
            return (Criteria) this;
        }

        public Criteria andIremarksIsNotNull() {
            addCriterion("iremarks is not null");
            return (Criteria) this;
        }

        public Criteria andIremarksEqualTo(String value) {
            addCriterion("iremarks =", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksNotEqualTo(String value) {
            addCriterion("iremarks <>", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksGreaterThan(String value) {
            addCriterion("iremarks >", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksGreaterThanOrEqualTo(String value) {
            addCriterion("iremarks >=", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksLessThan(String value) {
            addCriterion("iremarks <", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksLessThanOrEqualTo(String value) {
            addCriterion("iremarks <=", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksLike(String value) {
            addCriterion("iremarks like", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksNotLike(String value) {
            addCriterion("iremarks not like", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksIn(List<String> values) {
            addCriterion("iremarks in", values, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksNotIn(List<String> values) {
            addCriterion("iremarks not in", values, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksBetween(String value1, String value2) {
            addCriterion("iremarks between", value1, value2, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksNotBetween(String value1, String value2) {
            addCriterion("iremarks not between", value1, value2, "iremarks");
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