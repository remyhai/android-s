package com.remy.recycleview2.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.remy.recycleview2.R;
import com.remy.recycleview2.storage.NoteStorage;
import com.remy.recycleview2.view.MyViewHolder;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private NoteStorage noteStorage;

    public MyAdapter(NoteStorage noteStorage) {
        this.noteStorage = noteStorage;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout ll = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.mylayout, parent, false);

        return new MyViewHolder(ll);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.setData(noteStorage.list.get(position));
    }

    @Override
    public int getItemCount() {
        return noteStorage.list.size();
    }
}
