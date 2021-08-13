package com.geek.reandroid1_6_hw.ui.activity.HomeAcitvities;

public class Home {

    private int image;
    private String name, comment, date;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Home(int image, String name, String comment, String date) {
        this.image = image;
        this.name = name;
        this.comment = comment;
        this.date = date;
    }
}
