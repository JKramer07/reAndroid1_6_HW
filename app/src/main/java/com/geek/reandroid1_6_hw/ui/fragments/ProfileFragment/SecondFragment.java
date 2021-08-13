package com.geek.reandroid1_6_hw.ui.fragments.ProfileFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geek.reandroid1_6_hw.R;
import com.geek.reandroid1_6_hw.ui.activity.Model;
import com.geek.reandroid1_6_hw.ui.activity.ProfileActivity.Second.SecondAdapter;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private RecyclerView rv;
    private SecondAdapter adapter;
    private ArrayList<Model> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }

    private void initRecycler(View view) {
        rv = view.findViewById(R.id.profileSecondRv);
        adapter = new SecondAdapter();
        rv.setAdapter(adapter);
        adapter.setList(list);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new Model(R.drawable.italy_port));
        list.add(new Model(R.drawable.building));
        list.add(new Model(R.drawable.rectangle));
        list.add(new Model(R.drawable.street));
        list.add(new Model(R.drawable.italy_port));
        list.add(new Model(R.drawable.versace));
        list.add(new Model(R.drawable.italy_port));
    }
}