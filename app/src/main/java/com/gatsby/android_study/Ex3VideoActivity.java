package com.gatsby.android_study;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.gatsby.android_study.R;

public class Ex3VideoActivity extends AppCompatActivity {

   VideoView vv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex3_video_layout);

        vv = (VideoView)findViewById(R.id.videoView2);

        findViewById(R.id.btn1).setOnClickListener(mClick);
        findViewById(R.id.btn2).setOnClickListener(mClick);
        findViewById(R.id.btn3).setOnClickListener(mClick);
        Uri videoUri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.yoonhavideo);
        vv.setMediaController(new MediaController(this));
        vv.setVideoURI(videoUri);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btn1:
                    vv.start();
                    break;
                case R.id.btn2:
                    vv.pause();
                    break;
                case R.id.btn3:
                    vv.stopPlayback();
                    break;

            }

        }
    };
}