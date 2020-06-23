package com.landasoft.mas.springboot.mybatis.generator.entity;

import java.util.ArrayList;
import java.util.List;

public class MemberGlobalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberGlobalExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andMemberGlobalIdIsNull() {
            addCriterion("MEMBER_GLOBAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberGlobalIdIsNotNull() {
            addCriterion("MEMBER_GLOBAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberGlobalIdEqualTo(Long value) {
            addCriterion("MEMBER_GLOBAL_ID =", value, "memberGlobalId");
            return (Criteria) this;
        }

        public Criteria andMemberGlobalIdNotEqualTo(Long value) {
            addCriterion("MEMBER_GLOBAL_ID <>", value, "memberGlobalId");
            return (Criteria) this;
        }

        public Criteria andMemberGlobalIdGreaterThan(Long value) {
            addCriterion("MEMBER_GLOBAL_ID >", value, "memberGlobalId");
            return (Criteria) this;
        }

        public Criteria andMemberGlobalIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MEMBER_GLOBAL_ID >=", value, "memberGlobalId");
            return (Criteria) this;
        }

        public Criteria andMemberGlobalIdLessThan(Long value) {
            addCriterion("MEMBER_GLOBAL_ID <", value, "memberGlobalId");
            return (Criteria) this;
        }

        public Criteria andMemberGlobalIdLessThanOrEqualTo(Long value) {
            addCriterion("MEMBER_GLOBAL_ID <=", value, "memberGlobalId");
            return (Criteria) this;
        }

        public Criteria andMemberGlobalIdIn(List<Long> values) {
            addCriterion("MEMBER_GLOBAL_ID in", values, "memberGlobalId");
            return (Criteria) this;
        }

        public Criteria andMemberGlobalIdNotIn(List<Long> values) {
            addCriterion("MEMBER_GLOBAL_ID not in", values, "memberGlobalId");
            return (Criteria) this;
        }

        public Criteria andMemberGlobalIdBetween(Long value1, Long value2) {
            addCriterion("MEMBER_GLOBAL_ID between", value1, value2, "memberGlobalId");
            return (Criteria) this;
        }

        public Criteria andMemberGlobalIdNotBetween(Long value1, Long value2) {
            addCriterion("MEMBER_GLOBAL_ID not between", value1, value2, "memberGlobalId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Long value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Long value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Long value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Long value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Long> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Long> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Long value1, Long value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andGeoIdIsNull() {
            addCriterion("GEO_ID is null");
            return (Criteria) this;
        }

        public Criteria andGeoIdIsNotNull() {
            addCriterion("GEO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGeoIdEqualTo(Long value) {
            addCriterion("GEO_ID =", value, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdNotEqualTo(Long value) {
            addCriterion("GEO_ID <>", value, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdGreaterThan(Long value) {
            addCriterion("GEO_ID >", value, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GEO_ID >=", value, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdLessThan(Long value) {
            addCriterion("GEO_ID <", value, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdLessThanOrEqualTo(Long value) {
            addCriterion("GEO_ID <=", value, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdIn(List<Long> values) {
            addCriterion("GEO_ID in", values, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdNotIn(List<Long> values) {
            addCriterion("GEO_ID not in", values, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdBetween(Long value1, Long value2) {
            addCriterion("GEO_ID between", value1, value2, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdNotBetween(Long value1, Long value2) {
            addCriterion("GEO_ID not between", value1, value2, "geoId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("GRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("GRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Long value) {
            addCriterion("GRADE_ID =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Long value) {
            addCriterion("GRADE_ID <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Long value) {
            addCriterion("GRADE_ID >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GRADE_ID >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Long value) {
            addCriterion("GRADE_ID <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Long value) {
            addCriterion("GRADE_ID <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Long> values) {
            addCriterion("GRADE_ID in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Long> values) {
            addCriterion("GRADE_ID not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Long value1, Long value2) {
            addCriterion("GRADE_ID between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Long value1, Long value2) {
            addCriterion("GRADE_ID not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andMemberCodeIsNull() {
            addCriterion("MEMBER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMemberCodeIsNotNull() {
            addCriterion("MEMBER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCodeEqualTo(String value) {
            addCriterion("MEMBER_CODE =", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeNotEqualTo(String value) {
            addCriterion("MEMBER_CODE <>", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeGreaterThan(String value) {
            addCriterion("MEMBER_CODE >", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_CODE >=", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeLessThan(String value) {
            addCriterion("MEMBER_CODE <", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_CODE <=", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeLike(String value) {
            addCriterion("MEMBER_CODE like", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeNotLike(String value) {
            addCriterion("MEMBER_CODE not like", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeIn(List<String> values) {
            addCriterion("MEMBER_CODE in", values, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeNotIn(List<String> values) {
            addCriterion("MEMBER_CODE not in", values, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeBetween(String value1, String value2) {
            addCriterion("MEMBER_CODE between", value1, value2, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeNotBetween(String value1, String value2) {
            addCriterion("MEMBER_CODE not between", value1, value2, "memberCode");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNull() {
            addCriterion("LOGIN_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNotNull() {
            addCriterion("LOGIN_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordEqualTo(String value) {
            addCriterion("LOGIN_PASSWORD =", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotEqualTo(String value) {
            addCriterion("LOGIN_PASSWORD <>", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThan(String value) {
            addCriterion("LOGIN_PASSWORD >", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_PASSWORD >=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThan(String value) {
            addCriterion("LOGIN_PASSWORD <", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_PASSWORD <=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLike(String value) {
            addCriterion("LOGIN_PASSWORD like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotLike(String value) {
            addCriterion("LOGIN_PASSWORD not like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIn(List<String> values) {
            addCriterion("LOGIN_PASSWORD in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotIn(List<String> values) {
            addCriterion("LOGIN_PASSWORD not in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordBetween(String value1, String value2) {
            addCriterion("LOGIN_PASSWORD between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("LOGIN_PASSWORD not between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("MEMBER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("MEMBER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("MEMBER_NAME =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("MEMBER_NAME <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("MEMBER_NAME >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("MEMBER_NAME <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("MEMBER_NAME like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("MEMBER_NAME not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("MEMBER_NAME in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("MEMBER_NAME not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Long value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Long value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Long value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Long value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Long value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Long value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Long> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Long> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Long value1, Long value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Long value1, Long value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("BIRTHDAY like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("BIRTHDAY not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("LAST_LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("LAST_LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(String value) {
            addCriterion("LAST_LOGIN_TIME =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(String value) {
            addCriterion("LAST_LOGIN_TIME <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(String value) {
            addCriterion("LAST_LOGIN_TIME >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN_TIME >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(String value) {
            addCriterion("LAST_LOGIN_TIME <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN_TIME <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLike(String value) {
            addCriterion("LAST_LOGIN_TIME like", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotLike(String value) {
            addCriterion("LAST_LOGIN_TIME not like", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<String> values) {
            addCriterion("LAST_LOGIN_TIME in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<String> values) {
            addCriterion("LAST_LOGIN_TIME not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN_TIME between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN_TIME not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("LAST_LOGIN_IP is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("LAST_LOGIN_IP is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("LAST_LOGIN_IP =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("LAST_LOGIN_IP <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("LAST_LOGIN_IP >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN_IP >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("LAST_LOGIN_IP <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN_IP <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("LAST_LOGIN_IP like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("LAST_LOGIN_IP not like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<String> values) {
            addCriterion("LAST_LOGIN_IP in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<String> values) {
            addCriterion("LAST_LOGIN_IP not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN_IP between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN_IP not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginCityIsNull() {
            addCriterion("LAST_LOGIN_CITY is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginCityIsNotNull() {
            addCriterion("LAST_LOGIN_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginCityEqualTo(Long value) {
            addCriterion("LAST_LOGIN_CITY =", value, "lastLoginCity");
            return (Criteria) this;
        }

        public Criteria andLastLoginCityNotEqualTo(Long value) {
            addCriterion("LAST_LOGIN_CITY <>", value, "lastLoginCity");
            return (Criteria) this;
        }

        public Criteria andLastLoginCityGreaterThan(Long value) {
            addCriterion("LAST_LOGIN_CITY >", value, "lastLoginCity");
            return (Criteria) this;
        }

        public Criteria andLastLoginCityGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_LOGIN_CITY >=", value, "lastLoginCity");
            return (Criteria) this;
        }

        public Criteria andLastLoginCityLessThan(Long value) {
            addCriterion("LAST_LOGIN_CITY <", value, "lastLoginCity");
            return (Criteria) this;
        }

        public Criteria andLastLoginCityLessThanOrEqualTo(Long value) {
            addCriterion("LAST_LOGIN_CITY <=", value, "lastLoginCity");
            return (Criteria) this;
        }

        public Criteria andLastLoginCityIn(List<Long> values) {
            addCriterion("LAST_LOGIN_CITY in", values, "lastLoginCity");
            return (Criteria) this;
        }

        public Criteria andLastLoginCityNotIn(List<Long> values) {
            addCriterion("LAST_LOGIN_CITY not in", values, "lastLoginCity");
            return (Criteria) this;
        }

        public Criteria andLastLoginCityBetween(Long value1, Long value2) {
            addCriterion("LAST_LOGIN_CITY between", value1, value2, "lastLoginCity");
            return (Criteria) this;
        }

        public Criteria andLastLoginCityNotBetween(Long value1, Long value2) {
            addCriterion("LAST_LOGIN_CITY not between", value1, value2, "lastLoginCity");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionTimeIsNull() {
            addCriterion("LAST_CONSUMPTION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionTimeIsNotNull() {
            addCriterion("LAST_CONSUMPTION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionTimeEqualTo(String value) {
            addCriterion("LAST_CONSUMPTION_TIME =", value, "lastConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionTimeNotEqualTo(String value) {
            addCriterion("LAST_CONSUMPTION_TIME <>", value, "lastConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionTimeGreaterThan(String value) {
            addCriterion("LAST_CONSUMPTION_TIME >", value, "lastConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_CONSUMPTION_TIME >=", value, "lastConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionTimeLessThan(String value) {
            addCriterion("LAST_CONSUMPTION_TIME <", value, "lastConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_CONSUMPTION_TIME <=", value, "lastConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionTimeLike(String value) {
            addCriterion("LAST_CONSUMPTION_TIME like", value, "lastConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionTimeNotLike(String value) {
            addCriterion("LAST_CONSUMPTION_TIME not like", value, "lastConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionTimeIn(List<String> values) {
            addCriterion("LAST_CONSUMPTION_TIME in", values, "lastConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionTimeNotIn(List<String> values) {
            addCriterion("LAST_CONSUMPTION_TIME not in", values, "lastConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionTimeBetween(String value1, String value2) {
            addCriterion("LAST_CONSUMPTION_TIME between", value1, value2, "lastConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_CONSUMPTION_TIME not between", value1, value2, "lastConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionCityIsNull() {
            addCriterion("LAST_CONSUMPTION_CITY is null");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionCityIsNotNull() {
            addCriterion("LAST_CONSUMPTION_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionCityEqualTo(Long value) {
            addCriterion("LAST_CONSUMPTION_CITY =", value, "lastConsumptionCity");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionCityNotEqualTo(Long value) {
            addCriterion("LAST_CONSUMPTION_CITY <>", value, "lastConsumptionCity");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionCityGreaterThan(Long value) {
            addCriterion("LAST_CONSUMPTION_CITY >", value, "lastConsumptionCity");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionCityGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_CONSUMPTION_CITY >=", value, "lastConsumptionCity");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionCityLessThan(Long value) {
            addCriterion("LAST_CONSUMPTION_CITY <", value, "lastConsumptionCity");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionCityLessThanOrEqualTo(Long value) {
            addCriterion("LAST_CONSUMPTION_CITY <=", value, "lastConsumptionCity");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionCityIn(List<Long> values) {
            addCriterion("LAST_CONSUMPTION_CITY in", values, "lastConsumptionCity");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionCityNotIn(List<Long> values) {
            addCriterion("LAST_CONSUMPTION_CITY not in", values, "lastConsumptionCity");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionCityBetween(Long value1, Long value2) {
            addCriterion("LAST_CONSUMPTION_CITY between", value1, value2, "lastConsumptionCity");
            return (Criteria) this;
        }

        public Criteria andLastConsumptionCityNotBetween(Long value1, Long value2) {
            addCriterion("LAST_CONSUMPTION_CITY not between", value1, value2, "lastConsumptionCity");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("STATUS_ID is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("STATUS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(Long value) {
            addCriterion("STATUS_ID =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(Long value) {
            addCriterion("STATUS_ID <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(Long value) {
            addCriterion("STATUS_ID >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(Long value) {
            addCriterion("STATUS_ID >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(Long value) {
            addCriterion("STATUS_ID <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(Long value) {
            addCriterion("STATUS_ID <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<Long> values) {
            addCriterion("STATUS_ID in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<Long> values) {
            addCriterion("STATUS_ID not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(Long value1, Long value2) {
            addCriterion("STATUS_ID between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(Long value1, Long value2) {
            addCriterion("STATUS_ID not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIdIsNull() {
            addCriterion("ACTIVE_STATUS_ID is null");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIdIsNotNull() {
            addCriterion("ACTIVE_STATUS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIdEqualTo(Long value) {
            addCriterion("ACTIVE_STATUS_ID =", value, "activeStatusId");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIdNotEqualTo(Long value) {
            addCriterion("ACTIVE_STATUS_ID <>", value, "activeStatusId");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIdGreaterThan(Long value) {
            addCriterion("ACTIVE_STATUS_ID >", value, "activeStatusId");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACTIVE_STATUS_ID >=", value, "activeStatusId");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIdLessThan(Long value) {
            addCriterion("ACTIVE_STATUS_ID <", value, "activeStatusId");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIdLessThanOrEqualTo(Long value) {
            addCriterion("ACTIVE_STATUS_ID <=", value, "activeStatusId");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIdIn(List<Long> values) {
            addCriterion("ACTIVE_STATUS_ID in", values, "activeStatusId");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIdNotIn(List<Long> values) {
            addCriterion("ACTIVE_STATUS_ID not in", values, "activeStatusId");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIdBetween(Long value1, Long value2) {
            addCriterion("ACTIVE_STATUS_ID between", value1, value2, "activeStatusId");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIdNotBetween(Long value1, Long value2) {
            addCriterion("ACTIVE_STATUS_ID not between", value1, value2, "activeStatusId");
            return (Criteria) this;
        }

        public Criteria andConsumptionStatusIdIsNull() {
            addCriterion("CONSUMPTION_STATUS_ID is null");
            return (Criteria) this;
        }

        public Criteria andConsumptionStatusIdIsNotNull() {
            addCriterion("CONSUMPTION_STATUS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConsumptionStatusIdEqualTo(Long value) {
            addCriterion("CONSUMPTION_STATUS_ID =", value, "consumptionStatusId");
            return (Criteria) this;
        }

        public Criteria andConsumptionStatusIdNotEqualTo(Long value) {
            addCriterion("CONSUMPTION_STATUS_ID <>", value, "consumptionStatusId");
            return (Criteria) this;
        }

        public Criteria andConsumptionStatusIdGreaterThan(Long value) {
            addCriterion("CONSUMPTION_STATUS_ID >", value, "consumptionStatusId");
            return (Criteria) this;
        }

        public Criteria andConsumptionStatusIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONSUMPTION_STATUS_ID >=", value, "consumptionStatusId");
            return (Criteria) this;
        }

        public Criteria andConsumptionStatusIdLessThan(Long value) {
            addCriterion("CONSUMPTION_STATUS_ID <", value, "consumptionStatusId");
            return (Criteria) this;
        }

        public Criteria andConsumptionStatusIdLessThanOrEqualTo(Long value) {
            addCriterion("CONSUMPTION_STATUS_ID <=", value, "consumptionStatusId");
            return (Criteria) this;
        }

        public Criteria andConsumptionStatusIdIn(List<Long> values) {
            addCriterion("CONSUMPTION_STATUS_ID in", values, "consumptionStatusId");
            return (Criteria) this;
        }

        public Criteria andConsumptionStatusIdNotIn(List<Long> values) {
            addCriterion("CONSUMPTION_STATUS_ID not in", values, "consumptionStatusId");
            return (Criteria) this;
        }

        public Criteria andConsumptionStatusIdBetween(Long value1, Long value2) {
            addCriterion("CONSUMPTION_STATUS_ID between", value1, value2, "consumptionStatusId");
            return (Criteria) this;
        }

        public Criteria andConsumptionStatusIdNotBetween(Long value1, Long value2) {
            addCriterion("CONSUMPTION_STATUS_ID not between", value1, value2, "consumptionStatusId");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoIsNull() {
            addCriterion("MEMBER_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoIsNotNull() {
            addCriterion("MEMBER_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoEqualTo(String value) {
            addCriterion("MEMBER_PHOTO =", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoNotEqualTo(String value) {
            addCriterion("MEMBER_PHOTO <>", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoGreaterThan(String value) {
            addCriterion("MEMBER_PHOTO >", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_PHOTO >=", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoLessThan(String value) {
            addCriterion("MEMBER_PHOTO <", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_PHOTO <=", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoLike(String value) {
            addCriterion("MEMBER_PHOTO like", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoNotLike(String value) {
            addCriterion("MEMBER_PHOTO not like", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoIn(List<String> values) {
            addCriterion("MEMBER_PHOTO in", values, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoNotIn(List<String> values) {
            addCriterion("MEMBER_PHOTO not in", values, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoBetween(String value1, String value2) {
            addCriterion("MEMBER_PHOTO between", value1, value2, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoNotBetween(String value1, String value2) {
            addCriterion("MEMBER_PHOTO not between", value1, value2, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("PROFESSION is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("PROFESSION is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(Long value) {
            addCriterion("PROFESSION =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(Long value) {
            addCriterion("PROFESSION <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(Long value) {
            addCriterion("PROFESSION >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(Long value) {
            addCriterion("PROFESSION >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(Long value) {
            addCriterion("PROFESSION <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(Long value) {
            addCriterion("PROFESSION <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<Long> values) {
            addCriterion("PROFESSION in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<Long> values) {
            addCriterion("PROFESSION not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(Long value1, Long value2) {
            addCriterion("PROFESSION between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(Long value1, Long value2) {
            addCriterion("PROFESSION not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("INCOME is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Long value) {
            addCriterion("INCOME =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Long value) {
            addCriterion("INCOME <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Long value) {
            addCriterion("INCOME >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Long value) {
            addCriterion("INCOME >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Long value) {
            addCriterion("INCOME <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Long value) {
            addCriterion("INCOME <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Long> values) {
            addCriterion("INCOME in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Long> values) {
            addCriterion("INCOME not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Long value1, Long value2) {
            addCriterion("INCOME between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Long value1, Long value2) {
            addCriterion("INCOME not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("HOBBY is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("HOBBY is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("HOBBY =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("HOBBY <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("HOBBY >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("HOBBY >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("HOBBY <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("HOBBY <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("HOBBY like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("HOBBY not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("HOBBY in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("HOBBY not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("HOBBY between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("HOBBY not between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andIsMarriedIsNull() {
            addCriterion("IS_MARRIED is null");
            return (Criteria) this;
        }

        public Criteria andIsMarriedIsNotNull() {
            addCriterion("IS_MARRIED is not null");
            return (Criteria) this;
        }

        public Criteria andIsMarriedEqualTo(String value) {
            addCriterion("IS_MARRIED =", value, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedNotEqualTo(String value) {
            addCriterion("IS_MARRIED <>", value, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedGreaterThan(String value) {
            addCriterion("IS_MARRIED >", value, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_MARRIED >=", value, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedLessThan(String value) {
            addCriterion("IS_MARRIED <", value, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedLessThanOrEqualTo(String value) {
            addCriterion("IS_MARRIED <=", value, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedLike(String value) {
            addCriterion("IS_MARRIED like", value, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedNotLike(String value) {
            addCriterion("IS_MARRIED not like", value, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedIn(List<String> values) {
            addCriterion("IS_MARRIED in", values, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedNotIn(List<String> values) {
            addCriterion("IS_MARRIED not in", values, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedBetween(String value1, String value2) {
            addCriterion("IS_MARRIED between", value1, value2, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedNotBetween(String value1, String value2) {
            addCriterion("IS_MARRIED not between", value1, value2, "isMarried");
            return (Criteria) this;
        }

        public Criteria andZodiacIsNull() {
            addCriterion("ZODIAC is null");
            return (Criteria) this;
        }

        public Criteria andZodiacIsNotNull() {
            addCriterion("ZODIAC is not null");
            return (Criteria) this;
        }

        public Criteria andZodiacEqualTo(Long value) {
            addCriterion("ZODIAC =", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacNotEqualTo(Long value) {
            addCriterion("ZODIAC <>", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacGreaterThan(Long value) {
            addCriterion("ZODIAC >", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacGreaterThanOrEqualTo(Long value) {
            addCriterion("ZODIAC >=", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacLessThan(Long value) {
            addCriterion("ZODIAC <", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacLessThanOrEqualTo(Long value) {
            addCriterion("ZODIAC <=", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacIn(List<Long> values) {
            addCriterion("ZODIAC in", values, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacNotIn(List<Long> values) {
            addCriterion("ZODIAC not in", values, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacBetween(Long value1, Long value2) {
            addCriterion("ZODIAC between", value1, value2, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacNotBetween(Long value1, Long value2) {
            addCriterion("ZODIAC not between", value1, value2, "zodiac");
            return (Criteria) this;
        }

        public Criteria andChineseZodiacIsNull() {
            addCriterion("CHINESE_ZODIAC is null");
            return (Criteria) this;
        }

        public Criteria andChineseZodiacIsNotNull() {
            addCriterion("CHINESE_ZODIAC is not null");
            return (Criteria) this;
        }

        public Criteria andChineseZodiacEqualTo(Long value) {
            addCriterion("CHINESE_ZODIAC =", value, "chineseZodiac");
            return (Criteria) this;
        }

        public Criteria andChineseZodiacNotEqualTo(Long value) {
            addCriterion("CHINESE_ZODIAC <>", value, "chineseZodiac");
            return (Criteria) this;
        }

        public Criteria andChineseZodiacGreaterThan(Long value) {
            addCriterion("CHINESE_ZODIAC >", value, "chineseZodiac");
            return (Criteria) this;
        }

        public Criteria andChineseZodiacGreaterThanOrEqualTo(Long value) {
            addCriterion("CHINESE_ZODIAC >=", value, "chineseZodiac");
            return (Criteria) this;
        }

        public Criteria andChineseZodiacLessThan(Long value) {
            addCriterion("CHINESE_ZODIAC <", value, "chineseZodiac");
            return (Criteria) this;
        }

        public Criteria andChineseZodiacLessThanOrEqualTo(Long value) {
            addCriterion("CHINESE_ZODIAC <=", value, "chineseZodiac");
            return (Criteria) this;
        }

        public Criteria andChineseZodiacIn(List<Long> values) {
            addCriterion("CHINESE_ZODIAC in", values, "chineseZodiac");
            return (Criteria) this;
        }

        public Criteria andChineseZodiacNotIn(List<Long> values) {
            addCriterion("CHINESE_ZODIAC not in", values, "chineseZodiac");
            return (Criteria) this;
        }

        public Criteria andChineseZodiacBetween(Long value1, Long value2) {
            addCriterion("CHINESE_ZODIAC between", value1, value2, "chineseZodiac");
            return (Criteria) this;
        }

        public Criteria andChineseZodiacNotBetween(Long value1, Long value2) {
            addCriterion("CHINESE_ZODIAC not between", value1, value2, "chineseZodiac");
            return (Criteria) this;
        }

        public Criteria andBloodIsNull() {
            addCriterion("BLOOD is null");
            return (Criteria) this;
        }

        public Criteria andBloodIsNotNull() {
            addCriterion("BLOOD is not null");
            return (Criteria) this;
        }

        public Criteria andBloodEqualTo(Long value) {
            addCriterion("BLOOD =", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotEqualTo(Long value) {
            addCriterion("BLOOD <>", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodGreaterThan(Long value) {
            addCriterion("BLOOD >", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodGreaterThanOrEqualTo(Long value) {
            addCriterion("BLOOD >=", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLessThan(Long value) {
            addCriterion("BLOOD <", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLessThanOrEqualTo(Long value) {
            addCriterion("BLOOD <=", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodIn(List<Long> values) {
            addCriterion("BLOOD in", values, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotIn(List<Long> values) {
            addCriterion("BLOOD not in", values, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodBetween(Long value1, Long value2) {
            addCriterion("BLOOD between", value1, value2, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotBetween(Long value1, Long value2) {
            addCriterion("BLOOD not between", value1, value2, "blood");
            return (Criteria) this;
        }

        public Criteria andAgesIsNull() {
            addCriterion("AGES is null");
            return (Criteria) this;
        }

        public Criteria andAgesIsNotNull() {
            addCriterion("AGES is not null");
            return (Criteria) this;
        }

        public Criteria andAgesEqualTo(Long value) {
            addCriterion("AGES =", value, "ages");
            return (Criteria) this;
        }

        public Criteria andAgesNotEqualTo(Long value) {
            addCriterion("AGES <>", value, "ages");
            return (Criteria) this;
        }

        public Criteria andAgesGreaterThan(Long value) {
            addCriterion("AGES >", value, "ages");
            return (Criteria) this;
        }

        public Criteria andAgesGreaterThanOrEqualTo(Long value) {
            addCriterion("AGES >=", value, "ages");
            return (Criteria) this;
        }

        public Criteria andAgesLessThan(Long value) {
            addCriterion("AGES <", value, "ages");
            return (Criteria) this;
        }

        public Criteria andAgesLessThanOrEqualTo(Long value) {
            addCriterion("AGES <=", value, "ages");
            return (Criteria) this;
        }

        public Criteria andAgesIn(List<Long> values) {
            addCriterion("AGES in", values, "ages");
            return (Criteria) this;
        }

        public Criteria andAgesNotIn(List<Long> values) {
            addCriterion("AGES not in", values, "ages");
            return (Criteria) this;
        }

        public Criteria andAgesBetween(Long value1, Long value2) {
            addCriterion("AGES between", value1, value2, "ages");
            return (Criteria) this;
        }

        public Criteria andAgesNotBetween(Long value1, Long value2) {
            addCriterion("AGES not between", value1, value2, "ages");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNull() {
            addCriterion("ID_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNotNull() {
            addCriterion("ID_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoEqualTo(String value) {
            addCriterion("ID_CARD_NO =", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotEqualTo(String value) {
            addCriterion("ID_CARD_NO <>", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThan(String value) {
            addCriterion("ID_CARD_NO >", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD_NO >=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThan(String value) {
            addCriterion("ID_CARD_NO <", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD_NO <=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLike(String value) {
            addCriterion("ID_CARD_NO like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotLike(String value) {
            addCriterion("ID_CARD_NO not like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIn(List<String> values) {
            addCriterion("ID_CARD_NO in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotIn(List<String> values) {
            addCriterion("ID_CARD_NO not in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoBetween(String value1, String value2) {
            addCriterion("ID_CARD_NO between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotBetween(String value1, String value2) {
            addCriterion("ID_CARD_NO not between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("CONTACT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("CONTACT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("CONTACT_PHONE =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("CONTACT_PHONE <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("CONTACT_PHONE >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("CONTACT_PHONE <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("CONTACT_PHONE like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("CONTACT_PHONE not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("CONTACT_PHONE in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("CONTACT_PHONE not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNull() {
            addCriterion("CONTACT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNotNull() {
            addCriterion("CONTACT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddressEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS =", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS <>", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThan(String value) {
            addCriterion("CONTACT_ADDRESS >", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS >=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThan(String value) {
            addCriterion("CONTACT_ADDRESS <", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS <=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLike(String value) {
            addCriterion("CONTACT_ADDRESS like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotLike(String value) {
            addCriterion("CONTACT_ADDRESS not like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressIn(List<String> values) {
            addCriterion("CONTACT_ADDRESS in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotIn(List<String> values) {
            addCriterion("CONTACT_ADDRESS not in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressBetween(String value1, String value2) {
            addCriterion("CONTACT_ADDRESS between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotBetween(String value1, String value2) {
            addCriterion("CONTACT_ADDRESS not between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Long value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Long value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Long value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Long value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Long value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Long value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Long> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Long> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Long value1, Long value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Long value1, Long value2) {
            addCriterion("SCORE not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andFamilyIsNull() {
            addCriterion("FAMILY is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIsNotNull() {
            addCriterion("FAMILY is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyEqualTo(String value) {
            addCriterion("FAMILY =", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotEqualTo(String value) {
            addCriterion("FAMILY <>", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyGreaterThan(String value) {
            addCriterion("FAMILY >", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILY >=", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLessThan(String value) {
            addCriterion("FAMILY <", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLessThanOrEqualTo(String value) {
            addCriterion("FAMILY <=", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLike(String value) {
            addCriterion("FAMILY like", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotLike(String value) {
            addCriterion("FAMILY not like", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyIn(List<String> values) {
            addCriterion("FAMILY in", values, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotIn(List<String> values) {
            addCriterion("FAMILY not in", values, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyBetween(String value1, String value2) {
            addCriterion("FAMILY between", value1, value2, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotBetween(String value1, String value2) {
            addCriterion("FAMILY not between", value1, value2, "family");
            return (Criteria) this;
        }

        public Criteria andIsVankerMemberIsNull() {
            addCriterion("IS_VANKER_MEMBER is null");
            return (Criteria) this;
        }

        public Criteria andIsVankerMemberIsNotNull() {
            addCriterion("IS_VANKER_MEMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIsVankerMemberEqualTo(String value) {
            addCriterion("IS_VANKER_MEMBER =", value, "isVankerMember");
            return (Criteria) this;
        }

        public Criteria andIsVankerMemberNotEqualTo(String value) {
            addCriterion("IS_VANKER_MEMBER <>", value, "isVankerMember");
            return (Criteria) this;
        }

        public Criteria andIsVankerMemberGreaterThan(String value) {
            addCriterion("IS_VANKER_MEMBER >", value, "isVankerMember");
            return (Criteria) this;
        }

        public Criteria andIsVankerMemberGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VANKER_MEMBER >=", value, "isVankerMember");
            return (Criteria) this;
        }

        public Criteria andIsVankerMemberLessThan(String value) {
            addCriterion("IS_VANKER_MEMBER <", value, "isVankerMember");
            return (Criteria) this;
        }

        public Criteria andIsVankerMemberLessThanOrEqualTo(String value) {
            addCriterion("IS_VANKER_MEMBER <=", value, "isVankerMember");
            return (Criteria) this;
        }

        public Criteria andIsVankerMemberLike(String value) {
            addCriterion("IS_VANKER_MEMBER like", value, "isVankerMember");
            return (Criteria) this;
        }

        public Criteria andIsVankerMemberNotLike(String value) {
            addCriterion("IS_VANKER_MEMBER not like", value, "isVankerMember");
            return (Criteria) this;
        }

        public Criteria andIsVankerMemberIn(List<String> values) {
            addCriterion("IS_VANKER_MEMBER in", values, "isVankerMember");
            return (Criteria) this;
        }

        public Criteria andIsVankerMemberNotIn(List<String> values) {
            addCriterion("IS_VANKER_MEMBER not in", values, "isVankerMember");
            return (Criteria) this;
        }

        public Criteria andIsVankerMemberBetween(String value1, String value2) {
            addCriterion("IS_VANKER_MEMBER between", value1, value2, "isVankerMember");
            return (Criteria) this;
        }

        public Criteria andIsVankerMemberNotBetween(String value1, String value2) {
            addCriterion("IS_VANKER_MEMBER not between", value1, value2, "isVankerMember");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("CARD_TYPE like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("CARD_TYPE not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("CARD_TYPE not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCreateCardDateIsNull() {
            addCriterion("CREATE_CARD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateCardDateIsNotNull() {
            addCriterion("CREATE_CARD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateCardDateEqualTo(String value) {
            addCriterion("CREATE_CARD_DATE =", value, "createCardDate");
            return (Criteria) this;
        }

        public Criteria andCreateCardDateNotEqualTo(String value) {
            addCriterion("CREATE_CARD_DATE <>", value, "createCardDate");
            return (Criteria) this;
        }

        public Criteria andCreateCardDateGreaterThan(String value) {
            addCriterion("CREATE_CARD_DATE >", value, "createCardDate");
            return (Criteria) this;
        }

        public Criteria andCreateCardDateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_CARD_DATE >=", value, "createCardDate");
            return (Criteria) this;
        }

        public Criteria andCreateCardDateLessThan(String value) {
            addCriterion("CREATE_CARD_DATE <", value, "createCardDate");
            return (Criteria) this;
        }

        public Criteria andCreateCardDateLessThanOrEqualTo(String value) {
            addCriterion("CREATE_CARD_DATE <=", value, "createCardDate");
            return (Criteria) this;
        }

        public Criteria andCreateCardDateLike(String value) {
            addCriterion("CREATE_CARD_DATE like", value, "createCardDate");
            return (Criteria) this;
        }

        public Criteria andCreateCardDateNotLike(String value) {
            addCriterion("CREATE_CARD_DATE not like", value, "createCardDate");
            return (Criteria) this;
        }

        public Criteria andCreateCardDateIn(List<String> values) {
            addCriterion("CREATE_CARD_DATE in", values, "createCardDate");
            return (Criteria) this;
        }

        public Criteria andCreateCardDateNotIn(List<String> values) {
            addCriterion("CREATE_CARD_DATE not in", values, "createCardDate");
            return (Criteria) this;
        }

        public Criteria andCreateCardDateBetween(String value1, String value2) {
            addCriterion("CREATE_CARD_DATE between", value1, value2, "createCardDate");
            return (Criteria) this;
        }

        public Criteria andCreateCardDateNotBetween(String value1, String value2) {
            addCriterion("CREATE_CARD_DATE not between", value1, value2, "createCardDate");
            return (Criteria) this;
        }

        public Criteria andWorkSpaceIsNull() {
            addCriterion("WORK_SPACE is null");
            return (Criteria) this;
        }

        public Criteria andWorkSpaceIsNotNull() {
            addCriterion("WORK_SPACE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkSpaceEqualTo(String value) {
            addCriterion("WORK_SPACE =", value, "workSpace");
            return (Criteria) this;
        }

        public Criteria andWorkSpaceNotEqualTo(String value) {
            addCriterion("WORK_SPACE <>", value, "workSpace");
            return (Criteria) this;
        }

        public Criteria andWorkSpaceGreaterThan(String value) {
            addCriterion("WORK_SPACE >", value, "workSpace");
            return (Criteria) this;
        }

        public Criteria andWorkSpaceGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_SPACE >=", value, "workSpace");
            return (Criteria) this;
        }

        public Criteria andWorkSpaceLessThan(String value) {
            addCriterion("WORK_SPACE <", value, "workSpace");
            return (Criteria) this;
        }

        public Criteria andWorkSpaceLessThanOrEqualTo(String value) {
            addCriterion("WORK_SPACE <=", value, "workSpace");
            return (Criteria) this;
        }

        public Criteria andWorkSpaceLike(String value) {
            addCriterion("WORK_SPACE like", value, "workSpace");
            return (Criteria) this;
        }

        public Criteria andWorkSpaceNotLike(String value) {
            addCriterion("WORK_SPACE not like", value, "workSpace");
            return (Criteria) this;
        }

        public Criteria andWorkSpaceIn(List<String> values) {
            addCriterion("WORK_SPACE in", values, "workSpace");
            return (Criteria) this;
        }

        public Criteria andWorkSpaceNotIn(List<String> values) {
            addCriterion("WORK_SPACE not in", values, "workSpace");
            return (Criteria) this;
        }

        public Criteria andWorkSpaceBetween(String value1, String value2) {
            addCriterion("WORK_SPACE between", value1, value2, "workSpace");
            return (Criteria) this;
        }

        public Criteria andWorkSpaceNotBetween(String value1, String value2) {
            addCriterion("WORK_SPACE not between", value1, value2, "workSpace");
            return (Criteria) this;
        }

        public Criteria andLiveSpaceIsNull() {
            addCriterion("LIVE_SPACE is null");
            return (Criteria) this;
        }

        public Criteria andLiveSpaceIsNotNull() {
            addCriterion("LIVE_SPACE is not null");
            return (Criteria) this;
        }

        public Criteria andLiveSpaceEqualTo(String value) {
            addCriterion("LIVE_SPACE =", value, "liveSpace");
            return (Criteria) this;
        }

        public Criteria andLiveSpaceNotEqualTo(String value) {
            addCriterion("LIVE_SPACE <>", value, "liveSpace");
            return (Criteria) this;
        }

        public Criteria andLiveSpaceGreaterThan(String value) {
            addCriterion("LIVE_SPACE >", value, "liveSpace");
            return (Criteria) this;
        }

        public Criteria andLiveSpaceGreaterThanOrEqualTo(String value) {
            addCriterion("LIVE_SPACE >=", value, "liveSpace");
            return (Criteria) this;
        }

        public Criteria andLiveSpaceLessThan(String value) {
            addCriterion("LIVE_SPACE <", value, "liveSpace");
            return (Criteria) this;
        }

        public Criteria andLiveSpaceLessThanOrEqualTo(String value) {
            addCriterion("LIVE_SPACE <=", value, "liveSpace");
            return (Criteria) this;
        }

        public Criteria andLiveSpaceLike(String value) {
            addCriterion("LIVE_SPACE like", value, "liveSpace");
            return (Criteria) this;
        }

        public Criteria andLiveSpaceNotLike(String value) {
            addCriterion("LIVE_SPACE not like", value, "liveSpace");
            return (Criteria) this;
        }

        public Criteria andLiveSpaceIn(List<String> values) {
            addCriterion("LIVE_SPACE in", values, "liveSpace");
            return (Criteria) this;
        }

        public Criteria andLiveSpaceNotIn(List<String> values) {
            addCriterion("LIVE_SPACE not in", values, "liveSpace");
            return (Criteria) this;
        }

        public Criteria andLiveSpaceBetween(String value1, String value2) {
            addCriterion("LIVE_SPACE between", value1, value2, "liveSpace");
            return (Criteria) this;
        }

        public Criteria andLiveSpaceNotBetween(String value1, String value2) {
            addCriterion("LIVE_SPACE not between", value1, value2, "liveSpace");
            return (Criteria) this;
        }

        public Criteria andHukouSpaceIsNull() {
            addCriterion("HUKOU_SPACE is null");
            return (Criteria) this;
        }

        public Criteria andHukouSpaceIsNotNull() {
            addCriterion("HUKOU_SPACE is not null");
            return (Criteria) this;
        }

        public Criteria andHukouSpaceEqualTo(String value) {
            addCriterion("HUKOU_SPACE =", value, "hukouSpace");
            return (Criteria) this;
        }

        public Criteria andHukouSpaceNotEqualTo(String value) {
            addCriterion("HUKOU_SPACE <>", value, "hukouSpace");
            return (Criteria) this;
        }

        public Criteria andHukouSpaceGreaterThan(String value) {
            addCriterion("HUKOU_SPACE >", value, "hukouSpace");
            return (Criteria) this;
        }

        public Criteria andHukouSpaceGreaterThanOrEqualTo(String value) {
            addCriterion("HUKOU_SPACE >=", value, "hukouSpace");
            return (Criteria) this;
        }

        public Criteria andHukouSpaceLessThan(String value) {
            addCriterion("HUKOU_SPACE <", value, "hukouSpace");
            return (Criteria) this;
        }

        public Criteria andHukouSpaceLessThanOrEqualTo(String value) {
            addCriterion("HUKOU_SPACE <=", value, "hukouSpace");
            return (Criteria) this;
        }

        public Criteria andHukouSpaceLike(String value) {
            addCriterion("HUKOU_SPACE like", value, "hukouSpace");
            return (Criteria) this;
        }

        public Criteria andHukouSpaceNotLike(String value) {
            addCriterion("HUKOU_SPACE not like", value, "hukouSpace");
            return (Criteria) this;
        }

        public Criteria andHukouSpaceIn(List<String> values) {
            addCriterion("HUKOU_SPACE in", values, "hukouSpace");
            return (Criteria) this;
        }

        public Criteria andHukouSpaceNotIn(List<String> values) {
            addCriterion("HUKOU_SPACE not in", values, "hukouSpace");
            return (Criteria) this;
        }

        public Criteria andHukouSpaceBetween(String value1, String value2) {
            addCriterion("HUKOU_SPACE between", value1, value2, "hukouSpace");
            return (Criteria) this;
        }

        public Criteria andHukouSpaceNotBetween(String value1, String value2) {
            addCriterion("HUKOU_SPACE not between", value1, value2, "hukouSpace");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIsNull() {
            addCriterion("PARTNER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIsNotNull() {
            addCriterion("PARTNER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerNameEqualTo(String value) {
            addCriterion("PARTNER_NAME =", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotEqualTo(String value) {
            addCriterion("PARTNER_NAME <>", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameGreaterThan(String value) {
            addCriterion("PARTNER_NAME >", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARTNER_NAME >=", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLessThan(String value) {
            addCriterion("PARTNER_NAME <", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLessThanOrEqualTo(String value) {
            addCriterion("PARTNER_NAME <=", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLike(String value) {
            addCriterion("PARTNER_NAME like", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotLike(String value) {
            addCriterion("PARTNER_NAME not like", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIn(List<String> values) {
            addCriterion("PARTNER_NAME in", values, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotIn(List<String> values) {
            addCriterion("PARTNER_NAME not in", values, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameBetween(String value1, String value2) {
            addCriterion("PARTNER_NAME between", value1, value2, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotBetween(String value1, String value2) {
            addCriterion("PARTNER_NAME not between", value1, value2, "partnerName");
            return (Criteria) this;
        }

        public Criteria andEducatedLevelIsNull() {
            addCriterion("EDUCATED_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andEducatedLevelIsNotNull() {
            addCriterion("EDUCATED_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andEducatedLevelEqualTo(String value) {
            addCriterion("EDUCATED_LEVEL =", value, "educatedLevel");
            return (Criteria) this;
        }

        public Criteria andEducatedLevelNotEqualTo(String value) {
            addCriterion("EDUCATED_LEVEL <>", value, "educatedLevel");
            return (Criteria) this;
        }

        public Criteria andEducatedLevelGreaterThan(String value) {
            addCriterion("EDUCATED_LEVEL >", value, "educatedLevel");
            return (Criteria) this;
        }

        public Criteria andEducatedLevelGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATED_LEVEL >=", value, "educatedLevel");
            return (Criteria) this;
        }

        public Criteria andEducatedLevelLessThan(String value) {
            addCriterion("EDUCATED_LEVEL <", value, "educatedLevel");
            return (Criteria) this;
        }

        public Criteria andEducatedLevelLessThanOrEqualTo(String value) {
            addCriterion("EDUCATED_LEVEL <=", value, "educatedLevel");
            return (Criteria) this;
        }

        public Criteria andEducatedLevelLike(String value) {
            addCriterion("EDUCATED_LEVEL like", value, "educatedLevel");
            return (Criteria) this;
        }

        public Criteria andEducatedLevelNotLike(String value) {
            addCriterion("EDUCATED_LEVEL not like", value, "educatedLevel");
            return (Criteria) this;
        }

        public Criteria andEducatedLevelIn(List<String> values) {
            addCriterion("EDUCATED_LEVEL in", values, "educatedLevel");
            return (Criteria) this;
        }

        public Criteria andEducatedLevelNotIn(List<String> values) {
            addCriterion("EDUCATED_LEVEL not in", values, "educatedLevel");
            return (Criteria) this;
        }

        public Criteria andEducatedLevelBetween(String value1, String value2) {
            addCriterion("EDUCATED_LEVEL between", value1, value2, "educatedLevel");
            return (Criteria) this;
        }

        public Criteria andEducatedLevelNotBetween(String value1, String value2) {
            addCriterion("EDUCATED_LEVEL not between", value1, value2, "educatedLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLdentityIsNull() {
            addCriterion("MEMBER_LDENTITY is null");
            return (Criteria) this;
        }

        public Criteria andMemberLdentityIsNotNull() {
            addCriterion("MEMBER_LDENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLdentityEqualTo(String value) {
            addCriterion("MEMBER_LDENTITY =", value, "memberLdentity");
            return (Criteria) this;
        }

        public Criteria andMemberLdentityNotEqualTo(String value) {
            addCriterion("MEMBER_LDENTITY <>", value, "memberLdentity");
            return (Criteria) this;
        }

        public Criteria andMemberLdentityGreaterThan(String value) {
            addCriterion("MEMBER_LDENTITY >", value, "memberLdentity");
            return (Criteria) this;
        }

        public Criteria andMemberLdentityGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_LDENTITY >=", value, "memberLdentity");
            return (Criteria) this;
        }

        public Criteria andMemberLdentityLessThan(String value) {
            addCriterion("MEMBER_LDENTITY <", value, "memberLdentity");
            return (Criteria) this;
        }

        public Criteria andMemberLdentityLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_LDENTITY <=", value, "memberLdentity");
            return (Criteria) this;
        }

        public Criteria andMemberLdentityLike(String value) {
            addCriterion("MEMBER_LDENTITY like", value, "memberLdentity");
            return (Criteria) this;
        }

        public Criteria andMemberLdentityNotLike(String value) {
            addCriterion("MEMBER_LDENTITY not like", value, "memberLdentity");
            return (Criteria) this;
        }

        public Criteria andMemberLdentityIn(List<String> values) {
            addCriterion("MEMBER_LDENTITY in", values, "memberLdentity");
            return (Criteria) this;
        }

        public Criteria andMemberLdentityNotIn(List<String> values) {
            addCriterion("MEMBER_LDENTITY not in", values, "memberLdentity");
            return (Criteria) this;
        }

        public Criteria andMemberLdentityBetween(String value1, String value2) {
            addCriterion("MEMBER_LDENTITY between", value1, value2, "memberLdentity");
            return (Criteria) this;
        }

        public Criteria andMemberLdentityNotBetween(String value1, String value2) {
            addCriterion("MEMBER_LDENTITY not between", value1, value2, "memberLdentity");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNull() {
            addCriterion("ENTRY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNotNull() {
            addCriterion("ENTRY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeEqualTo(String value) {
            addCriterion("ENTRY_TIME =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotEqualTo(String value) {
            addCriterion("ENTRY_TIME <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThan(String value) {
            addCriterion("ENTRY_TIME >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRY_TIME >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThan(String value) {
            addCriterion("ENTRY_TIME <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThanOrEqualTo(String value) {
            addCriterion("ENTRY_TIME <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLike(String value) {
            addCriterion("ENTRY_TIME like", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotLike(String value) {
            addCriterion("ENTRY_TIME not like", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIn(List<String> values) {
            addCriterion("ENTRY_TIME in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotIn(List<String> values) {
            addCriterion("ENTRY_TIME not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeBetween(String value1, String value2) {
            addCriterion("ENTRY_TIME between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotBetween(String value1, String value2) {
            addCriterion("ENTRY_TIME not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNull() {
            addCriterion("CARD_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("CARD_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("CARD_NUMBER =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("CARD_NUMBER <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("CARD_NUMBER >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NUMBER >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("CARD_NUMBER <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("CARD_NUMBER <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("CARD_NUMBER like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("CARD_NUMBER not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("CARD_NUMBER in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("CARD_NUMBER not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("CARD_NUMBER between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("CARD_NUMBER not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andAlipayNumberIsNull() {
            addCriterion("ALIPAY_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAlipayNumberIsNotNull() {
            addCriterion("ALIPAY_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayNumberEqualTo(String value) {
            addCriterion("ALIPAY_NUMBER =", value, "alipayNumber");
            return (Criteria) this;
        }

        public Criteria andAlipayNumberNotEqualTo(String value) {
            addCriterion("ALIPAY_NUMBER <>", value, "alipayNumber");
            return (Criteria) this;
        }

        public Criteria andAlipayNumberGreaterThan(String value) {
            addCriterion("ALIPAY_NUMBER >", value, "alipayNumber");
            return (Criteria) this;
        }

        public Criteria andAlipayNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ALIPAY_NUMBER >=", value, "alipayNumber");
            return (Criteria) this;
        }

        public Criteria andAlipayNumberLessThan(String value) {
            addCriterion("ALIPAY_NUMBER <", value, "alipayNumber");
            return (Criteria) this;
        }

        public Criteria andAlipayNumberLessThanOrEqualTo(String value) {
            addCriterion("ALIPAY_NUMBER <=", value, "alipayNumber");
            return (Criteria) this;
        }

        public Criteria andAlipayNumberLike(String value) {
            addCriterion("ALIPAY_NUMBER like", value, "alipayNumber");
            return (Criteria) this;
        }

        public Criteria andAlipayNumberNotLike(String value) {
            addCriterion("ALIPAY_NUMBER not like", value, "alipayNumber");
            return (Criteria) this;
        }

        public Criteria andAlipayNumberIn(List<String> values) {
            addCriterion("ALIPAY_NUMBER in", values, "alipayNumber");
            return (Criteria) this;
        }

        public Criteria andAlipayNumberNotIn(List<String> values) {
            addCriterion("ALIPAY_NUMBER not in", values, "alipayNumber");
            return (Criteria) this;
        }

        public Criteria andAlipayNumberBetween(String value1, String value2) {
            addCriterion("ALIPAY_NUMBER between", value1, value2, "alipayNumber");
            return (Criteria) this;
        }

        public Criteria andAlipayNumberNotBetween(String value1, String value2) {
            addCriterion("ALIPAY_NUMBER not between", value1, value2, "alipayNumber");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andHasCarIsNull() {
            addCriterion("HAS_CAR is null");
            return (Criteria) this;
        }

        public Criteria andHasCarIsNotNull() {
            addCriterion("HAS_CAR is not null");
            return (Criteria) this;
        }

        public Criteria andHasCarEqualTo(String value) {
            addCriterion("HAS_CAR =", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarNotEqualTo(String value) {
            addCriterion("HAS_CAR <>", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarGreaterThan(String value) {
            addCriterion("HAS_CAR >", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_CAR >=", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarLessThan(String value) {
            addCriterion("HAS_CAR <", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarLessThanOrEqualTo(String value) {
            addCriterion("HAS_CAR <=", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarLike(String value) {
            addCriterion("HAS_CAR like", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarNotLike(String value) {
            addCriterion("HAS_CAR not like", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarIn(List<String> values) {
            addCriterion("HAS_CAR in", values, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarNotIn(List<String> values) {
            addCriterion("HAS_CAR not in", values, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarBetween(String value1, String value2) {
            addCriterion("HAS_CAR between", value1, value2, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarNotBetween(String value1, String value2) {
            addCriterion("HAS_CAR not between", value1, value2, "hasCar");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("REGISTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("REGISTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(String value) {
            addCriterion("REGISTER_TIME =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(String value) {
            addCriterion("REGISTER_TIME <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(String value) {
            addCriterion("REGISTER_TIME >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_TIME >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(String value) {
            addCriterion("REGISTER_TIME <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_TIME <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLike(String value) {
            addCriterion("REGISTER_TIME like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotLike(String value) {
            addCriterion("REGISTER_TIME not like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<String> values) {
            addCriterion("REGISTER_TIME in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<String> values) {
            addCriterion("REGISTER_TIME not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(String value1, String value2) {
            addCriterion("REGISTER_TIME between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(String value1, String value2) {
            addCriterion("REGISTER_TIME not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRecommendByIsNull() {
            addCriterion("RECOMMEND_BY is null");
            return (Criteria) this;
        }

        public Criteria andRecommendByIsNotNull() {
            addCriterion("RECOMMEND_BY is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendByEqualTo(Long value) {
            addCriterion("RECOMMEND_BY =", value, "recommendBy");
            return (Criteria) this;
        }

        public Criteria andRecommendByNotEqualTo(Long value) {
            addCriterion("RECOMMEND_BY <>", value, "recommendBy");
            return (Criteria) this;
        }

        public Criteria andRecommendByGreaterThan(Long value) {
            addCriterion("RECOMMEND_BY >", value, "recommendBy");
            return (Criteria) this;
        }

        public Criteria andRecommendByGreaterThanOrEqualTo(Long value) {
            addCriterion("RECOMMEND_BY >=", value, "recommendBy");
            return (Criteria) this;
        }

        public Criteria andRecommendByLessThan(Long value) {
            addCriterion("RECOMMEND_BY <", value, "recommendBy");
            return (Criteria) this;
        }

        public Criteria andRecommendByLessThanOrEqualTo(Long value) {
            addCriterion("RECOMMEND_BY <=", value, "recommendBy");
            return (Criteria) this;
        }

        public Criteria andRecommendByIn(List<Long> values) {
            addCriterion("RECOMMEND_BY in", values, "recommendBy");
            return (Criteria) this;
        }

        public Criteria andRecommendByNotIn(List<Long> values) {
            addCriterion("RECOMMEND_BY not in", values, "recommendBy");
            return (Criteria) this;
        }

        public Criteria andRecommendByBetween(Long value1, Long value2) {
            addCriterion("RECOMMEND_BY between", value1, value2, "recommendBy");
            return (Criteria) this;
        }

        public Criteria andRecommendByNotBetween(Long value1, Long value2) {
            addCriterion("RECOMMEND_BY not between", value1, value2, "recommendBy");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("WECHAT is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("WECHAT is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("WECHAT =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("WECHAT <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("WECHAT >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("WECHAT >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("WECHAT <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("WECHAT <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("WECHAT like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("WECHAT not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("WECHAT in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("WECHAT not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("WECHAT between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("WECHAT not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andSinaIsNull() {
            addCriterion("SINA is null");
            return (Criteria) this;
        }

        public Criteria andSinaIsNotNull() {
            addCriterion("SINA is not null");
            return (Criteria) this;
        }

        public Criteria andSinaEqualTo(String value) {
            addCriterion("SINA =", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaNotEqualTo(String value) {
            addCriterion("SINA <>", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaGreaterThan(String value) {
            addCriterion("SINA >", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaGreaterThanOrEqualTo(String value) {
            addCriterion("SINA >=", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaLessThan(String value) {
            addCriterion("SINA <", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaLessThanOrEqualTo(String value) {
            addCriterion("SINA <=", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaLike(String value) {
            addCriterion("SINA like", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaNotLike(String value) {
            addCriterion("SINA not like", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaIn(List<String> values) {
            addCriterion("SINA in", values, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaNotIn(List<String> values) {
            addCriterion("SINA not in", values, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaBetween(String value1, String value2) {
            addCriterion("SINA between", value1, value2, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaNotBetween(String value1, String value2) {
            addCriterion("SINA not between", value1, value2, "sina");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("POST_CODE =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("POST_CODE <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("POST_CODE >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POST_CODE >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("POST_CODE <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("POST_CODE <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("POST_CODE like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("POST_CODE not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("POST_CODE in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("POST_CODE not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("POST_CODE between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("POST_CODE not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andMeihaoLevelIsNull() {
            addCriterion("MEIHAO_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andMeihaoLevelIsNotNull() {
            addCriterion("MEIHAO_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andMeihaoLevelEqualTo(String value) {
            addCriterion("MEIHAO_LEVEL =", value, "meihaoLevel");
            return (Criteria) this;
        }

        public Criteria andMeihaoLevelNotEqualTo(String value) {
            addCriterion("MEIHAO_LEVEL <>", value, "meihaoLevel");
            return (Criteria) this;
        }

        public Criteria andMeihaoLevelGreaterThan(String value) {
            addCriterion("MEIHAO_LEVEL >", value, "meihaoLevel");
            return (Criteria) this;
        }

        public Criteria andMeihaoLevelGreaterThanOrEqualTo(String value) {
            addCriterion("MEIHAO_LEVEL >=", value, "meihaoLevel");
            return (Criteria) this;
        }

        public Criteria andMeihaoLevelLessThan(String value) {
            addCriterion("MEIHAO_LEVEL <", value, "meihaoLevel");
            return (Criteria) this;
        }

        public Criteria andMeihaoLevelLessThanOrEqualTo(String value) {
            addCriterion("MEIHAO_LEVEL <=", value, "meihaoLevel");
            return (Criteria) this;
        }

        public Criteria andMeihaoLevelLike(String value) {
            addCriterion("MEIHAO_LEVEL like", value, "meihaoLevel");
            return (Criteria) this;
        }

        public Criteria andMeihaoLevelNotLike(String value) {
            addCriterion("MEIHAO_LEVEL not like", value, "meihaoLevel");
            return (Criteria) this;
        }

        public Criteria andMeihaoLevelIn(List<String> values) {
            addCriterion("MEIHAO_LEVEL in", values, "meihaoLevel");
            return (Criteria) this;
        }

        public Criteria andMeihaoLevelNotIn(List<String> values) {
            addCriterion("MEIHAO_LEVEL not in", values, "meihaoLevel");
            return (Criteria) this;
        }

        public Criteria andMeihaoLevelBetween(String value1, String value2) {
            addCriterion("MEIHAO_LEVEL between", value1, value2, "meihaoLevel");
            return (Criteria) this;
        }

        public Criteria andMeihaoLevelNotBetween(String value1, String value2) {
            addCriterion("MEIHAO_LEVEL not between", value1, value2, "meihaoLevel");
            return (Criteria) this;
        }

        public Criteria andMeihaoCardNoIsNull() {
            addCriterion("MEIHAO_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andMeihaoCardNoIsNotNull() {
            addCriterion("MEIHAO_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMeihaoCardNoEqualTo(String value) {
            addCriterion("MEIHAO_CARD_NO =", value, "meihaoCardNo");
            return (Criteria) this;
        }

        public Criteria andMeihaoCardNoNotEqualTo(String value) {
            addCriterion("MEIHAO_CARD_NO <>", value, "meihaoCardNo");
            return (Criteria) this;
        }

        public Criteria andMeihaoCardNoGreaterThan(String value) {
            addCriterion("MEIHAO_CARD_NO >", value, "meihaoCardNo");
            return (Criteria) this;
        }

        public Criteria andMeihaoCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("MEIHAO_CARD_NO >=", value, "meihaoCardNo");
            return (Criteria) this;
        }

        public Criteria andMeihaoCardNoLessThan(String value) {
            addCriterion("MEIHAO_CARD_NO <", value, "meihaoCardNo");
            return (Criteria) this;
        }

        public Criteria andMeihaoCardNoLessThanOrEqualTo(String value) {
            addCriterion("MEIHAO_CARD_NO <=", value, "meihaoCardNo");
            return (Criteria) this;
        }

        public Criteria andMeihaoCardNoLike(String value) {
            addCriterion("MEIHAO_CARD_NO like", value, "meihaoCardNo");
            return (Criteria) this;
        }

        public Criteria andMeihaoCardNoNotLike(String value) {
            addCriterion("MEIHAO_CARD_NO not like", value, "meihaoCardNo");
            return (Criteria) this;
        }

        public Criteria andMeihaoCardNoIn(List<String> values) {
            addCriterion("MEIHAO_CARD_NO in", values, "meihaoCardNo");
            return (Criteria) this;
        }

        public Criteria andMeihaoCardNoNotIn(List<String> values) {
            addCriterion("MEIHAO_CARD_NO not in", values, "meihaoCardNo");
            return (Criteria) this;
        }

        public Criteria andMeihaoCardNoBetween(String value1, String value2) {
            addCriterion("MEIHAO_CARD_NO between", value1, value2, "meihaoCardNo");
            return (Criteria) this;
        }

        public Criteria andMeihaoCardNoNotBetween(String value1, String value2) {
            addCriterion("MEIHAO_CARD_NO not between", value1, value2, "meihaoCardNo");
            return (Criteria) this;
        }

        public Criteria andIsActivationIsNull() {
            addCriterion("IS_ACTIVATION is null");
            return (Criteria) this;
        }

        public Criteria andIsActivationIsNotNull() {
            addCriterion("IS_ACTIVATION is not null");
            return (Criteria) this;
        }

        public Criteria andIsActivationEqualTo(String value) {
            addCriterion("IS_ACTIVATION =", value, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationNotEqualTo(String value) {
            addCriterion("IS_ACTIVATION <>", value, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationGreaterThan(String value) {
            addCriterion("IS_ACTIVATION >", value, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ACTIVATION >=", value, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationLessThan(String value) {
            addCriterion("IS_ACTIVATION <", value, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationLessThanOrEqualTo(String value) {
            addCriterion("IS_ACTIVATION <=", value, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationLike(String value) {
            addCriterion("IS_ACTIVATION like", value, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationNotLike(String value) {
            addCriterion("IS_ACTIVATION not like", value, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationIn(List<String> values) {
            addCriterion("IS_ACTIVATION in", values, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationNotIn(List<String> values) {
            addCriterion("IS_ACTIVATION not in", values, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationBetween(String value1, String value2) {
            addCriterion("IS_ACTIVATION between", value1, value2, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationNotBetween(String value1, String value2) {
            addCriterion("IS_ACTIVATION not between", value1, value2, "isActivation");
            return (Criteria) this;
        }

        public Criteria andActivationTimeIsNull() {
            addCriterion("ACTIVATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andActivationTimeIsNotNull() {
            addCriterion("ACTIVATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andActivationTimeEqualTo(String value) {
            addCriterion("ACTIVATION_TIME =", value, "activationTime");
            return (Criteria) this;
        }

        public Criteria andActivationTimeNotEqualTo(String value) {
            addCriterion("ACTIVATION_TIME <>", value, "activationTime");
            return (Criteria) this;
        }

        public Criteria andActivationTimeGreaterThan(String value) {
            addCriterion("ACTIVATION_TIME >", value, "activationTime");
            return (Criteria) this;
        }

        public Criteria andActivationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVATION_TIME >=", value, "activationTime");
            return (Criteria) this;
        }

        public Criteria andActivationTimeLessThan(String value) {
            addCriterion("ACTIVATION_TIME <", value, "activationTime");
            return (Criteria) this;
        }

        public Criteria andActivationTimeLessThanOrEqualTo(String value) {
            addCriterion("ACTIVATION_TIME <=", value, "activationTime");
            return (Criteria) this;
        }

        public Criteria andActivationTimeLike(String value) {
            addCriterion("ACTIVATION_TIME like", value, "activationTime");
            return (Criteria) this;
        }

        public Criteria andActivationTimeNotLike(String value) {
            addCriterion("ACTIVATION_TIME not like", value, "activationTime");
            return (Criteria) this;
        }

        public Criteria andActivationTimeIn(List<String> values) {
            addCriterion("ACTIVATION_TIME in", values, "activationTime");
            return (Criteria) this;
        }

        public Criteria andActivationTimeNotIn(List<String> values) {
            addCriterion("ACTIVATION_TIME not in", values, "activationTime");
            return (Criteria) this;
        }

        public Criteria andActivationTimeBetween(String value1, String value2) {
            addCriterion("ACTIVATION_TIME between", value1, value2, "activationTime");
            return (Criteria) this;
        }

        public Criteria andActivationTimeNotBetween(String value1, String value2) {
            addCriterion("ACTIVATION_TIME not between", value1, value2, "activationTime");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("INDUSTRY is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("INDUSTRY is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("INDUSTRY =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("INDUSTRY <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("INDUSTRY >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("INDUSTRY <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("INDUSTRY like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("INDUSTRY not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("INDUSTRY in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("INDUSTRY not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("INDUSTRY between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("NATIVE_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("NATIVE_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("NATIVE_PLACE =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("NATIVE_PLACE <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("NATIVE_PLACE >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("NATIVE_PLACE >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("NATIVE_PLACE <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("NATIVE_PLACE <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("NATIVE_PLACE like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("NATIVE_PLACE not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("NATIVE_PLACE in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("NATIVE_PLACE not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("NATIVE_PLACE between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("NATIVE_PLACE not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenIsNull() {
            addCriterion("HAVE_CHILDREN is null");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenIsNotNull() {
            addCriterion("HAVE_CHILDREN is not null");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenEqualTo(String value) {
            addCriterion("HAVE_CHILDREN =", value, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenNotEqualTo(String value) {
            addCriterion("HAVE_CHILDREN <>", value, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenGreaterThan(String value) {
            addCriterion("HAVE_CHILDREN >", value, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenGreaterThanOrEqualTo(String value) {
            addCriterion("HAVE_CHILDREN >=", value, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenLessThan(String value) {
            addCriterion("HAVE_CHILDREN <", value, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenLessThanOrEqualTo(String value) {
            addCriterion("HAVE_CHILDREN <=", value, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenLike(String value) {
            addCriterion("HAVE_CHILDREN like", value, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenNotLike(String value) {
            addCriterion("HAVE_CHILDREN not like", value, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenIn(List<String> values) {
            addCriterion("HAVE_CHILDREN in", values, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenNotIn(List<String> values) {
            addCriterion("HAVE_CHILDREN not in", values, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenBetween(String value1, String value2) {
            addCriterion("HAVE_CHILDREN between", value1, value2, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenNotBetween(String value1, String value2) {
            addCriterion("HAVE_CHILDREN not between", value1, value2, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Long value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Long value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Long value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Long value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Long> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Long> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
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