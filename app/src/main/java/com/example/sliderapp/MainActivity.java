package com.example.sliderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ViewPager PagerAnimal;
    private int[] intPictures;
    private String[] stringPictures;
    private String[] DescPictures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PagerAnimal = (ViewPager) findViewById(R.id.PagerAnimal);
        intPictures = new int[]{R.drawable.img_1, R.drawable.img_2, R.drawable.img_3, R.drawable.img_4};
        stringPictures = new String[]{getResources().getString(R.string.capybara), getResources().getString(R.string.jackal), getResources().getString(R.string.procupine), getResources().getString(R.string.otter)};
        DescPictures = new String[]{getResources().getString(R.string.capybara_desc), getResources().getString(R.string.jackal_desc), getResources().getString(R.string.procupine_desc), getResources().getString(R.string.otter_desc)};
        FragmentManager fm = getSupportFragmentManager();
        FragmentPagerAdapter pagerAdapter = new FragmentPagerAdapter(fm, intPictures, stringPictures, DescPictures);
        PagerAnimal.setAdapter(pagerAdapter);
    }
}