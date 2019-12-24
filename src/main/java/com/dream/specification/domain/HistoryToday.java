package com.dream.specification.domain;

import org.springframework.stereotype.Component;

@Component
public class HistoryToday {
    private String eid;
    private String title;
    private String imgUrl;
    private String date;
    private String day;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getimgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "HistoryToday{" +
                "eid='" + eid + '\'' +
                ", title='" + title + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", date='" + date + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
