package com.example.subway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MenupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuf);
    }
}

//
//
//package com.example.subway;
//
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentStatePagerAdapter;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;

//public class MenupActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_menup);
//    }
//}
//
//
//public class TabPagerAdapter extends FragmentStatePagerAdapter {
//
//    // Count number of tabs
//    private int tabCount;
//
//    public TabPagerAdapter(FragmentManager fm, int tabCount) {
//        super(fm);
//        this.tabCount = tabCount;
//    }
//
//    @Override
//    public Fragment getItem(int position) {
//
//        // Returning the current tabs
//        switch (position) {
//            case 0:
//                MenucActivity tabFragment1 = new MenucActivity();
//                return tabFragment1;
//            case 1:
//                MenufActivity tabFragment2 = new MenufActivity();
//                return tabFragment2;
//            case 2:
//                MenupActivity tabFragment3 = new MenupActivity();
//                return tabFragment3;
//            default:
//                return null;
//        }
//    }
//    @Override
//    public int getCount() {
//        return tabCount;
//    }
//}
//
//
//
//
//    public class MenupActivity extends AppCompatActivity {
//
//        private TabLayout tabLayout;
//        private ViewPager viewPager;
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//
//            // Adding Toolbar to the activity
//            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//            setSupportActionBar(toolbar);
//
//            // Initializing the TabLayout
//            tabLayout = (TabLayout) findViewById(R.id.tabLayout);
//            tabLayout.addTab(tabLayout.newTab().setText("Tab One"));
//            tabLayout.addTab(tabLayout.newTab().setText("Tab Two"));
//            tabLayout.addTab(tabLayout.newTab().setText("Tab Three"));
//            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//
//            // Initializing ViewPager
//            viewPager = (ViewPager) findViewById(R.id.pager);
//
//            // Creating TabPagerAdapter adapter
//            TabPagerAdapter pagerAdapter = new TabPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
//            viewPager.setAdapter(pagerAdapter);
//            viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//
//            // Set TabSelectedListener
//            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//
//                @Override
//                public void onTabSelected(TabLayout.Tab tab) {
//                    viewPager.setCurrentItem(tab.getPosition());
//                }
//
//                @Override
//                public void onTabUnselected(TabLayout.Tab tab) {
//
//                }
//
//                @Override
//                public void onTabReselected(TabLayout.Tab tab) {
//
//                }
//            });
//
//        }
//    }
//
//
//    @Override
//    public int getCount() {
//        return tabCount;
//    }
//}
//
