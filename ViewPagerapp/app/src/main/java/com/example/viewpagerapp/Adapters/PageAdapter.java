package com.example.viewpagerapp.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.viewpagerapp.Fragment.NewsPageFragment;
import com.example.viewpagerapp.Fragment.ParamPageFragment;
import com.example.viewpagerapp.Fragment.ProfilePageFragment;

/**
 * Created by Kevin  - Openclassrooms on 15/10/2019
 */
public class PageAdapter extends FragmentPagerAdapter {

    // 2 - Default Constructor
    public PageAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public int getCount() {
        return(3); // 3 - Number of page to show
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: //Page number 1
                return "Fil d'actualité";
            case 1: //Page number 2
                return "Profil";
            case 2: //Page number 3
                return "Paramètre";
            default:
                return null;
        }
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: //Page number 1
                return NewsPageFragment.newInstance();
            case 1: //Page number 2
                return ProfilePageFragment.newInstance();
            case 2: //Page number 3
                return ParamPageFragment.newInstance();
            default:
                return null;
        }
    }


}
