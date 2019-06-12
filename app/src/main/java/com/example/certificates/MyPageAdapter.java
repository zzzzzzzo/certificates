package com.example.certificates;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.certificates.FirstFragment;
import com.example.certificates.SecondFragment;
import com.example.certificates.ThirdFragment;

public class MyPageAdapter extends FragmentPagerAdapter {

    //private String[] title = new String[]{"First","Second","Third"};

    public MyPageAdapter(FragmentManager manager){

        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new FirstFragment();
        }else if(position==1){
            return new SecondFragment();
        }else if(position==2){
            return new ThirdFragment();
        }else {
            return new FourthFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //return title[position];
        if(position==0){
            return "题库";
        }else if(position==1){
            return "视频";
        }else if(position==2){
            return "信息";
        }else{
            return "我的";
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}

