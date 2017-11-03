package com.cdyy.loan.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanRechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanRechargeExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Long value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Long value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Long value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Long value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Long value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Long value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Long> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Long> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Long value1, Long value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Long value1, Long value2) {
            addCriterion("rid not between", value1, value2, "rid");
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

        public Criteria andRtypeIsNull() {
            addCriterion("rtype is null");
            return (Criteria) this;
        }

        public Criteria andRtypeIsNotNull() {
            addCriterion("rtype is not null");
            return (Criteria) this;
        }

        public Criteria andRtypeEqualTo(Integer value) {
            addCriterion("rtype =", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotEqualTo(Integer value) {
            addCriterion("rtype <>", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThan(Integer value) {
            addCriterion("rtype >", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rtype >=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThan(Integer value) {
            addCriterion("rtype <", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThanOrEqualTo(Integer value) {
            addCriterion("rtype <=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeIn(List<Integer> values) {
            addCriterion("rtype in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotIn(List<Integer> values) {
            addCriterion("rtype not in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeBetween(Integer value1, Integer value2) {
            addCriterion("rtype between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rtype not between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andRbidIsNull() {
            addCriterion("rbid is null");
            return (Criteria) this;
        }

        public Criteria andRbidIsNotNull() {
            addCriterion("rbid is not null");
            return (Criteria) this;
        }

        public Criteria andRbidEqualTo(Long value) {
            addCriterion("rbid =", value, "rbid");
            return (Criteria) this;
        }

        public Criteria andRbidNotEqualTo(Long value) {
            addCriterion("rbid <>", value, "rbid");
            return (Criteria) this;
        }

        public Criteria andRbidGreaterThan(Long value) {
            addCriterion("rbid >", value, "rbid");
            return (Criteria) this;
        }

        public Criteria andRbidGreaterThanOrEqualTo(Long value) {
            addCriterion("rbid >=", value, "rbid");
            return (Criteria) this;
        }

        public Criteria andRbidLessThan(Long value) {
            addCriterion("rbid <", value, "rbid");
            return (Criteria) this;
        }

        public Criteria andRbidLessThanOrEqualTo(Long value) {
            addCriterion("rbid <=", value, "rbid");
            return (Criteria) this;
        }

        public Criteria andRbidIn(List<Long> values) {
            addCriterion("rbid in", values, "rbid");
            return (Criteria) this;
        }

        public Criteria andRbidNotIn(List<Long> values) {
            addCriterion("rbid not in", values, "rbid");
            return (Criteria) this;
        }

        public Criteria andRbidBetween(Long value1, Long value2) {
            addCriterion("rbid between", value1, value2, "rbid");
            return (Criteria) this;
        }

        public Criteria andRbidNotBetween(Long value1, Long value2) {
            addCriterion("rbid not between", value1, value2, "rbid");
            return (Criteria) this;
        }

        public Criteria andRmoneyIsNull() {
            addCriterion("rmoney is null");
            return (Criteria) this;
        }

        public Criteria andRmoneyIsNotNull() {
            addCriterion("rmoney is not null");
            return (Criteria) this;
        }

        public Criteria andRmoneyEqualTo(Double value) {
            addCriterion("rmoney =", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyNotEqualTo(Double value) {
            addCriterion("rmoney <>", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyGreaterThan(Double value) {
            addCriterion("rmoney >", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("rmoney >=", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyLessThan(Double value) {
            addCriterion("rmoney <", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyLessThanOrEqualTo(Double value) {
            addCriterion("rmoney <=", value, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyIn(List<Double> values) {
            addCriterion("rmoney in", values, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyNotIn(List<Double> values) {
            addCriterion("rmoney not in", values, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyBetween(Double value1, Double value2) {
            addCriterion("rmoney between", value1, value2, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRmoneyNotBetween(Double value1, Double value2) {
            addCriterion("rmoney not between", value1, value2, "rmoney");
            return (Criteria) this;
        }

        public Criteria andRcounterfeeIsNull() {
            addCriterion("rcounterfee is null");
            return (Criteria) this;
        }

        public Criteria andRcounterfeeIsNotNull() {
            addCriterion("rcounterfee is not null");
            return (Criteria) this;
        }

        public Criteria andRcounterfeeEqualTo(Double value) {
            addCriterion("rcounterfee =", value, "rcounterfee");
            return (Criteria) this;
        }

        public Criteria andRcounterfeeNotEqualTo(Double value) {
            addCriterion("rcounterfee <>", value, "rcounterfee");
            return (Criteria) this;
        }

        public Criteria andRcounterfeeGreaterThan(Double value) {
            addCriterion("rcounterfee >", value, "rcounterfee");
            return (Criteria) this;
        }

        public Criteria andRcounterfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("rcounterfee >=", value, "rcounterfee");
            return (Criteria) this;
        }

        public Criteria andRcounterfeeLessThan(Double value) {
            addCriterion("rcounterfee <", value, "rcounterfee");
            return (Criteria) this;
        }

        public Criteria andRcounterfeeLessThanOrEqualTo(Double value) {
            addCriterion("rcounterfee <=", value, "rcounterfee");
            return (Criteria) this;
        }

        public Criteria andRcounterfeeIn(List<Double> values) {
            addCriterion("rcounterfee in", values, "rcounterfee");
            return (Criteria) this;
        }

        public Criteria andRcounterfeeNotIn(List<Double> values) {
            addCriterion("rcounterfee not in", values, "rcounterfee");
            return (Criteria) this;
        }

        public Criteria andRcounterfeeBetween(Double value1, Double value2) {
            addCriterion("rcounterfee between", value1, value2, "rcounterfee");
            return (Criteria) this;
        }

        public Criteria andRcounterfeeNotBetween(Double value1, Double value2) {
            addCriterion("rcounterfee not between", value1, value2, "rcounterfee");
            return (Criteria) this;
        }

        public Criteria andRactualIsNull() {
            addCriterion("ractual is null");
            return (Criteria) this;
        }

        public Criteria andRactualIsNotNull() {
            addCriterion("ractual is not null");
            return (Criteria) this;
        }

        public Criteria andRactualEqualTo(Double value) {
            addCriterion("ractual =", value, "ractual");
            return (Criteria) this;
        }

        public Criteria andRactualNotEqualTo(Double value) {
            addCriterion("ractual <>", value, "ractual");
            return (Criteria) this;
        }

        public Criteria andRactualGreaterThan(Double value) {
            addCriterion("ractual >", value, "ractual");
            return (Criteria) this;
        }

        public Criteria andRactualGreaterThanOrEqualTo(Double value) {
            addCriterion("ractual >=", value, "ractual");
            return (Criteria) this;
        }

        public Criteria andRactualLessThan(Double value) {
            addCriterion("ractual <", value, "ractual");
            return (Criteria) this;
        }

        public Criteria andRactualLessThanOrEqualTo(Double value) {
            addCriterion("ractual <=", value, "ractual");
            return (Criteria) this;
        }

        public Criteria andRactualIn(List<Double> values) {
            addCriterion("ractual in", values, "ractual");
            return (Criteria) this;
        }

        public Criteria andRactualNotIn(List<Double> values) {
            addCriterion("ractual not in", values, "ractual");
            return (Criteria) this;
        }

        public Criteria andRactualBetween(Double value1, Double value2) {
            addCriterion("ractual between", value1, value2, "ractual");
            return (Criteria) this;
        }

        public Criteria andRactualNotBetween(Double value1, Double value2) {
            addCriterion("ractual not between", value1, value2, "ractual");
            return (Criteria) this;
        }

        public Criteria andRserialIsNull() {
            addCriterion("rserial is null");
            return (Criteria) this;
        }

        public Criteria andRserialIsNotNull() {
            addCriterion("rserial is not null");
            return (Criteria) this;
        }

        public Criteria andRserialEqualTo(String value) {
            addCriterion("rserial =", value, "rserial");
            return (Criteria) this;
        }

        public Criteria andRserialNotEqualTo(String value) {
            addCriterion("rserial <>", value, "rserial");
            return (Criteria) this;
        }

        public Criteria andRserialGreaterThan(String value) {
            addCriterion("rserial >", value, "rserial");
            return (Criteria) this;
        }

        public Criteria andRserialGreaterThanOrEqualTo(String value) {
            addCriterion("rserial >=", value, "rserial");
            return (Criteria) this;
        }

        public Criteria andRserialLessThan(String value) {
            addCriterion("rserial <", value, "rserial");
            return (Criteria) this;
        }

        public Criteria andRserialLessThanOrEqualTo(String value) {
            addCriterion("rserial <=", value, "rserial");
            return (Criteria) this;
        }

        public Criteria andRserialLike(String value) {
            addCriterion("rserial like", value, "rserial");
            return (Criteria) this;
        }

        public Criteria andRserialNotLike(String value) {
            addCriterion("rserial not like", value, "rserial");
            return (Criteria) this;
        }

        public Criteria andRserialIn(List<String> values) {
            addCriterion("rserial in", values, "rserial");
            return (Criteria) this;
        }

        public Criteria andRserialNotIn(List<String> values) {
            addCriterion("rserial not in", values, "rserial");
            return (Criteria) this;
        }

        public Criteria andRserialBetween(String value1, String value2) {
            addCriterion("rserial between", value1, value2, "rserial");
            return (Criteria) this;
        }

        public Criteria andRserialNotBetween(String value1, String value2) {
            addCriterion("rserial not between", value1, value2, "rserial");
            return (Criteria) this;
        }

        public Criteria andRstateIsNull() {
            addCriterion("rstate is null");
            return (Criteria) this;
        }

        public Criteria andRstateIsNotNull() {
            addCriterion("rstate is not null");
            return (Criteria) this;
        }

        public Criteria andRstateEqualTo(Integer value) {
            addCriterion("rstate =", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateNotEqualTo(Integer value) {
            addCriterion("rstate <>", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateGreaterThan(Integer value) {
            addCriterion("rstate >", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("rstate >=", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateLessThan(Integer value) {
            addCriterion("rstate <", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateLessThanOrEqualTo(Integer value) {
            addCriterion("rstate <=", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateIn(List<Integer> values) {
            addCriterion("rstate in", values, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateNotIn(List<Integer> values) {
            addCriterion("rstate not in", values, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateBetween(Integer value1, Integer value2) {
            addCriterion("rstate between", value1, value2, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateNotBetween(Integer value1, Integer value2) {
            addCriterion("rstate not between", value1, value2, "rstate");
            return (Criteria) this;
        }

        public Criteria andRtimeIsNull() {
            addCriterion("rtime is null");
            return (Criteria) this;
        }

        public Criteria andRtimeIsNotNull() {
            addCriterion("rtime is not null");
            return (Criteria) this;
        }

        public Criteria andRtimeEqualTo(Date value) {
            addCriterion("rtime =", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotEqualTo(Date value) {
            addCriterion("rtime <>", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeGreaterThan(Date value) {
            addCriterion("rtime >", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rtime >=", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLessThan(Date value) {
            addCriterion("rtime <", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLessThanOrEqualTo(Date value) {
            addCriterion("rtime <=", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeIn(List<Date> values) {
            addCriterion("rtime in", values, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotIn(List<Date> values) {
            addCriterion("rtime not in", values, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeBetween(Date value1, Date value2) {
            addCriterion("rtime between", value1, value2, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotBetween(Date value1, Date value2) {
            addCriterion("rtime not between", value1, value2, "rtime");
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