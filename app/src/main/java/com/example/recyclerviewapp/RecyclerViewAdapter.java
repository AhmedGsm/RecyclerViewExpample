package com.example.recyclerviewapp;

import android.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private String[] mDataset;

    public RecyclerViewAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout linearLayout = (LinearLayout )LayoutInflater.from(parent.getContext()).
                inflate(R.layout.list_item,parent,false);
        return new CustomViewHolder(linearLayout);
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout mLinearLayout;
        public CustomViewHolder(LinearLayout linearLayout) {
            super(linearLayout);
            mLinearLayout = linearLayout;
        }

    }
}
