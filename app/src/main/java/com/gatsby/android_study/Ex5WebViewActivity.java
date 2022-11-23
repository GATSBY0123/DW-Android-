package com.gatsby.android_study;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gatsby.android_study.R;

public class Ex5WebViewActivity extends AppCompatActivity {

    TextView tvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex5_webview_ladyout);

        tvMsg = (TextView)findViewById(R.id.tvMsg);

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
                    tvMsg.setText("op.gg 접속!");
                    Intent act1 = new Intent(Ex5WebViewActivity.this, Ex5WebViewOPGG.class);
                    startActivity(act1);
                    break;
                case R.id.btn2:
                    tvMsg.setText("fow.kr 접속!");
                    Intent act2 = new Intent(Ex5WebViewActivity.this,Ex5WebViewFowKr.class);
                    startActivity(act2);
                    break;
                case R.id.btn3:
                    tvMsg.setText("lol.ps 접속!");
                    Intent act3 = new Intent(Ex5WebViewActivity.this,Ex5WebViewLolPs.class);
                    startActivity(act3);
                    break;

            }

        }
    };
}