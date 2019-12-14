package com.example.recyclerviewapp;

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

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //Display results in textView 1
        TextView textView1 = holder.itemView.findViewById(R.id.textView1);
        textView1.setText(mDataset[position]);

        //Display results in textView 2
        TextView textView2 = holder.itemView.findViewById(R.id.textView2);
        textView2.setText(Integer.toString(position + 1));

        //Display dummy image
        LinearLayout linearLayoutParent = (LinearLayout)holder.itemView;
        ImageView dummyImageView = (ImageView)linearLayoutParent.getChildAt(0);
        dummyImageView.setImageResource(R.drawable.baseline_card_giftcard_black_48dp);

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {

        public CustomViewHolder(LinearLayout linearLayout) {
            super(linearLayout);
        }
    }

}
