package com.cdyy.loan.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanCustomerProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanCustomerProductExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnumberIsNull() {
            addCriterion("pnumber is null");
            return (Criteria) this;
        }

        public Criteria andPnumberIsNotNull() {
            addCriterion("pnumber is not null");
            return (Criteria) this;
        }

        public Criteria andPnumberEqualTo(Integer value) {
            addCriterion("pnumber =", value, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberNotEqualTo(Integer value) {
            addCriterion("pnumber <>", value, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberGreaterThan(Integer value) {
            addCriterion("pnumber >", value, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("pnumber >=", value, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberLessThan(Integer value) {
            addCriterion("pnumber <", value, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberLessThanOrEqualTo(Integer value) {
            addCriterion("pnumber <=", value, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberIn(List<Integer> values) {
            addCriterion("pnumber in", values, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberNotIn(List<Integer> values) {
            addCriterion("pnumber not in", values, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberBetween(Integer value1, Integer value2) {
            addCriterion("pnumber between", value1, value2, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("pnumber not between", value1, value2, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPperiodsIsNull() {
            addCriterion("pperiods is null");
            return (Criteria) this;
        }

        public Criteria andPperiodsIsNotNull() {
            addCriterion("pperiods is not null");
            return (Criteria) this;
        }

        public Criteria andPperiodsEqualTo(Integer value) {
            addCriterion("pperiods =", value, "pperiods");
            return (Criteria) this;
        }

        public Criteria andPperiodsNotEqualTo(Integer value) {
            addCriterion("pperiods <>", value, "pperiods");
            return (Criteria) this;
        }

        public Criteria andPperiodsGreaterThan(Integer value) {
            addCriterion("pperiods >", value, "pperiods");
            return (Criteria) this;
        }

        public Criteria andPperiodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pperiods >=", value, "pperiods");
            return (Criteria) this;
        }

        public Criteria andPperiodsLessThan(Integer value) {
            addCriterion("pperiods <", value, "pperiods");
            return (Criteria) this;
        }

        public Criteria andPperiodsLessThanOrEqualTo(Integer value) {
            addCriterion("pperiods <=", value, "pperiods");
            return (Criteria) this;
        }

        public Criteria andPperiodsIn(List<Integer> values) {
            addCriterion("pperiods in", values, "pperiods");
            return (Criteria) this;
        }

        public Criteria andPperiodsNotIn(List<Integer> values) {
            addCriterion("pperiods not in", values, "pperiods");
            return (Criteria) this;
        }

        public Criteria andPperiodsBetween(Integer value1, Integer value2) {
            addCriterion("pperiods between", value1, value2, "pperiods");
            return (Criteria) this;
        }

        public Criteria andPperiodsNotBetween(Integer value1, Integer value2) {
            addCriterion("pperiods not between", value1, value2, "pperiods");
            return (Criteria) this;
        }

        public Criteria andPstarttimeIsNull() {
            addCriterion("pstarttime is null");
            return (Criteria) this;
        }

        public Criteria andPstarttimeIsNotNull() {
            addCriterion("pstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andPstarttimeEqualTo(Date value) {
            addCriterion("pstarttime =", value, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeNotEqualTo(Date value) {
            addCriterion("pstarttime <>", value, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeGreaterThan(Date value) {
            addCriterion("pstarttime >", value, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pstarttime >=", value, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeLessThan(Date value) {
            addCriterion("pstarttime <", value, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("pstarttime <=", value, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeIn(List<Date> values) {
            addCriterion("pstarttime in", values, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeNotIn(List<Date> values) {
            addCriterion("pstarttime not in", values, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeBetween(Date value1, Date value2) {
            addCriterion("pstarttime between", value1, value2, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("pstarttime not between", value1, value2, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPendtimeIsNull() {
            addCriterion("pendtime is null");
            return (Criteria) this;
        }

        public Criteria andPendtimeIsNotNull() {
            addCriterion("pendtime is not null");
            return (Criteria) this;
        }

        public Criteria andPendtimeEqualTo(Date value) {
            addCriterion("pendtime =", value, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeNotEqualTo(Date value) {
            addCriterion("pendtime <>", value, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeGreaterThan(Date value) {
            addCriterion("pendtime >", value, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pendtime >=", value, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeLessThan(Date value) {
            addCriterion("pendtime <", value, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeLessThanOrEqualTo(Date value) {
            addCriterion("pendtime <=", value, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeIn(List<Date> values) {
            addCriterion("pendtime in", values, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeNotIn(List<Date> values) {
            addCriterion("pendtime not in", values, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeBetween(Date value1, Date value2) {
            addCriterion("pendtime between", value1, value2, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeNotBetween(Date value1, Date value2) {
            addCriterion("pendtime not between", value1, value2, "pendtime");
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