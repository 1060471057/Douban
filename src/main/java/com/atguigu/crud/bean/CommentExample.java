package com.atguigu.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentStatuIsNull() {
            addCriterion("comment_statu is null");
            return (Criteria) this;
        }

        public Criteria andCommentStatuIsNotNull() {
            addCriterion("comment_statu is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStatuEqualTo(String value) {
            addCriterion("comment_statu =", value, "commentStatu");
            return (Criteria) this;
        }

        public Criteria andCommentStatuNotEqualTo(String value) {
            addCriterion("comment_statu <>", value, "commentStatu");
            return (Criteria) this;
        }

        public Criteria andCommentStatuGreaterThan(String value) {
            addCriterion("comment_statu >", value, "commentStatu");
            return (Criteria) this;
        }

        public Criteria andCommentStatuGreaterThanOrEqualTo(String value) {
            addCriterion("comment_statu >=", value, "commentStatu");
            return (Criteria) this;
        }

        public Criteria andCommentStatuLessThan(String value) {
            addCriterion("comment_statu <", value, "commentStatu");
            return (Criteria) this;
        }

        public Criteria andCommentStatuLessThanOrEqualTo(String value) {
            addCriterion("comment_statu <=", value, "commentStatu");
            return (Criteria) this;
        }

        public Criteria andCommentStatuLike(String value) {
            addCriterion("comment_statu like", value, "commentStatu");
            return (Criteria) this;
        }

        public Criteria andCommentStatuNotLike(String value) {
            addCriterion("comment_statu not like", value, "commentStatu");
            return (Criteria) this;
        }

        public Criteria andCommentStatuIn(List<String> values) {
            addCriterion("comment_statu in", values, "commentStatu");
            return (Criteria) this;
        }

        public Criteria andCommentStatuNotIn(List<String> values) {
            addCriterion("comment_statu not in", values, "commentStatu");
            return (Criteria) this;
        }

        public Criteria andCommentStatuBetween(String value1, String value2) {
            addCriterion("comment_statu between", value1, value2, "commentStatu");
            return (Criteria) this;
        }

        public Criteria andCommentStatuNotBetween(String value1, String value2) {
            addCriterion("comment_statu not between", value1, value2, "commentStatu");
            return (Criteria) this;
        }

        public Criteria andScoringIsNull() {
            addCriterion("scoring is null");
            return (Criteria) this;
        }

        public Criteria andScoringIsNotNull() {
            addCriterion("scoring is not null");
            return (Criteria) this;
        }

        public Criteria andScoringEqualTo(String value) {
            addCriterion("scoring =", value, "scoring");
            return (Criteria) this;
        }

        public Criteria andScoringNotEqualTo(String value) {
            addCriterion("scoring <>", value, "scoring");
            return (Criteria) this;
        }

        public Criteria andScoringGreaterThan(String value) {
            addCriterion("scoring >", value, "scoring");
            return (Criteria) this;
        }

        public Criteria andScoringGreaterThanOrEqualTo(String value) {
            addCriterion("scoring >=", value, "scoring");
            return (Criteria) this;
        }

        public Criteria andScoringLessThan(String value) {
            addCriterion("scoring <", value, "scoring");
            return (Criteria) this;
        }

        public Criteria andScoringLessThanOrEqualTo(String value) {
            addCriterion("scoring <=", value, "scoring");
            return (Criteria) this;
        }

        public Criteria andScoringLike(String value) {
            addCriterion("scoring like", value, "scoring");
            return (Criteria) this;
        }

        public Criteria andScoringNotLike(String value) {
            addCriterion("scoring not like", value, "scoring");
            return (Criteria) this;
        }

        public Criteria andScoringIn(List<String> values) {
            addCriterion("scoring in", values, "scoring");
            return (Criteria) this;
        }

        public Criteria andScoringNotIn(List<String> values) {
            addCriterion("scoring not in", values, "scoring");
            return (Criteria) this;
        }

        public Criteria andScoringBetween(String value1, String value2) {
            addCriterion("scoring between", value1, value2, "scoring");
            return (Criteria) this;
        }

        public Criteria andScoringNotBetween(String value1, String value2) {
            addCriterion("scoring not between", value1, value2, "scoring");
            return (Criteria) this;
        }

        public Criteria andBookReviewIsNull() {
            addCriterion("book_review is null");
            return (Criteria) this;
        }

        public Criteria andBookReviewIsNotNull() {
            addCriterion("book_review is not null");
            return (Criteria) this;
        }

        public Criteria andBookReviewEqualTo(String value) {
            addCriterion("book_review =", value, "bookReview");
            return (Criteria) this;
        }

        public Criteria andBookReviewNotEqualTo(String value) {
            addCriterion("book_review <>", value, "bookReview");
            return (Criteria) this;
        }

        public Criteria andBookReviewGreaterThan(String value) {
            addCriterion("book_review >", value, "bookReview");
            return (Criteria) this;
        }

        public Criteria andBookReviewGreaterThanOrEqualTo(String value) {
            addCriterion("book_review >=", value, "bookReview");
            return (Criteria) this;
        }

        public Criteria andBookReviewLessThan(String value) {
            addCriterion("book_review <", value, "bookReview");
            return (Criteria) this;
        }

        public Criteria andBookReviewLessThanOrEqualTo(String value) {
            addCriterion("book_review <=", value, "bookReview");
            return (Criteria) this;
        }

        public Criteria andBookReviewLike(String value) {
            addCriterion("book_review like", value, "bookReview");
            return (Criteria) this;
        }

        public Criteria andBookReviewNotLike(String value) {
            addCriterion("book_review not like", value, "bookReview");
            return (Criteria) this;
        }

        public Criteria andBookReviewIn(List<String> values) {
            addCriterion("book_review in", values, "bookReview");
            return (Criteria) this;
        }

        public Criteria andBookReviewNotIn(List<String> values) {
            addCriterion("book_review not in", values, "bookReview");
            return (Criteria) this;
        }

        public Criteria andBookReviewBetween(String value1, String value2) {
            addCriterion("book_review between", value1, value2, "bookReview");
            return (Criteria) this;
        }

        public Criteria andBookReviewNotBetween(String value1, String value2) {
            addCriterion("book_review not between", value1, value2, "bookReview");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
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