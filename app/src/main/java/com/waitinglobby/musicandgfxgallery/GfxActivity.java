package com.waitinglobby.musicandgfxgallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class GfxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gfx);
        setupList();
    }

    private void setupList() {
        Graphic[] graphicsList = {
                new Graphic(R.drawable.gfx_button_background_image, "Doorway", "Inspired by dark lettering and featuring a crimson red background with high contrast colors."),
                new Graphic(R.drawable.img_1775, "Levels", "Stairway with mosaic patterning - warped and with airy colors."),
                new Graphic(R.drawable.img_8507red, "Bursting", "Flower of life pattern featuring 3D visual styling."),
                new Graphic(R.drawable.photothreecyaninve6357rt, "Dissolving", "Dark red abstract object fading into liquid textures."),
                new Graphic(R.drawable.gfx5, "Plated", "High contract \"falling\" object with lettering on the surface.")
        };

        RecyclerView gfxView = findViewById(R.id.recycler_view_graphic);
        GraphicsAdapter gfxAdapter = new GraphicsAdapter(graphicsList);
        gfxView.setAdapter(gfxAdapter);
    }
}