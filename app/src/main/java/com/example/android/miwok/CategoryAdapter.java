package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by BinaryWorld on 27-Sep-16.
 */


public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override


    public Fragment getItem(int position) {

       if(position==0)
           return new NumbersFragment();
        else if(position==1)
           return new FamilyFragment();
        else if(position==2)
           return new ColorsFragment();
        else if(position==3)
           return new PhrasesFragment();
        else
            return null;
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {

        if(position==0)
            return "Numbers";
        else if(position==1)
            return "Family";
        else if(position==2)
            return "Colors";
        else
            return "Phrases";
            }
}
