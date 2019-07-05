package com.atguigu.crud.bean;

public class Comment {
    private Integer commentId;

    private String commentStatu;

    private String scoring;

    private String bookReview;

    private Integer bookId;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentStatu() {
        return commentStatu;
    }

    public void setCommentStatu(String commentStatu) {
        this.commentStatu = commentStatu == null ? null : commentStatu.trim();
    }

    public String getScoring() {
        return scoring;
    }

    public void setScoring(String scoring) {
        this.scoring = scoring == null ? null : scoring.trim();
    }

    public String getBookReview() {
        return bookReview;
    }

    public void setBookReview(String bookReview) {
        this.bookReview = bookReview == null ? null : bookReview.trim();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}