package com.example.viewpagerapp.controllers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.example.viewpagerapp.Adapters.PageAdapter;
import com.example.viewpagerapp.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //3 - Configure ViewPager
      this.configureViewPagerAndTabs();


    }



    private void configureViewPagerAndTabs(){

        ViewPager pager = (ViewPager) findViewById(R.id.activity_main_ViewPager);

        // 2 - Set Adapter PageAdapter and glue it together
        pager.setAdapter(new PageAdapter(getSupportFragmentManager()){
        });

        // 1 - Get TabLayout from layout
        TabLayout tabs= (TabLayout)findViewById(R.id.activity_main_tabs);

        // 2 - Glue TabLayout and ViewPager together
        tabs.setupWithViewPager(pager);

        // 3 - Design purpose. Tabs have the same width
        tabs.setTabMode(TabLayout.MODE_FIXED);


    }
}