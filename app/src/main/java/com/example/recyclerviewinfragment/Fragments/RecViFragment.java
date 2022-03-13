package com.example.recyclerviewinfragment.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.recyclerviewinfragment.Adapters.RecAdapter;
import com.example.recyclerviewinfragment.Classes.User;
import com.example.recyclerviewinfragment.Interfaces.RecyclerViewEvent;
import com.example.recyclerviewinfragment.R;

import java.util.ArrayList;

public class RecViFragment extends Fragment implements RecyclerViewEvent {

    private RecyclerView rvList;
    private ArrayList<User> userList = new ArrayList<>();
    private RecyclerView.LayoutManager layoutManager;
    private RecAdapter myAdapter;

    public RecViFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rec_vi, container, false);

        rvList = view.findViewById(R.id.rvList);

        layoutManager = new LinearLayoutManager(getContext());

        myAdapter = new RecAdapter(this, userList);

        rvList.setLayoutManager(layoutManager);

        rvList.setAdapter(myAdapter);

        userList.add(new User("Yogesh", "r"));


        return view;
    }

    @Override
    public void setOnRecyclerViewItemClickListener(int position) {

        Toast.makeText(getContext(), "Name "+userList.get(position).getName(), Toast.LENGTH_SHORT).show();

    }
}