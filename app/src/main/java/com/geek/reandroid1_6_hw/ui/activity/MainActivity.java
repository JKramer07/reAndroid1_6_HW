package com.geek.reandroid1_6_hw.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.geek.reandroid1_6_hw.R;
import com.geek.reandroid1_6_hw.ui.fragments.FollowFragment.FollowFragment;
import com.geek.reandroid1_6_hw.ui.fragments.HomeFragment.HomeFragment;
import com.geek.reandroid1_6_hw.ui.fragments.ProfileFragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView botNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragments();
    }

    private void initFragments() {
        botNav = findViewById(R.id.botNAv);
        getSupportFragmentManager().beginTransaction().replace(R.id.mainCont, new HomeFragment()).commit();
        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainCont, new HomeFragment()).commit();
                        break;
                    case R.id.following:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainCont, new FollowFragment()).commit();
                        break;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainCont, new ProfileFragment()).commit();
                        break;
                }
                return true;
            }
        });
    }
}