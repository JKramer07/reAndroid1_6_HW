package com.geek.reandroid1_6_hw.ui.fragments.HomeFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geek.reandroid1_6_hw.R;
import com.geek.reandroid1_6_hw.ui.activity.HomeAcitvities.Home;
import com.geek.reandroid1_6_hw.ui.activity.HomeAcitvities.HomeAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView rv;
    private HomeAdapter adapter;
    private ArrayList<Home> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }

    private void initRecycler(View view) {
        rv = view.findViewById(R.id.homeRv);
        adapter = new HomeAdapter();
        rv.setAdapter(adapter);
        adapter.setHomeList(list);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new Home(R.drawable.rectangle, "joshua_I", "Beautiful place!!!", "August 4"));
        list.add(new Home(R.drawable.street, "joshua_I", "Beautiful place!!!", "August 4"));
        list.add(new Home(R.drawable.versace, "joshua_I", "Beautiful place!!!", "August 4"));
        list.add(new Home(R.drawable.building, "joshua_I", "Beautiful place!!!", "August 4"));
        list.add(new Home(R.drawable.italy_port, "joshua_I", "Beautiful place!!!", "August 4"));
    }
}