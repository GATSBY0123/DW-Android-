package com.gatsby.android_study;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gatsby.android_study.R;

public class Ex10PhoneBookActivity extends AppCompatActivity {

    TextView tvName1,tvName2,tvName3,tvName4,tvName5,tvName6,tvName7,tvName8;
    TextView tvNumber1,tvNumber2,tvNumber3,tvNumber4,tvNumber5,tvNumber6,tvNumber7,tvNumber8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex10_phone_book_layout);


        tvName1 = (TextView)findViewById(R.id.tvName1);
        tvName2 = (TextView)findViewById(R.id.tvName2);
        tvName3 = (TextView)findViewById(R.id.tvName3);
        tvName4 = (TextView)findViewById(R.id.tvName4);
        tvName5 = (TextView)findViewById(R.id.tvName5);
        tvName6 = (TextView)findViewById(R.id.tvName6);
        tvName7 = (TextView)findViewById(R.id.tvName7);
        tvName8 = (TextView)findViewById(R.id.tvName8);
        tvNumber1 = (TextView)findViewById(R.id.tvNumber1);
        tvNumber2 = (TextView)findViewById(R.id.tvNumber2);
        tvNumber3 = (TextView)findViewById(R.id.tvNumber3);
        tvNumber4 = (TextView)findViewById(R.id.tvNumber4);
        tvNumber5 = (TextView)findViewById(R.id.tvNumber5);
        tvNumber6 = (TextView)findViewById(R.id.tvNumber6);
        tvNumber7 = (TextView)findViewById(R.id.tvNumber7);
        tvNumber8 = (TextView)findViewById(R.id.tvNumber8);

        findViewById(R.id.btnTel1).setOnClickListener(mClick);
        findViewById(R.id.btnTel2).setOnClickListener(mClick);
        findViewById(R.id.btnTel3).setOnClickListener(mClick);
        findViewById(R.id.btnTel4).setOnClickListener(mClick);
        findViewById(R.id.btnTel5).setOnClickListener(mClick);
        findViewById(R.id.btnTel6).setOnClickListener(mClick);
        findViewById(R.id.btnTel7).setOnClickListener(mClick);
        findViewById(R.id.btnTel8).setOnClickListener(mClick);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btnTel1:
                    String tel_name1 = "tel:"+tvName1.getText().toString();
                    String tel_number1 = "tel:"+tvNumber1.getText().toString();

                    Intent intentTel1 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number1));
                    startActivity(intentTel1);
                    Toast.makeText(Ex10PhoneBookActivity.this,tel_name1+"에게 전화를 겁니다!",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnTel2:
                    String tel_name2 = "tel:"+tvName2.getText().toString();
                    String tel_number2 = "tel:"+tvNumber2.getText().toString();

                    Intent intentTel2 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number2));
                    startActivity(intentTel2);
                    Toast.makeText(Ex10PhoneBookActivity.this,tel_name2+"에게 전화를 겁니다!",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnTel3:
                    String tel_name3 = "tel:"+tvName3.getText().toString();
                    String tel_number3 = "tel:"+tvNumber3.getText().toString();

                    Intent intentTel3 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number3));
                    startActivity(intentTel3);
                    Toast.makeText(Ex10PhoneBookActivity.this,tel_name3+"에게 전화를 겁니다!",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnTel4:
                    String tel_name4 = "tel:"+tvName4.getText().toString();
                    String tel_number4 = "tel:"+tvNumber4.getText().toString();

                    Intent intentTel4 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number4));
                    startActivity(intentTel4);
                    Toast.makeText(Ex10PhoneBookActivity.this,tel_name4+"에게 전화를 겁니다!",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnTel5:
                    String tel_name5 = "tel:"+tvName5.getText().toString();
                    String tel_number5 = "tel:"+tvNumber5.getText().toString();

                    Intent intentTel5 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number5));
                    startActivity(intentTel5);
                    Toast.makeText(Ex10PhoneBookActivity.this,tel_name5+"에게 전화를 겁니다!",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnTel6:
                    String tel_name6 = "tel:"+tvName6.getText().toString();
                    String tel_number6 = "tel:"+tvNumber6.getText().toString();

                    Intent intentTel6 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number6));
                    startActivity(intentTel6);
                    Toast.makeText(Ex10PhoneBookActivity.this,tel_name6+"에게 전화를 겁니다!",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnTel7:
                    String tel_name7 = "tel:"+tvName7.getText().toString();
                    String tel_number7 = "tel:"+tvNumber7.getText().toString();

                    Intent intentTel7 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number7));
                    startActivity(intentTel7);
                    Toast.makeText(Ex10PhoneBookActivity.this,tel_name7+"에게 전화를 겁니다!",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnTel8:
                    String tel_name8 = "tel:"+tvName8.getText().toString();
                    String tel_number8 = "tel:"+tvNumber8.getText().toString();

                    Intent intentTel8 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number8));
                    startActivity(intentTel8);
                    Toast.makeText(Ex10PhoneBookActivity.this,tel_name8+"에게 전화를 겁니다!",Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}