package com.example.esperanto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<word> words;
    public Adapter(ArrayList<word> words) {
        this.words = words;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.first_word, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        word wordi = words.get(position);
        holder.name.setText(wordi.getES());
        holder.description.setText(wordi.getRU());
    }

    @Override
    public int getItemCount() {
        return words.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView name;
        public final TextView description;

        public ViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.textViewRu);
            description = view.findViewById(R.id.textViewES);
        }
    }

  
}


