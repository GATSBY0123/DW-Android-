package com.gatsby.android_study;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gatsby.android_study.R;

public class Ex14IntentReceiveActivity extends AppCompatActivity {

    TextView tvName2, tvAge2, tvContact2, tvAddress2;
    String dataName, dataAge,dataContact,dataAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex14_intent_receive_layout);

        tvName2 = (TextView) findViewById(R.id.tvName2);
        tvAge2 = (TextView) findViewById(R.id.tvAge2);
        tvContact2 = (TextView) findViewById(R.id.tvContact2);
        tvAddress2 = (TextView) findViewById(R.id.tvAddress2);

        Intent getIntent = getIntent();
        dataName= getIntent.getStringExtra("dataName");
        dataAge= getIntent.getStringExtra("dataAge");
        dataContact= getIntent.getStringExtra("dataContact");
        dataAddress= getIntent.getStringExtra("dataAddress");

        tvName2.setText(dataName);
        tvAge2.setText(dataAge+"세");
        tvContact2.setText(dataContact);
        tvAddress2.setText(dataAddress);
    }
}