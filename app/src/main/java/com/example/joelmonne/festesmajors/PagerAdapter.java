package com.example.joelmonne.festesmajors;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.Locale;

/**
 * Created by Joel Monné on 09/03/2016.
 */

public class PagerAdapter  extends FragmentStatePagerAdapter{
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag=null;
        switch (position){
            case 0:
                frag = new SearchConditionsFragment();
                break;
            case 1:
                frag = new MapFragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "Cerca";
            case 1:
                return "Mapa";
        }
        return null;
    }
}
