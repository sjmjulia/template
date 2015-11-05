package com.n2cj.entity;

// Generated 2015-9-6 10:20:22 by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Analyser generated by hbm2java
 */
public class Analyser implements java.io.Serializable {

    private Integer analyserId;
    private User user;
    private String analyserDesc;
    private String analyserImage;
    private String status;
    private Date addtime;
    private Date updatetime;

    public Analyser() {
    }

    public Analyser(User user, String status, Date addtime, Date updatetime) {
        this.user = user;
        this.status = status;
        this.addtime = addtime;
        this.updatetime = updatetime;
    }

    public Analyser(User user, String analyserDesc, String analyserImage,
                    String status, Date addtime, Date updatetime) {
        this.user = user;
        this.analyserDesc = analyserDesc;
        this.analyserImage = analyserImage;
        this.status = status;
        this.addtime = addtime;
        this.updatetime = updatetime;
    }

    public Integer getAnalyserId() {
        return this.analyserId;
    }

    public void setAnalyserId(Integer analyserId) {
        this.analyserId = analyserId;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAnalyserDesc() {
        return this.analyserDesc;
    }

    public void setAnalyserDesc(String analyserDesc) {
        this.analyserDesc = analyserDesc;
    }

    public String getAnalyserImage() {
        return this.analyserImage;
    }

    public void setAnalyserImage(String analyserImage) {
        this.analyserImage = analyserImage;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAddtime() {
        return this.addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getUpdatetime() {
        return this.updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

}