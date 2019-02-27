package com.example.mockbankapp1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private String[] mTextData;

    public MyAdapter(String dataSet[]){
        mTextData = dataSet;
    }

    public void ReplaceData(String[] dataSet){
        mTextData = dataSet;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public MyViewHolder(@NonNull TextView v){
            super(v);
            textView = v;
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup p, int i){
        TextView v = (TextView) LayoutInflater.from(p.getContext())
                .inflate(android.R.layout.simple_list_item_1, p, false);

        MyViewHolder viewholder = new MyViewHolder(v);
        return  viewholder;
    }


    @Override
    public int getItemCount() {
        return mTextData.length;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int p){
        holder.textView.setText(mTextData[p]);
    }
}
