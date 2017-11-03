package com.cdyy.loan.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class LoanSysroleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanSysroleExample() {
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

        public Criteria andRoleidIsNull() {
            addCriterion("roleid is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Long value) {
            addCriterion("roleid =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Long value) {
            addCriterion("roleid <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Long value) {
            addCriterion("roleid >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Long value) {
            addCriterion("roleid >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Long value) {
            addCriterion("roleid <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Long value) {
            addCriterion("roleid <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Long> values) {
            addCriterion("roleid in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Long> values) {
            addCriterion("roleid not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Long value1, Long value2) {
            addCriterion("roleid between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Long value1, Long value2) {
            addCriterion("roleid not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNull() {
            addCriterion("rolename is null");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNotNull() {
            addCriterion("rolename is not null");
            return (Criteria) this;
        }

        public Criteria andRolenameEqualTo(String value) {
            addCriterion("rolename =", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotEqualTo(String value) {
            addCriterion("rolename <>", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThan(String value) {
            addCriterion("rolename >", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("rolename >=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThan(String value) {
            addCriterion("rolename <", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThanOrEqualTo(String value) {
            addCriterion("rolename <=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLike(String value) {
            addCriterion("rolename like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotLike(String value) {
            addCriterion("rolename not like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameIn(List<String> values) {
            addCriterion("rolename in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotIn(List<String> values) {
            addCriterion("rolename not in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameBetween(String value1, String value2) {
            addCriterion("rolename between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotBetween(String value1, String value2) {
            addCriterion("rolename not between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolestateIsNull() {
            addCriterion("rolestate is null");
            return (Criteria) this;
        }

        public Criteria andRolestateIsNotNull() {
            addCriterion("rolestate is not null");
            return (Criteria) this;
        }

        public Criteria andRolestateEqualTo(Integer value) {
            addCriterion("rolestate =", value, "rolestate");
            return (Criteria) this;
        }

        public Criteria andRolestateNotEqualTo(Integer value) {
            addCriterion("rolestate <>", value, "rolestate");
            return (Criteria) this;
        }

        public Criteria andRolestateGreaterThan(Integer value) {
            addCriterion("rolestate >", value, "rolestate");
            return (Criteria) this;
        }

        public Criteria andRolestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("rolestate >=", value, "rolestate");
            return (Criteria) this;
        }

        public Criteria andRolestateLessThan(Integer value) {
            addCriterion("rolestate <", value, "rolestate");
            return (Criteria) this;
        }

        public Criteria andRolestateLessThanOrEqualTo(Integer value) {
            addCriterion("rolestate <=", value, "rolestate");
            return (Criteria) this;
        }

        public Criteria andRolestateIn(List<Integer> values) {
            addCriterion("rolestate in", values, "rolestate");
            return (Criteria) this;
        }

        public Criteria andRolestateNotIn(List<Integer> values) {
            addCriterion("rolestate not in", values, "rolestate");
            return (Criteria) this;
        }

        public Criteria andRolestateBetween(Integer value1, Integer value2) {
            addCriterion("rolestate between", value1, value2, "rolestate");
            return (Criteria) this;
        }

        public Criteria andRolestateNotBetween(Integer value1, Integer value2) {
            addCriterion("rolestate not between", value1, value2, "rolestate");
            return (Criteria) this;
        }

        public Criteria andRoledescIsNull() {
            addCriterion("roledesc is null");
            return (Criteria) this;
        }

        public Criteria andRoledescIsNotNull() {
            addCriterion("roledesc is not null");
            return (Criteria) this;
        }

        public Criteria andRoledescEqualTo(Integer value) {
            addCriterion("roledesc =", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescNotEqualTo(Integer value) {
            addCriterion("roledesc <>", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescGreaterThan(Integer value) {
            addCriterion("roledesc >", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescGreaterThanOrEqualTo(Integer value) {
            addCriterion("roledesc >=", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescLessThan(Integer value) {
            addCriterion("roledesc <", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescLessThanOrEqualTo(Integer value) {
            addCriterion("roledesc <=", value, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescIn(List<Integer> values) {
            addCriterion("roledesc in", values, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescNotIn(List<Integer> values) {
            addCriterion("roledesc not in", values, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescBetween(Integer value1, Integer value2) {
            addCriterion("roledesc between", value1, value2, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRoledescNotBetween(Integer value1, Integer value2) {
            addCriterion("roledesc not between", value1, value2, "roledesc");
            return (Criteria) this;
        }

        public Criteria andRpasswordIsNull() {
            addCriterion("rpassword is null");
            return (Criteria) this;
        }

        public Criteria andRpasswordIsNotNull() {
            addCriterion("rpassword is not null");
            return (Criteria) this;
        }

        public Criteria andRpasswordEqualTo(String value) {
            addCriterion("rpassword =", value, "rpassword");
            return (Criteria) this;
        }

        public Criteria andRpasswordNotEqualTo(String value) {
            addCriterion("rpassword <>", value, "rpassword");
            return (Criteria) this;
        }

        public Criteria andRpasswordGreaterThan(String value) {
            addCriterion("rpassword >", value, "rpassword");
            return (Criteria) this;
        }

        public Criteria andRpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("rpassword >=", value, "rpassword");
            return (Criteria) this;
        }

        public Criteria andRpasswordLessThan(String value) {
            addCriterion("rpassword <", value, "rpassword");
            return (Criteria) this;
        }

        public Criteria andRpasswordLessThanOrEqualTo(String value) {
            addCriterion("rpassword <=", value, "rpassword");
            return (Criteria) this;
        }

        public Criteria andRpasswordLike(String value) {
            addCriterion("rpassword like", value, "rpassword");
            return (Criteria) this;
        }

        public Criteria andRpasswordNotLike(String value) {
            addCriterion("rpassword not like", value, "rpassword");
            return (Criteria) this;
        }

        public Criteria andRpasswordIn(List<String> values) {
            addCriterion("rpassword in", values, "rpassword");
            return (Criteria) this;
        }

        public Criteria andRpasswordNotIn(List<String> values) {
            addCriterion("rpassword not in", values, "rpassword");
            return (Criteria) this;
        }

        public Criteria andRpasswordBetween(String value1, String value2) {
            addCriterion("rpassword between", value1, value2, "rpassword");
            return (Criteria) this;
        }

        public Criteria andRpasswordNotBetween(String value1, String value2) {
            addCriterion("rpassword not between", value1, value2, "rpassword");
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