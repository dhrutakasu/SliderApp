package com.example.sliderapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyFirstFragment extends Fragment {

    private String mParam1;
    private String mParam2;
    private int mParam0;
    private ImageView ImageFirst;
    private TextView TextFirst;
    private ConstraintLayout ConsClick;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam0 = getArguments().getInt("Image");
            mParam1 = getArguments().getString("Name");
            mParam2 = getArguments().getString("Description");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_first, container, false);
        ImageFirst = (ImageView) view.findViewById(R.id.ImageFirst);
        TextFirst = (TextView) view.findViewById(R.id.TextFirst);
        ImageFirst.setImageResource(mParam0);
        TextFirst.setText(mParam1); ConsClick = view.findViewById(R.id.ConsClick);
        ConsClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ViewImageDescription.class)
                        .putExtra("Image", mParam0).putExtra("Name", mParam1)
                        .putExtra("Description", mParam2));
            }
        });
        return view;
    }
}