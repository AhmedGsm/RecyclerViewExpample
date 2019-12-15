package com.example.recyclerviewapp;

import android.widget.LinearLayout;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private String[] mDataset;

    public RecyclerViewAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout mLinearLayout;
        public CustomViewHolder(LinearLayout linearLayout) {
            super(linearLayout);
            mLinearLayout = linearLayout;
        }

    }
}
