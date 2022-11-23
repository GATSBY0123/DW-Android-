package com.gatsby.android_study;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gatsby.android_study.R;

public class Ex9ImageViewActivity extends AppCompatActivity {

    ImageView imageView,imageView2,imageView3,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex9_imageview_layout);


        imageView = findViewById(R.id.iv1);
        imageView2 = findViewById(R.id.iv2);
        imageView3 = findViewById(R.id.iv3);
        findViewById(R.id.iv1).setOnClickListener(mClick);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.iv1:
                    imageView.setImageResource(R.drawable.image112);
                    Toast.makeText(Ex9ImageViewActivity.this,"아래이미지 복사변경!",Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}