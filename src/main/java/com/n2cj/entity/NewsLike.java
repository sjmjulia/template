package com.n2cj.entity;

// Generated 2015-9-6 10:20:22 by Hibernate Tools 4.3.1

/**
 * NewsLike generated by hbm2java
 */
public class NewsLike implements java.io.Serializable {

    private NewsLikeId id;
    private News news;
    private User user;

    public NewsLike() {
    }

    public NewsLike(NewsLikeId id, News news, User user) {
        this.id = id;
        this.news = news;
        this.user = user;
    }

    public NewsLikeId getId() {
        return this.id;
    }

    public void setId(NewsLikeId id) {
        this.id = id;
    }

    public News getNews() {
        return this.news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
