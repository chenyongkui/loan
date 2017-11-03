package com.cdyy.loan.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanWithdrawalsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanWithdrawalsExample() {
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

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Long value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Long value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Long value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Long value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Long value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Long value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Long> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Long> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Long value1, Long value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Long value1, Long value2) {
            addCriterion("wid not between", value1, value2, "wid");
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Long value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Long value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Long value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Long value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Long value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Long value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Long> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Long> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Long value1, Long value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Long value1, Long value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andWmoneyIsNull() {
            addCriterion("wmoney is null");
            return (Criteria) this;
        }

        public Criteria andWmoneyIsNotNull() {
            addCriterion("wmoney is not null");
            return (Criteria) this;
        }

        public Criteria andWmoneyEqualTo(Double value) {
            addCriterion("wmoney =", value, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyNotEqualTo(Double value) {
            addCriterion("wmoney <>", value, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyGreaterThan(Double value) {
            addCriterion("wmoney >", value, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("wmoney >=", value, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyLessThan(Double value) {
            addCriterion("wmoney <", value, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyLessThanOrEqualTo(Double value) {
            addCriterion("wmoney <=", value, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyIn(List<Double> values) {
            addCriterion("wmoney in", values, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyNotIn(List<Double> values) {
            addCriterion("wmoney not in", values, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyBetween(Double value1, Double value2) {
            addCriterion("wmoney between", value1, value2, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyNotBetween(Double value1, Double value2) {
            addCriterion("wmoney not between", value1, value2, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWcounterfeeIsNull() {
            addCriterion("wcounterfee is null");
            return (Criteria) this;
        }

        public Criteria andWcounterfeeIsNotNull() {
            addCriterion("wcounterfee is not null");
            return (Criteria) this;
        }

        public Criteria andWcounterfeeEqualTo(Double value) {
            addCriterion("wcounterfee =", value, "wcounterfee");
            return (Criteria) this;
        }

        public Criteria andWcounterfeeNotEqualTo(Double value) {
            addCriterion("wcounterfee <>", value, "wcounterfee");
            return (Criteria) this;
        }

        public Criteria andWcounterfeeGreaterThan(Double value) {
            addCriterion("wcounterfee >", value, "wcounterfee");
            return (Criteria) this;
        }

        public Criteria andWcounterfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("wcounterfee >=", value, "wcounterfee");
            return (Criteria) this;
        }

        public Criteria andWcounterfeeLessThan(Double value) {
            addCriterion("wcounterfee <", value, "wcounterfee");
            return (Criteria) this;
        }

        public Criteria andWcounterfeeLessThanOrEqualTo(Double value) {
            addCriterion("wcounterfee <=", value, "wcounterfee");
            return (Criteria) this;
        }

        public Criteria andWcounterfeeIn(List<Double> values) {
            addCriterion("wcounterfee in", values, "wcounterfee");
            return (Criteria) this;
        }

        public Criteria andWcounterfeeNotIn(List<Double> values) {
            addCriterion("wcounterfee not in", values, "wcounterfee");
            return (Criteria) this;
        }

        public Criteria andWcounterfeeBetween(Double value1, Double value2) {
            addCriterion("wcounterfee between", value1, value2, "wcounterfee");
            return (Criteria) this;
        }

        public Criteria andWcounterfeeNotBetween(Double value1, Double value2) {
            addCriterion("wcounterfee not between", value1, value2, "wcounterfee");
            return (Criteria) this;
        }

        public Criteria andWactualIsNull() {
            addCriterion("wactual is null");
            return (Criteria) this;
        }

        public Criteria andWactualIsNotNull() {
            addCriterion("wactual is not null");
            return (Criteria) this;
        }

        public Criteria andWactualEqualTo(Double value) {
            addCriterion("wactual =", value, "wactual");
            return (Criteria) this;
        }

        public Criteria andWactualNotEqualTo(Double value) {
            addCriterion("wactual <>", value, "wactual");
            return (Criteria) this;
        }

        public Criteria andWactualGreaterThan(Double value) {
            addCriterion("wactual >", value, "wactual");
            return (Criteria) this;
        }

        public Criteria andWactualGreaterThanOrEqualTo(Double value) {
            addCriterion("wactual >=", value, "wactual");
            return (Criteria) this;
        }

        public Criteria andWactualLessThan(Double value) {
            addCriterion("wactual <", value, "wactual");
            return (Criteria) this;
        }

        public Criteria andWactualLessThanOrEqualTo(Double value) {
            addCriterion("wactual <=", value, "wactual");
            return (Criteria) this;
        }

        public Criteria andWactualIn(List<Double> values) {
            addCriterion("wactual in", values, "wactual");
            return (Criteria) this;
        }

        public Criteria andWactualNotIn(List<Double> values) {
            addCriterion("wactual not in", values, "wactual");
            return (Criteria) this;
        }

        public Criteria andWactualBetween(Double value1, Double value2) {
            addCriterion("wactual between", value1, value2, "wactual");
            return (Criteria) this;
        }

        public Criteria andWactualNotBetween(Double value1, Double value2) {
            addCriterion("wactual not between", value1, value2, "wactual");
            return (Criteria) this;
        }

        public Criteria andWstateIsNull() {
            addCriterion("wstate is null");
            return (Criteria) this;
        }

        public Criteria andWstateIsNotNull() {
            addCriterion("wstate is not null");
            return (Criteria) this;
        }

        public Criteria andWstateEqualTo(Integer value) {
            addCriterion("wstate =", value, "wstate");
            return (Criteria) this;
        }

        public Criteria andWstateNotEqualTo(Integer value) {
            addCriterion("wstate <>", value, "wstate");
            return (Criteria) this;
        }

        public Criteria andWstateGreaterThan(Integer value) {
            addCriterion("wstate >", value, "wstate");
            return (Criteria) this;
        }

        public Criteria andWstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("wstate >=", value, "wstate");
            return (Criteria) this;
        }

        public Criteria andWstateLessThan(Integer value) {
            addCriterion("wstate <", value, "wstate");
            return (Criteria) this;
        }

        public Criteria andWstateLessThanOrEqualTo(Integer value) {
            addCriterion("wstate <=", value, "wstate");
            return (Criteria) this;
        }

        public Criteria andWstateIn(List<Integer> values) {
            addCriterion("wstate in", values, "wstate");
            return (Criteria) this;
        }

        public Criteria andWstateNotIn(List<Integer> values) {
            addCriterion("wstate not in", values, "wstate");
            return (Criteria) this;
        }

        public Criteria andWstateBetween(Integer value1, Integer value2) {
            addCriterion("wstate between", value1, value2, "wstate");
            return (Criteria) this;
        }

        public Criteria andWstateNotBetween(Integer value1, Integer value2) {
            addCriterion("wstate not between", value1, value2, "wstate");
            return (Criteria) this;
        }

        public Criteria andWtimeIsNull() {
            addCriterion("wtime is null");
            return (Criteria) this;
        }

        public Criteria andWtimeIsNotNull() {
            addCriterion("wtime is not null");
            return (Criteria) this;
        }

        public Criteria andWtimeEqualTo(Date value) {
            addCriterion("wtime =", value, "wtime");
            return (Criteria) this;
        }

        public Criteria andWtimeNotEqualTo(Date value) {
            addCriterion("wtime <>", value, "wtime");
            return (Criteria) this;
        }

        public Criteria andWtimeGreaterThan(Date value) {
            addCriterion("wtime >", value, "wtime");
            return (Criteria) this;
        }

        public Criteria andWtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("wtime >=", value, "wtime");
            return (Criteria) this;
        }

        public Criteria andWtimeLessThan(Date value) {
            addCriterion("wtime <", value, "wtime");
            return (Criteria) this;
        }

        public Criteria andWtimeLessThanOrEqualTo(Date value) {
            addCriterion("wtime <=", value, "wtime");
            return (Criteria) this;
        }

        public Criteria andWtimeIn(List<Date> values) {
            addCriterion("wtime in", values, "wtime");
            return (Criteria) this;
        }

        public Criteria andWtimeNotIn(List<Date> values) {
            addCriterion("wtime not in", values, "wtime");
            return (Criteria) this;
        }

        public Criteria andWtimeBetween(Date value1, Date value2) {
            addCriterion("wtime between", value1, value2, "wtime");
            return (Criteria) this;
        }

        public Criteria andWtimeNotBetween(Date value1, Date value2) {
            addCriterion("wtime not between", value1, value2, "wtime");
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