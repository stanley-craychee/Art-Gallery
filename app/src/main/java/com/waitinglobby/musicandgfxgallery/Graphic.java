package com.waitinglobby.musicandgfxgallery;

import androidx.annotation.DrawableRes;

public class Graphic {

    int image;
    String title;
    String description;

    public Graphic(@DrawableRes int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }
}
