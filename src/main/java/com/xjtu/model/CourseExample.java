package com.xjtu.model;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CourseExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andCourseidIsNull() {
            addCriterion("courseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseId =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseId <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseId >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseId >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseId <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseId <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseId in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseId not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseId between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseId not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("courseName is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("courseName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("courseName =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("courseName <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("courseName >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("courseName >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("courseName <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("courseName <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("courseName like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("courseName not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("courseName in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("courseName not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("courseName between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("courseName not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCourselink1IsNull() {
            addCriterion("courseLink1 is null");
            return (Criteria) this;
        }

        public Criteria andCourselink1IsNotNull() {
            addCriterion("courseLink1 is not null");
            return (Criteria) this;
        }

        public Criteria andCourselink1EqualTo(String value) {
            addCriterion("courseLink1 =", value, "courselink1");
            return (Criteria) this;
        }

        public Criteria andCourselink1NotEqualTo(String value) {
            addCriterion("courseLink1 <>", value, "courselink1");
            return (Criteria) this;
        }

        public Criteria andCourselink1GreaterThan(String value) {
            addCriterion("courseLink1 >", value, "courselink1");
            return (Criteria) this;
        }

        public Criteria andCourselink1GreaterThanOrEqualTo(String value) {
            addCriterion("courseLink1 >=", value, "courselink1");
            return (Criteria) this;
        }

        public Criteria andCourselink1LessThan(String value) {
            addCriterion("courseLink1 <", value, "courselink1");
            return (Criteria) this;
        }

        public Criteria andCourselink1LessThanOrEqualTo(String value) {
            addCriterion("courseLink1 <=", value, "courselink1");
            return (Criteria) this;
        }

        public Criteria andCourselink1Like(String value) {
            addCriterion("courseLink1 like", value, "courselink1");
            return (Criteria) this;
        }

        public Criteria andCourselink1NotLike(String value) {
            addCriterion("courseLink1 not like", value, "courselink1");
            return (Criteria) this;
        }

        public Criteria andCourselink1In(List<String> values) {
            addCriterion("courseLink1 in", values, "courselink1");
            return (Criteria) this;
        }

        public Criteria andCourselink1NotIn(List<String> values) {
            addCriterion("courseLink1 not in", values, "courselink1");
            return (Criteria) this;
        }

        public Criteria andCourselink1Between(String value1, String value2) {
            addCriterion("courseLink1 between", value1, value2, "courselink1");
            return (Criteria) this;
        }

        public Criteria andCourselink1NotBetween(String value1, String value2) {
            addCriterion("courseLink1 not between", value1, value2, "courselink1");
            return (Criteria) this;
        }

        public Criteria andCourselink2IsNull() {
            addCriterion("courseLink2 is null");
            return (Criteria) this;
        }

        public Criteria andCourselink2IsNotNull() {
            addCriterion("courseLink2 is not null");
            return (Criteria) this;
        }

        public Criteria andCourselink2EqualTo(String value) {
            addCriterion("courseLink2 =", value, "courselink2");
            return (Criteria) this;
        }

        public Criteria andCourselink2NotEqualTo(String value) {
            addCriterion("courseLink2 <>", value, "courselink2");
            return (Criteria) this;
        }

        public Criteria andCourselink2GreaterThan(String value) {
            addCriterion("courseLink2 >", value, "courselink2");
            return (Criteria) this;
        }

        public Criteria andCourselink2GreaterThanOrEqualTo(String value) {
            addCriterion("courseLink2 >=", value, "courselink2");
            return (Criteria) this;
        }

        public Criteria andCourselink2LessThan(String value) {
            addCriterion("courseLink2 <", value, "courselink2");
            return (Criteria) this;
        }

        public Criteria andCourselink2LessThanOrEqualTo(String value) {
            addCriterion("courseLink2 <=", value, "courselink2");
            return (Criteria) this;
        }

        public Criteria andCourselink2Like(String value) {
            addCriterion("courseLink2 like", value, "courselink2");
            return (Criteria) this;
        }

        public Criteria andCourselink2NotLike(String value) {
            addCriterion("courseLink2 not like", value, "courselink2");
            return (Criteria) this;
        }

        public Criteria andCourselink2In(List<String> values) {
            addCriterion("courseLink2 in", values, "courselink2");
            return (Criteria) this;
        }

        public Criteria andCourselink2NotIn(List<String> values) {
            addCriterion("courseLink2 not in", values, "courselink2");
            return (Criteria) this;
        }

        public Criteria andCourselink2Between(String value1, String value2) {
            addCriterion("courseLink2 between", value1, value2, "courselink2");
            return (Criteria) this;
        }

        public Criteria andCourselink2NotBetween(String value1, String value2) {
            addCriterion("courseLink2 not between", value1, value2, "courselink2");
            return (Criteria) this;
        }

        public Criteria andCourselink3IsNull() {
            addCriterion("courseLink3 is null");
            return (Criteria) this;
        }

        public Criteria andCourselink3IsNotNull() {
            addCriterion("courseLink3 is not null");
            return (Criteria) this;
        }

        public Criteria andCourselink3EqualTo(String value) {
            addCriterion("courseLink3 =", value, "courselink3");
            return (Criteria) this;
        }

        public Criteria andCourselink3NotEqualTo(String value) {
            addCriterion("courseLink3 <>", value, "courselink3");
            return (Criteria) this;
        }

        public Criteria andCourselink3GreaterThan(String value) {
            addCriterion("courseLink3 >", value, "courselink3");
            return (Criteria) this;
        }

        public Criteria andCourselink3GreaterThanOrEqualTo(String value) {
            addCriterion("courseLink3 >=", value, "courselink3");
            return (Criteria) this;
        }

        public Criteria andCourselink3LessThan(String value) {
            addCriterion("courseLink3 <", value, "courselink3");
            return (Criteria) this;
        }

        public Criteria andCourselink3LessThanOrEqualTo(String value) {
            addCriterion("courseLink3 <=", value, "courselink3");
            return (Criteria) this;
        }

        public Criteria andCourselink3Like(String value) {
            addCriterion("courseLink3 like", value, "courselink3");
            return (Criteria) this;
        }

        public Criteria andCourselink3NotLike(String value) {
            addCriterion("courseLink3 not like", value, "courselink3");
            return (Criteria) this;
        }

        public Criteria andCourselink3In(List<String> values) {
            addCriterion("courseLink3 in", values, "courselink3");
            return (Criteria) this;
        }

        public Criteria andCourselink3NotIn(List<String> values) {
            addCriterion("courseLink3 not in", values, "courselink3");
            return (Criteria) this;
        }

        public Criteria andCourselink3Between(String value1, String value2) {
            addCriterion("courseLink3 between", value1, value2, "courselink3");
            return (Criteria) this;
        }

        public Criteria andCourselink3NotBetween(String value1, String value2) {
            addCriterion("courseLink3 not between", value1, value2, "courselink3");
            return (Criteria) this;
        }
    }

    /**
     */
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