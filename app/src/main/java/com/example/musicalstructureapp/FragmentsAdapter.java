package com.example.musicalstructureapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class FragmentsAdapter extends FragmentPagerAdapter {


    private Context mContext;

    public FragmentsAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AlbumsFragment();
        } else if (position == 1) {
            return new ArtistsFragment();
        }  else {
            return new AllSongsFragment();
        }
    }


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.albums);
        } else if (position == 1) {
            return mContext.getString(R.string.artists);
        }  else {
            return mContext.getString(R.string.all_songs);
        }
    }
}