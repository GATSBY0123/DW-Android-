package com.gatsby.android_study;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.gatsby.android_study.R;

public class Ex14IntentSendActivity extends AppCompatActivity {

    EditText etName, etAge, etContact, etAddress;
    String dataName, dataAge, dataContact, dataAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex14_intent_send_layout);

        //초기값을 셋팅
        dataName="noName";
        dataAge="0";
        dataContact="noTel";
        dataAddress="noAddr";

        etName = (EditText) findViewById(R.id.etName);
        etAge = (EditText) findViewById(R.id.etAge);
        etContact = (EditText) findViewById(R.id.etContact);
        etAddress = (EditText) findViewById(R.id.etAddress);

        findViewById(R.id.btn).setOnClickListener(mClick);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btn:

                    //입력한 값이 공백이 아닐경우에 가져옴....
                    if(!etName.getText().toString().equals(""))
                    { dataName = etName.getText().toString();}
                    if(!etAge.getText().toString().equals(""))
                    { dataAge = etAge.getText().toString();}
                    if(!etContact.getText().toString().equals(""))
                    { dataContact = etContact.getText().toString();}
                    if(!etAddress.getText().toString().equals(""))
                    { dataAddress = etAddress.getText().toString();}

                    Intent ex14 = new Intent(Ex14IntentSendActivity.this, Ex14IntentReceiveActivity.class);
                    ex14.putExtra("dataName",dataName);
                    ex14.putExtra("dataAge",dataAge);
                    ex14.putExtra("dataContact",dataContact);
                    ex14.putExtra("dataAddress",dataAddress);
                    startActivity(ex14);
                    break;
            }

        }
    };
}