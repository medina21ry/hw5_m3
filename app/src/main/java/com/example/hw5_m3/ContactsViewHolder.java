package com.example.hw5_m3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ContactsViewHolder extends RecyclerView.ViewHolder{
    private ImageView avatar;
    private TextView name;

    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.img_avatar);
        name = itemView.findViewById(R.id.tv_name);
    }
    protected void bind (Contacts contacts) {
        name.setText(contacts.getName());
        Glide.with(itemView.getContext())
                .load(contacts.getAvatar())
                .circleCrop()
                .into(avatar);
    }
}
