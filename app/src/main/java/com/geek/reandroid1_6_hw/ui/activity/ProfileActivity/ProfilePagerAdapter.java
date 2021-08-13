package com.geek.reandroid1_6_hw.ui.activity.ProfileActivity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.geek.reandroid1_6_hw.ui.fragments.ProfileFragment.FirstFragment;
import com.geek.reandroid1_6_hw.ui.fragments.ProfileFragment.SecondFragment;

public class ProfilePagerAdapter extends FragmentStateAdapter {

    public ProfilePagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
        }
        return new FirstFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
