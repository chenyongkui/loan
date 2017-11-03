package com.cdyy.loan.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanLoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanLoanExample() {
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

        public Criteria andLidIsNull() {
            addCriterion("lid is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("lid is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(Long value) {
            addCriterion("lid =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(Long value) {
            addCriterion("lid <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(Long value) {
            addCriterion("lid >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(Long value) {
            addCriterion("lid >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(Long value) {
            addCriterion("lid <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(Long value) {
            addCriterion("lid <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<Long> values) {
            addCriterion("lid in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<Long> values) {
            addCriterion("lid not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(Long value1, Long value2) {
            addCriterion("lid between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(Long value1, Long value2) {
            addCriterion("lid not between", value1, value2, "lid");
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

        public Criteria andLmoneyIsNull() {
            addCriterion("lmoney is null");
            return (Criteria) this;
        }

        public Criteria andLmoneyIsNotNull() {
            addCriterion("lmoney is not null");
            return (Criteria) this;
        }

        public Criteria andLmoneyEqualTo(Long value) {
            addCriterion("lmoney =", value, "lmoney");
            return (Criteria) this;
        }

        public Criteria andLmoneyNotEqualTo(Long value) {
            addCriterion("lmoney <>", value, "lmoney");
            return (Criteria) this;
        }

        public Criteria andLmoneyGreaterThan(Long value) {
            addCriterion("lmoney >", value, "lmoney");
            return (Criteria) this;
        }

        public Criteria andLmoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("lmoney >=", value, "lmoney");
            return (Criteria) this;
        }

        public Criteria andLmoneyLessThan(Long value) {
            addCriterion("lmoney <", value, "lmoney");
            return (Criteria) this;
        }

        public Criteria andLmoneyLessThanOrEqualTo(Long value) {
            addCriterion("lmoney <=", value, "lmoney");
            return (Criteria) this;
        }

        public Criteria andLmoneyIn(List<Long> values) {
            addCriterion("lmoney in", values, "lmoney");
            return (Criteria) this;
        }

        public Criteria andLmoneyNotIn(List<Long> values) {
            addCriterion("lmoney not in", values, "lmoney");
            return (Criteria) this;
        }

        public Criteria andLmoneyBetween(Long value1, Long value2) {
            addCriterion("lmoney between", value1, value2, "lmoney");
            return (Criteria) this;
        }

        public Criteria andLmoneyNotBetween(Long value1, Long value2) {
            addCriterion("lmoney not between", value1, value2, "lmoney");
            return (Criteria) this;
        }

        public Criteria andLrateIsNull() {
            addCriterion("lrate is null");
            return (Criteria) this;
        }

        public Criteria andLrateIsNotNull() {
            addCriterion("lrate is not null");
            return (Criteria) this;
        }

        public Criteria andLrateEqualTo(Double value) {
            addCriterion("lrate =", value, "lrate");
            return (Criteria) this;
        }

        public Criteria andLrateNotEqualTo(Double value) {
            addCriterion("lrate <>", value, "lrate");
            return (Criteria) this;
        }

        public Criteria andLrateGreaterThan(Double value) {
            addCriterion("lrate >", value, "lrate");
            return (Criteria) this;
        }

        public Criteria andLrateGreaterThanOrEqualTo(Double value) {
            addCriterion("lrate >=", value, "lrate");
            return (Criteria) this;
        }

        public Criteria andLrateLessThan(Double value) {
            addCriterion("lrate <", value, "lrate");
            return (Criteria) this;
        }

        public Criteria andLrateLessThanOrEqualTo(Double value) {
            addCriterion("lrate <=", value, "lrate");
            return (Criteria) this;
        }

        public Criteria andLrateIn(List<Double> values) {
            addCriterion("lrate in", values, "lrate");
            return (Criteria) this;
        }

        public Criteria andLrateNotIn(List<Double> values) {
            addCriterion("lrate not in", values, "lrate");
            return (Criteria) this;
        }

        public Criteria andLrateBetween(Double value1, Double value2) {
            addCriterion("lrate between", value1, value2, "lrate");
            return (Criteria) this;
        }

        public Criteria andLrateNotBetween(Double value1, Double value2) {
            addCriterion("lrate not between", value1, value2, "lrate");
            return (Criteria) this;
        }

        public Criteria andLtermIsNull() {
            addCriterion("lterm is null");
            return (Criteria) this;
        }

        public Criteria andLtermIsNotNull() {
            addCriterion("lterm is not null");
            return (Criteria) this;
        }

        public Criteria andLtermEqualTo(Integer value) {
            addCriterion("lterm =", value, "lterm");
            return (Criteria) this;
        }

        public Criteria andLtermNotEqualTo(Integer value) {
            addCriterion("lterm <>", value, "lterm");
            return (Criteria) this;
        }

        public Criteria andLtermGreaterThan(Integer value) {
            addCriterion("lterm >", value, "lterm");
            return (Criteria) this;
        }

        public Criteria andLtermGreaterThanOrEqualTo(Integer value) {
            addCriterion("lterm >=", value, "lterm");
            return (Criteria) this;
        }

        public Criteria andLtermLessThan(Integer value) {
            addCriterion("lterm <", value, "lterm");
            return (Criteria) this;
        }

        public Criteria andLtermLessThanOrEqualTo(Integer value) {
            addCriterion("lterm <=", value, "lterm");
            return (Criteria) this;
        }

        public Criteria andLtermIn(List<Integer> values) {
            addCriterion("lterm in", values, "lterm");
            return (Criteria) this;
        }

        public Criteria andLtermNotIn(List<Integer> values) {
            addCriterion("lterm not in", values, "lterm");
            return (Criteria) this;
        }

        public Criteria andLtermBetween(Integer value1, Integer value2) {
            addCriterion("lterm between", value1, value2, "lterm");
            return (Criteria) this;
        }

        public Criteria andLtermNotBetween(Integer value1, Integer value2) {
            addCriterion("lterm not between", value1, value2, "lterm");
            return (Criteria) this;
        }

        public Criteria andLclassIsNull() {
            addCriterion("lclass is null");
            return (Criteria) this;
        }

        public Criteria andLclassIsNotNull() {
            addCriterion("lclass is not null");
            return (Criteria) this;
        }

        public Criteria andLclassEqualTo(Integer value) {
            addCriterion("lclass =", value, "lclass");
            return (Criteria) this;
        }

        public Criteria andLclassNotEqualTo(Integer value) {
            addCriterion("lclass <>", value, "lclass");
            return (Criteria) this;
        }

        public Criteria andLclassGreaterThan(Integer value) {
            addCriterion("lclass >", value, "lclass");
            return (Criteria) this;
        }

        public Criteria andLclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("lclass >=", value, "lclass");
            return (Criteria) this;
        }

        public Criteria andLclassLessThan(Integer value) {
            addCriterion("lclass <", value, "lclass");
            return (Criteria) this;
        }

        public Criteria andLclassLessThanOrEqualTo(Integer value) {
            addCriterion("lclass <=", value, "lclass");
            return (Criteria) this;
        }

        public Criteria andLclassIn(List<Integer> values) {
            addCriterion("lclass in", values, "lclass");
            return (Criteria) this;
        }

        public Criteria andLclassNotIn(List<Integer> values) {
            addCriterion("lclass not in", values, "lclass");
            return (Criteria) this;
        }

        public Criteria andLclassBetween(Integer value1, Integer value2) {
            addCriterion("lclass between", value1, value2, "lclass");
            return (Criteria) this;
        }

        public Criteria andLclassNotBetween(Integer value1, Integer value2) {
            addCriterion("lclass not between", value1, value2, "lclass");
            return (Criteria) this;
        }

        public Criteria andLtypeIsNull() {
            addCriterion("ltype is null");
            return (Criteria) this;
        }

        public Criteria andLtypeIsNotNull() {
            addCriterion("ltype is not null");
            return (Criteria) this;
        }

        public Criteria andLtypeEqualTo(Integer value) {
            addCriterion("ltype =", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeNotEqualTo(Integer value) {
            addCriterion("ltype <>", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeGreaterThan(Integer value) {
            addCriterion("ltype >", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ltype >=", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeLessThan(Integer value) {
            addCriterion("ltype <", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeLessThanOrEqualTo(Integer value) {
            addCriterion("ltype <=", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeIn(List<Integer> values) {
            addCriterion("ltype in", values, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeNotIn(List<Integer> values) {
            addCriterion("ltype not in", values, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeBetween(Integer value1, Integer value2) {
            addCriterion("ltype between", value1, value2, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ltype not between", value1, value2, "ltype");
            return (Criteria) this;
        }

        public Criteria andLstateIsNull() {
            addCriterion("lstate is null");
            return (Criteria) this;
        }

        public Criteria andLstateIsNotNull() {
            addCriterion("lstate is not null");
            return (Criteria) this;
        }

        public Criteria andLstateEqualTo(Integer value) {
            addCriterion("lstate =", value, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateNotEqualTo(Integer value) {
            addCriterion("lstate <>", value, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateGreaterThan(Integer value) {
            addCriterion("lstate >", value, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("lstate >=", value, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateLessThan(Integer value) {
            addCriterion("lstate <", value, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateLessThanOrEqualTo(Integer value) {
            addCriterion("lstate <=", value, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateIn(List<Integer> values) {
            addCriterion("lstate in", values, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateNotIn(List<Integer> values) {
            addCriterion("lstate not in", values, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateBetween(Integer value1, Integer value2) {
            addCriterion("lstate between", value1, value2, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateNotBetween(Integer value1, Integer value2) {
            addCriterion("lstate not between", value1, value2, "lstate");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNull() {
            addCriterion("ltime is null");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNotNull() {
            addCriterion("ltime is not null");
            return (Criteria) this;
        }

        public Criteria andLtimeEqualTo(Date value) {
            addCriterion("ltime =", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotEqualTo(Date value) {
            addCriterion("ltime <>", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThan(Date value) {
            addCriterion("ltime >", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ltime >=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThan(Date value) {
            addCriterion("ltime <", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThanOrEqualTo(Date value) {
            addCriterion("ltime <=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeIn(List<Date> values) {
            addCriterion("ltime in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotIn(List<Date> values) {
            addCriterion("ltime not in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeBetween(Date value1, Date value2) {
            addCriterion("ltime between", value1, value2, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotBetween(Date value1, Date value2) {
            addCriterion("ltime not between", value1, value2, "ltime");
            return (Criteria) this;
        }

        public Criteria andLgettimeIsNull() {
            addCriterion("lgettime is null");
            return (Criteria) this;
        }

        public Criteria andLgettimeIsNotNull() {
            addCriterion("lgettime is not null");
            return (Criteria) this;
        }

        public Criteria andLgettimeEqualTo(Date value) {
            addCriterion("lgettime =", value, "lgettime");
            return (Criteria) this;
        }

        public Criteria andLgettimeNotEqualTo(Date value) {
            addCriterion("lgettime <>", value, "lgettime");
            return (Criteria) this;
        }

        public Criteria andLgettimeGreaterThan(Date value) {
            addCriterion("lgettime >", value, "lgettime");
            return (Criteria) this;
        }

        public Criteria andLgettimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lgettime >=", value, "lgettime");
            return (Criteria) this;
        }

        public Criteria andLgettimeLessThan(Date value) {
            addCriterion("lgettime <", value, "lgettime");
            return (Criteria) this;
        }

        public Criteria andLgettimeLessThanOrEqualTo(Date value) {
            addCriterion("lgettime <=", value, "lgettime");
            return (Criteria) this;
        }

        public Criteria andLgettimeIn(List<Date> values) {
            addCriterion("lgettime in", values, "lgettime");
            return (Criteria) this;
        }

        public Criteria andLgettimeNotIn(List<Date> values) {
            addCriterion("lgettime not in", values, "lgettime");
            return (Criteria) this;
        }

        public Criteria andLgettimeBetween(Date value1, Date value2) {
            addCriterion("lgettime between", value1, value2, "lgettime");
            return (Criteria) this;
        }

        public Criteria andLgettimeNotBetween(Date value1, Date value2) {
            addCriterion("lgettime not between", value1, value2, "lgettime");
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