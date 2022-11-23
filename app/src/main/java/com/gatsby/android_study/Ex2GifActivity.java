package com.gatsby.android_study;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.gatsby.android_study.R;

public class Ex2GifActivity extends AppCompatActivity {

    ImageView ivTest;
    ImageView ivTest2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex2_gif_layout);

        ivTest = (ImageView)findViewById(R.id.imageView);
        ivTest2 = (ImageView)findViewById(R.id.imageView2);

        Glide.with(Ex2GifActivity.this).load(R.drawable.son_skill1).into(ivTest);
        Glide.with(Ex2GifActivity.this).load(R.drawable.son_skill2).into(ivTest2);
    }
}