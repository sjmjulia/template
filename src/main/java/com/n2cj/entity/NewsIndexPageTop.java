package com.n2cj.entity;

// Generated 2015-9-6 10:20:22 by Hibernate Tools 4.3.1

/**
 * NewsIndexPageTop generated by hbm2java
 */
public class NewsIndexPageTop implements java.io.Serializable {

    private NewsIndexPageTopId id;
    private News news;
    private NewsIndexPage newsIndexPage;

    public NewsIndexPageTop() {
    }

    public NewsIndexPageTop(NewsIndexPageTopId id, News news,
                            NewsIndexPage newsIndexPage) {
        this.id = id;
        this.news = news;
        this.newsIndexPage = newsIndexPage;
    }

    public NewsIndexPageTopId getId() {
        return this.id;
    }

    public void setId(NewsIndexPageTopId id) {
        this.id = id;
    }

    public News getNews() {
        return this.news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public NewsIndexPage getNewsIndexPage() {
        return this.newsIndexPage;
    }

    public void setNewsIndexPage(NewsIndexPage newsIndexPage) {
        this.newsIndexPage = newsIndexPage;
    }

}
