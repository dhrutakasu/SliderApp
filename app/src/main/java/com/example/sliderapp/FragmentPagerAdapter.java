package com.example.sliderapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class FragmentPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {
    private final int[] intPictures;
    private final String[] stringPictures, descPictures;

    public FragmentPagerAdapter(@NonNull FragmentManager fm, int[] intPictures, String[] stringPictures, String[] descPictures) {
        super(fm);
        this.intPictures = intPictures;
        this.stringPictures = stringPictures;
        this.descPictures = descPictures;
    }

    @Override
    public int getCount() {
        return intPictures.length;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                MyFirstFragment firstFragment = new MyFirstFragment();
                Bundle data = new Bundle();
                data.putInt("Image", intPictures[position]);
                data.putString("Name", stringPictures[position]);
                data.putString("Description", descPictures[position]);
                firstFragment.setArguments(data);
                return firstFragment;
            case 1:
                MySecondFragment secondFragment = new MySecondFragment();
                Bundle sdata = new Bundle();
                sdata.putInt("Image", intPictures[position]);
                sdata.putString("Name", stringPictures[position]);
                sdata.putString("Description", descPictures[position]);
                secondFragment.setArguments(sdata);
                return secondFragment;
            case 2:
                MyThirdFragment thirdFragment = new MyThirdFragment();
                Bundle tdata = new Bundle();
                tdata.putInt("Image", intPictures[position]);
                tdata.putString("Name", stringPictures[position]);
                tdata.putString("Description", descPictures[position]);
                thirdFragment.setArguments(tdata);
                return thirdFragment;
            case 3:
                MyFourthFragment fourthFragment = new MyFourthFragment();
                Bundle fdata = new Bundle();
                fdata.putInt("Image", intPictures[position]);
                fdata.putString("Name", stringPictures[position]);
                fdata.putString("Description", descPictures[position]);
                fourthFragment.setArguments(fdata);
                return fourthFragment;
            default:
                return null;
        }
    }
}
