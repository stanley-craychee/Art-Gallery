package com.waitinglobby.musicandgfxgallery;

import androidx.annotation.DrawableRes;

public class Song {

    String songTitle;
    int bpm;
    String key;
    int image;

    public Song(String songTitle, int bpm, String key, @DrawableRes int image) {
        this.songTitle = songTitle;
        this.image=image;
        this.bpm = bpm;
        if (key == null) {
            this.key = "Unknown";
        } else{
            this.key = key;
        };
    }
}
