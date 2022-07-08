package com.waitinglobby.musicandgfxgallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClickListeners();
    }

    private void setupClickListeners() {
        CardView musicCard = findViewById(R.id.card_view_music);
        CardView gfxCard = findViewById(R.id.card_view_gfx);

        musicCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicActivityIntent = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(musicActivityIntent);
            }
        });

        gfxCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gfxActivityIntent = new Intent(MainActivity.this, GfxActivity.class);
                startActivity(gfxActivityIntent);
            }
        });
    }
}