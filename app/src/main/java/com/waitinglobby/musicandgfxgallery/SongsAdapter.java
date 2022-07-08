package com.waitinglobby.musicandgfxgallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.SongViewHolder> {

    private Song[] songs;

    public SongsAdapter(Song[] songs) {
        this.songs = songs;
    }

    @Override
    public int getItemCount() {
        return songs.length;
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        holder.bind(songs[position]);
    }


    static class SongViewHolder extends RecyclerView.ViewHolder {

        private ImageView songImage;
        private TextView songTitle;
        private TextView songKey;
        private TextView songBPM;

        public SongViewHolder(@NonNull View itemView) {
            super(itemView);
            songImage = itemView.findViewById(R.id.image_view_music_icon);
            songTitle = itemView.findViewById(R.id.text_view_song_title);
            songKey = itemView.findViewById(R.id.text_view_song_key);
            songBPM = itemView.findViewById(R.id.text_view_song_bpm);
        }

        public void bind(Song song) {
            songTitle.setText(song.songTitle);
            songKey.setText("|    Key: " + song.key);
            songBPM.setText(song.bpm + "BPM");
            songImage.setImageResource(song.image);
        }

    }

}
