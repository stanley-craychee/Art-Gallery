package com.waitinglobby.musicandgfxgallery;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GraphicsAdapter extends RecyclerView.Adapter<GraphicsAdapter.GraphicsViewHolder> {

    private Graphic[] graphics;

    public GraphicsAdapter(Graphic[] graphics) {
        this.graphics = graphics;
    }

    @Override
    public int getItemCount() {
        return graphics.length;
    }

    @NonNull
    @Override
    public GraphicsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_graphic, parent, false);
        return new GraphicsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GraphicsViewHolder holder, int position) {
        holder.bind(graphics[position]);
    }


    static class GraphicsViewHolder extends RecyclerView.ViewHolder {

        private ImageView graphicImage;
        private TextView graphicTitle;
        private TextView graphicDescription;

        public GraphicsViewHolder(@NonNull View itemView) {
            super(itemView);
            graphicImage = itemView.findViewById(R.id.image_view_graphic_icon);
            graphicTitle = itemView.findViewById(R.id.text_view_graphic_title);
            graphicDescription = itemView.findViewById(R.id.text_view_graphic_description);
        }

        public void bind(Graphic graphic) {
            graphicImage.setImageResource(graphic.image);
            graphicTitle.setText(graphic.title);
            graphicDescription.setText(graphic.description);
        }

    }

}

