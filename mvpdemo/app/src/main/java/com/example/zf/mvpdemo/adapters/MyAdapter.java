package com.example.zf.mvpdemo.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zf.mvpdemo.R;
import com.example.zf.mvpdemo.beans.Bookbean;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    private List<Bookbean> bookbeans;

    public MyAdapter(List<Bookbean> bookbeans) {
        this.bookbeans = bookbeans;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item, null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.tvName.setText(bookbeans.get(position).getName());
        holder.tvNum.setText(bookbeans.get(position).getNo()+"");
        holder.tvTime.setText(bookbeans.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return bookbeans == null ? 0 : bookbeans.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        private TextView tvName,tvNum,tvTime;
        public MyHolder(View itemView) {
            super(itemView);
            this.tvName=itemView.findViewById(R.id.tv_name);
            this.tvNum=itemView.findViewById(R.id.tv_num);
            this.tvTime=itemView.findViewById(R.id.tv_time);
        }
    }

}
