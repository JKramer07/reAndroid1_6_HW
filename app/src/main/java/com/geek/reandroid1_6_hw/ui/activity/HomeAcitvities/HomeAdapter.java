package com.geek.reandroid1_6_hw.ui.activity.HomeAcitvities;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geek.reandroid1_6_hw.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private ArrayList<Home> homeList;

    public void setHomeList(ArrayList<Home> homeList) {
        this.homeList = new ArrayList<>();
        this.homeList.addAll(homeList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(homeList.get(position));
    }

    @Override
    public int getItemCount() {
        return homeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView name, comment, date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.homeIv);
            name = itemView.findViewById(R.id.homeUserNameTv);
            comment = itemView.findViewById(R.id.homeUserCommentTv);
            date = itemView.findViewById(R.id.homeDateTv);
        }

        public void onBind(Home home) {
            image.setImageResource(home.getImage());
            name.setText(home.getName());
            comment.setText(home.getComment());
            date.setText(home.getDate());
        }
    }
}
