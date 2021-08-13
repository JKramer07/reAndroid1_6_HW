package com.geek.reandroid1_6_hw.ui.activity.FollowActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geek.reandroid1_6_hw.R;
import com.geek.reandroid1_6_hw.ui.activity.Model;

import java.util.ArrayList;

public class FollowAdapter extends RecyclerView.Adapter<FollowAdapter.ViewHolder> {

    private ArrayList<Model> list = new ArrayList<>();

    public void setList(ArrayList<Model> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_follow_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView userImage, likedImage;
        private TextView likedText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userImage = itemView.findViewById(R.id.followAvatarIv);
            likedImage = itemView.findViewById(R.id.followLikedPhotoIv);
            likedText = itemView.findViewById(R.id.followLikedTv);
        }



        public void onBind(Model model) {
            userImage.setImageResource(model.getImage());
            likedImage.setImageResource(model.getImage2());
            likedText.setText(model.getText());
        }
    }
}
