package com.geek.reandroid1_6_hw.ui.activity;

public class Model {

    private int image, image2;
    private String text;

    public Model(int image, int image2, String text) {
        this.image = image;
        this.image2 = image2;
        this.text = text;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Model(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
