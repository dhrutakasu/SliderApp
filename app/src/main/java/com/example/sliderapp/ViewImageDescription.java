package com.example.sliderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewImageDescription extends AppCompatActivity {

    private TextView TextAnimal, TextAnimalDesc, TextGoBack;
    private ImageView ImageAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image_description);
        findview();

    }

    private void findview() {
        TextAnimal = findViewById(R.id.TextAnimal);
        ImageAnimal = findViewById(R.id.ImageAnimal);
        TextAnimalDesc = findViewById(R.id.TextAnimalDesc);
        TextGoBack = findViewById(R.id.TextGoBack);

        TextAnimal.setText(getIntent().getStringExtra("Name"));
        ImageAnimal.setImageResource(getIntent().getIntExtra("Image", 0));
        TextAnimalDesc.setText(getIntent().getStringExtra("Description"));
        TextGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}