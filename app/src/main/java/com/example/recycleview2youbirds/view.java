package com.example.recycleview2youbirds;

import android.widget.ImageView;

public class view {
    private int imageView;
    private String text;

    public view(int imageView, String text) {
        this.imageView = imageView;
        this.text = text;
    }

    public int getImageView() {
        return imageView;
    }

    public String getText() {
        return text;
    }
}
