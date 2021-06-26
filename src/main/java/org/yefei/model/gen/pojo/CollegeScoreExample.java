package org.yefei.model.gen.pojo;

import java.util.ArrayList;
import java.util.List;

public class CollegeScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollegeScoreExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSchoolIDIsNull() {
            addCriterion("schoolID is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIDIsNotNull() {
            addCriterion("schoolID is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIDEqualTo(Integer value) {
            addCriterion("schoolID =", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDNotEqualTo(Integer value) {
            addCriterion("schoolID <>", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDGreaterThan(Integer value) {
            addCriterion("schoolID >", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolID >=", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDLessThan(Integer value) {
            addCriterion("schoolID <", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDLessThanOrEqualTo(Integer value) {
            addCriterion("schoolID <=", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDIn(List<Integer> values) {
            addCriterion("schoolID in", values, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDNotIn(List<Integer> values) {
            addCriterion("schoolID not in", values, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDBetween(Integer value1, Integer value2) {
            addCriterion("schoolID between", value1, value2, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolID not between", value1, value2, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNull() {
            addCriterion("schoolName is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("schoolName is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("schoolName =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("schoolName <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("schoolName >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("schoolName >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("schoolName <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("schoolName <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("schoolName like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("schoolName not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("schoolName in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("schoolName not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("schoolName between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("schoolName not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andProviceIsNull() {
            addCriterion("provice is null");
            return (Criteria) this;
        }

        public Criteria andProviceIsNotNull() {
            addCriterion("provice is not null");
            return (Criteria) this;
        }

        public Criteria andProviceEqualTo(String value) {
            addCriterion("provice =", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceNotEqualTo(String value) {
            addCriterion("provice <>", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceGreaterThan(String value) {
            addCriterion("provice >", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceGreaterThanOrEqualTo(String value) {
            addCriterion("provice >=", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceLessThan(String value) {
            addCriterion("provice <", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceLessThanOrEqualTo(String value) {
            addCriterion("provice <=", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceLike(String value) {
            addCriterion("provice like", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceNotLike(String value) {
            addCriterion("provice not like", value, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceIn(List<String> values) {
            addCriterion("provice in", values, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceNotIn(List<String> values) {
            addCriterion("provice not in", values, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceBetween(String value1, String value2) {
            addCriterion("provice between", value1, value2, "provice");
            return (Criteria) this;
        }

        public Criteria andProviceNotBetween(String value1, String value2) {
            addCriterion("provice not between", value1, value2, "provice");
            return (Criteria) this;
        }

        public Criteria andSpecialIDIsNull() {
            addCriterion("specialID is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIDIsNotNull() {
            addCriterion("specialID is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialIDEqualTo(Integer value) {
            addCriterion("specialID =", value, "specialID");
            return (Criteria) this;
        }

        public Criteria andSpecialIDNotEqualTo(Integer value) {
            addCriterion("specialID <>", value, "specialID");
            return (Criteria) this;
        }

        public Criteria andSpecialIDGreaterThan(Integer value) {
            addCriterion("specialID >", value, "specialID");
            return (Criteria) this;
        }

        public Criteria andSpecialIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("specialID >=", value, "specialID");
            return (Criteria) this;
        }

        public Criteria andSpecialIDLessThan(Integer value) {
            addCriterion("specialID <", value, "specialID");
            return (Criteria) this;
        }

        public Criteria andSpecialIDLessThanOrEqualTo(Integer value) {
            addCriterion("specialID <=", value, "specialID");
            return (Criteria) this;
        }

        public Criteria andSpecialIDIn(List<Integer> values) {
            addCriterion("specialID in", values, "specialID");
            return (Criteria) this;
        }

        public Criteria andSpecialIDNotIn(List<Integer> values) {
            addCriterion("specialID not in", values, "specialID");
            return (Criteria) this;
        }

        public Criteria andSpecialIDBetween(Integer value1, Integer value2) {
            addCriterion("specialID between", value1, value2, "specialID");
            return (Criteria) this;
        }

        public Criteria andSpecialIDNotBetween(Integer value1, Integer value2) {
            addCriterion("specialID not between", value1, value2, "specialID");
            return (Criteria) this;
        }

        public Criteria andSpecialNameIsNull() {
            addCriterion("specialName is null");
            return (Criteria) this;
        }

        public Criteria andSpecialNameIsNotNull() {
            addCriterion("specialName is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialNameEqualTo(String value) {
            addCriterion("specialName =", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameNotEqualTo(String value) {
            addCriterion("specialName <>", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameGreaterThan(String value) {
            addCriterion("specialName >", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameGreaterThanOrEqualTo(String value) {
            addCriterion("specialName >=", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameLessThan(String value) {
            addCriterion("specialName <", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameLessThanOrEqualTo(String value) {
            addCriterion("specialName <=", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameLike(String value) {
            addCriterion("specialName like", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameNotLike(String value) {
            addCriterion("specialName not like", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameIn(List<String> values) {
            addCriterion("specialName in", values, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameNotIn(List<String> values) {
            addCriterion("specialName not in", values, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameBetween(String value1, String value2) {
            addCriterion("specialName between", value1, value2, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameNotBetween(String value1, String value2) {
            addCriterion("specialName not between", value1, value2, "specialName");
            return (Criteria) this;
        }

        public Criteria andBatchNameIsNull() {
            addCriterion("batchName is null");
            return (Criteria) this;
        }

        public Criteria andBatchNameIsNotNull() {
            addCriterion("batchName is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNameEqualTo(String value) {
            addCriterion("batchName =", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotEqualTo(String value) {
            addCriterion("batchName <>", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameGreaterThan(String value) {
            addCriterion("batchName >", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameGreaterThanOrEqualTo(String value) {
            addCriterion("batchName >=", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLessThan(String value) {
            addCriterion("batchName <", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLessThanOrEqualTo(String value) {
            addCriterion("batchName <=", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLike(String value) {
            addCriterion("batchName like", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotLike(String value) {
            addCriterion("batchName not like", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameIn(List<String> values) {
            addCriterion("batchName in", values, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotIn(List<String> values) {
            addCriterion("batchName not in", values, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameBetween(String value1, String value2) {
            addCriterion("batchName between", value1, value2, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotBetween(String value1, String value2) {
            addCriterion("batchName not between", value1, value2, "batchName");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLineBatch2IsNull() {
            addCriterion("scoreLineBatch2 is null");
            return (Criteria) this;
        }

        public Criteria andScoreLineBatch2IsNotNull() {
            addCriterion("scoreLineBatch2 is not null");
            return (Criteria) this;
        }

        public Criteria andScoreLineBatch2EqualTo(Integer value) {
            addCriterion("scoreLineBatch2 =", value, "scoreLineBatch2");
            return (Criteria) this;
        }

        public Criteria andScoreLineBatch2NotEqualTo(Integer value) {
            addCriterion("scoreLineBatch2 <>", value, "scoreLineBatch2");
            return (Criteria) this;
        }

        public Criteria andScoreLineBatch2GreaterThan(Integer value) {
            addCriterion("scoreLineBatch2 >", value, "scoreLineBatch2");
            return (Criteria) this;
        }

        public Criteria andScoreLineBatch2GreaterThanOrEqualTo(Integer value) {
            addCriterion("scoreLineBatch2 >=", value, "scoreLineBatch2");
            return (Criteria) this;
        }

        public Criteria andScoreLineBatch2LessThan(Integer value) {
            addCriterion("scoreLineBatch2 <", value, "scoreLineBatch2");
            return (Criteria) this;
        }

        public Criteria andScoreLineBatch2LessThanOrEqualTo(Integer value) {
            addCriterion("scoreLineBatch2 <=", value, "scoreLineBatch2");
            return (Criteria) this;
        }

        public Criteria andScoreLineBatch2In(List<Integer> values) {
            addCriterion("scoreLineBatch2 in", values, "scoreLineBatch2");
            return (Criteria) this;
        }

        public Criteria andScoreLineBatch2NotIn(List<Integer> values) {
            addCriterion("scoreLineBatch2 not in", values, "scoreLineBatch2");
            return (Criteria) this;
        }

        public Criteria andScoreLineBatch2Between(Integer value1, Integer value2) {
            addCriterion("scoreLineBatch2 between", value1, value2, "scoreLineBatch2");
            return (Criteria) this;
        }

        public Criteria andScoreLineBatch2NotBetween(Integer value1, Integer value2) {
            addCriterion("scoreLineBatch2 not between", value1, value2, "scoreLineBatch2");
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