package com.gatsby.android_study;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.gatsby.android_study.R;

public class Ex4MediaActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex4_meadia_layout);

        player = MediaPlayer.create(Ex4MediaActivity.this, R.raw.yoonha);


        findViewById(R.id.btn1).setOnClickListener(mClick);
        findViewById(R.id.btn2).setOnClickListener(mClick);
        findViewById(R.id.btn3).setOnClickListener(mClick);

    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btn1:
                    player.start();
                    break;
                case R.id.btn2:
                    player.pause();
                    break;
                case R.id.btn3:
                    player.stop();
                    break;

            }

        }
    };
}