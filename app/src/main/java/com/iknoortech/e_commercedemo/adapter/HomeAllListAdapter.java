package com.iknoortech.e_commercedemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iknoortech.e_commercedemo.R;
import com.iknoortech.e_commercedemo.model.HomeAllListPojo;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeAllListAdapter extends RecyclerView.Adapter<HomeAllListAdapter.ViewHolder> {

    private Context context;
    private ArrayList<HomeAllListPojo> arrayList;

    public HomeAllListAdapter(Context context, ArrayList<HomeAllListPojo> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_main_all_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private RecyclerView recyclerView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textView23);
            recyclerView = itemView.findViewById(R.id.recyclerView2);
        }
    }
}
