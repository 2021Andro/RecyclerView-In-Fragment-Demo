package com.example.recyclerviewinfragment.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewinfragment.Classes.User;
import com.example.recyclerviewinfragment.Fragments.RecViFragment;
import com.example.recyclerviewinfragment.Interfaces.RecyclerViewEvent;
import com.example.recyclerviewinfragment.R;

import java.util.ArrayList;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.MyViewHolder> {

    private ArrayList<User> userList;
    private RecyclerViewEvent recyclerViewEvent;

    public RecAdapter(RecViFragment context, ArrayList<User> userList) {

        this.userList = userList;
        this.recyclerViewEvent = (RecyclerViewEvent) context;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_adapter_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        User user = userList.get(position);

        holder.itemView.setTag(userList.get(position));

        holder.tvName.setText(user.getName());

        holder.ivProfile.setImageResource(R.drawable.ic_launcher_background);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView ivProfile;
        private TextView tvName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ivProfile = itemView.findViewById(R.id.imageProfile);
            tvName = itemView.findViewById(R.id.tvName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recyclerViewEvent.setOnRecyclerViewItemClickListener( userList.indexOf( (User) itemView.getTag() ) );
                }
            });

        }

    }


}
