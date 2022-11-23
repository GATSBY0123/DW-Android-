package com.gatsby.android_study;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gatsby.android_study.R;

public class Ex13SwitchActivity extends AppCompatActivity {

    Switch switch1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex13_switch_layout);

        tv1 = findViewById(R.id.tv1);
        switch1 = findViewById(R.id.switch1);

        switch1.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    tv1.setText("ON");
                } else {
                    tv1.setText("OFF");
                }
            }
        });
    }
}