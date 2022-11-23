package com.gatsby.android_study;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.gatsby.android_study.R;

public class Ex19GpsActivity extends AppCompatActivity {

    EditText etKeyword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex19_gps_layout);

        etKeyword = (EditText)findViewById(R.id.etKeyword);
        findViewById(R.id.btnStart).setOnClickListener(mClick);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btnStart:

                    String keyword = etKeyword.getText().toString();
                    Intent intent = new Intent (Ex19GpsActivity.this, GoogleMapSearchActivity.class);
                    intent.putExtra("keyword",keyword);
                    startActivity(intent);
                    break;
            }
        }
    };
}