package com.geek.reandroid1_6_hw.ui.fragments.ProfileFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geek.reandroid1_6_hw.R;
import com.geek.reandroid1_6_hw.ui.activity.ProfileActivity.ProfilePagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class ProfileFragment extends Fragment {

    private ViewPager2 pager;
    private TabLayout tabs;
    private ProfilePagerAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragView = inflater.inflate(R.layout.fragment_profile, container, false);
        return fragView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initPager(view);
    }

    private void initPager(View view) {
        pager = view.findViewById(R.id.viewPager);
        tabs = view.findViewById(R.id.tabs);
        adapter = new ProfilePagerAdapter(getFragmentManager(), getLifecycle());
        pager.setAdapter(adapter);

        tabs.addTab(tabs.newTab().setIcon(R.drawable.ic_baseline_grid_on_24));
        tabs.addTab(tabs.newTab().setIcon(R.drawable.ic_baseline_account_box_24));

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabs.selectTab(tabs.getTabAt(position));
            }
        });
    }

}