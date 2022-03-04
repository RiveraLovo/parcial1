package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Tabs1 extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tab1, tab2, tab3;
    PagerController PagerAdappter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs1);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        tab1 = findViewById(R.id.tbcontactos);
        tab2 = findViewById(R.id.tabcorreo);
        tab3 = findViewById(R.id.tabmensaje);
        PagerAdappter = new PagerController(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(PagerAdappter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());

                if (tab.getPosition() == 0) {
                    PagerAdappter.notifyDataSetChanged();
                }
                if (tab.getPosition() == 1) {
                    PagerAdappter.notifyDataSetChanged();
                }
                if (tab.getPosition() == 2) {
                    PagerAdappter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}