package com.waitinglobby.musicandgfxgallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        setupList();
    }

    private void setupList() {
        Song[] songList = {
                new Song("Integrate (Prod. Waitinglobby x G20k x P40)", 151, "E minor", R.drawable.general_button_background_image),
                new Song("Qualify (Prod. Waitinglobby x Silence)", 140, null, R.drawable.general_button_background_image),
                new Song("INH (Prod. Waitinglobby x Armaan)", 130, "Ab minor", R.drawable.general_button_background_image),
                new Song("Striker (Prod. Waitinglobby x 44Nyx x 1JQQCK)", 160, null, R.drawable.general_button_background_image),
                new Song("Vain (Prod. Waitinglobby Armaan)", 140, "C minor", R.drawable.general_button_background_image),
                new Song("Zero (Prod. Waitinglobby x Towers)", 140, null, R.drawable.general_button_background_image),
                new Song("Untitled (Prod. Waitinglobby x G20k x Yetii)", 155, "D major", R.drawable.general_button_background_image),
                new Song("Stamp (Prod. Waitinglobby x Promise)", 143, "E minor", R.drawable.general_button_background_image),
                new Song("Moonflower (Prod. Waitinglobby x Promise)", 136, "E minor", R.drawable.general_button_background_image),
                new Song("Amaterasu (Prod. Waitinglobby x G20k)", 140, "A minor", R.drawable.general_button_background_image)
        };

        RecyclerView musicView = findViewById(R.id.recycler_view_music);
        SongsAdapter adapter = new SongsAdapter(songList);
        musicView.setAdapter(adapter);
    }
}