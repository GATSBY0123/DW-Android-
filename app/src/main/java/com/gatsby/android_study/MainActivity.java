package com.gatsby.android_study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gatsby.android_study.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnEx1).setOnClickListener(mClick); findViewById(R.id.btnEx11).setOnClickListener(mClick);
        findViewById(R.id.btnEx2).setOnClickListener(mClick); findViewById(R.id.btnEx12).setOnClickListener(mClick);
        findViewById(R.id.btnEx3).setOnClickListener(mClick); findViewById(R.id.btnEx13).setOnClickListener(mClick);
        findViewById(R.id.btnEx4).setOnClickListener(mClick); findViewById(R.id.btnEx14).setOnClickListener(mClick);
        findViewById(R.id.btnEx5).setOnClickListener(mClick); findViewById(R.id.btnEx15).setOnClickListener(mClick);
        findViewById(R.id.btnEx6).setOnClickListener(mClick); findViewById(R.id.btnEx16).setOnClickListener(mClick);
        findViewById(R.id.btnEx7).setOnClickListener(mClick); findViewById(R.id.btnEx17).setOnClickListener(mClick);
        findViewById(R.id.btnEx8).setOnClickListener(mClick); findViewById(R.id.btnEx18).setOnClickListener(mClick);
        findViewById(R.id.btnEx9).setOnClickListener(mClick); findViewById(R.id.btnEx19).setOnClickListener(mClick);
        findViewById(R.id.btnEx10).setOnClickListener(mClick); findViewById(R.id.btnEx20).setOnClickListener(mClick);

        findViewById(R.id.btnEx21).setOnClickListener(mClick);
        findViewById(R.id.btnEx22).setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btnEx1:
                    Intent ex1 = new Intent(MainActivity.this, Ex1AnimationActivity.class);
                    startActivity(ex1);
                    break;
                case R.id.btnEx2:
                    Intent ex2 = new Intent(MainActivity.this, Ex2GifActivity.class);
                    startActivity(ex2);
                    break;
                case R.id.btnEx3:
                    Intent ex3 = new Intent(MainActivity.this, Ex3VideoActivity.class);
                    startActivity(ex3);
                    break;
                case R.id.btnEx4:
                    Intent ex4 = new Intent(MainActivity.this, Ex4MediaActivity.class);
                    startActivity(ex4);
                    break;
                case R.id.btnEx5:
                    Intent ex5 = new Intent(MainActivity.this, Ex5WebViewActivity.class);
                    startActivity(ex5);
                    break;
                case R.id.btnEx6:
                    Intent ex6 = new Intent(MainActivity.this, Ex6TelActivity.class);
                    startActivity(ex6);
                    break;
                case R.id.btnEx7:
                    Intent ex7 = new Intent(MainActivity.this, Ex7SmsActivity.class);
                    startActivity(ex7);
                    break;
                case R.id.btnEx8:
                    Intent ex8 = new Intent(MainActivity.this, Ex8GalleryActivity.class);
                    startActivity(ex8);
                    break;
                case R.id.btnEx9:
                    Intent ex9 = new Intent(MainActivity.this, Ex9ImageViewActivity.class);
                    startActivity(ex9);
                    break;
                case R.id.btnEx10:
                    Intent ex10 = new Intent(MainActivity.this, Ex10PhoneBookActivity.class);
                    startActivity(ex10);
                    break;
                case R.id.btnEx11:
                    Intent ex11 = new Intent(MainActivity.this, Ex11ListViewActivity.class);
                    startActivity(ex11);
                    break;
                case R.id.btnEx12:
                    Intent ex12 = new Intent(MainActivity.this, Ex12SpinnerActivity.class);
                    startActivity(ex12);
                    break;
                case R.id.btnEx13:
                    Intent ex13 = new Intent(MainActivity.this, Ex13SwitchActivity.class);
                    startActivity(ex13);
                    break;
                case R.id.btnEx14:
                    Intent ex14 = new Intent(MainActivity.this, Ex14IntentSendActivity.class);
                    startActivity(ex14);
                    break;
                case R.id.btnEx15:
                    Intent ex15 = new Intent(MainActivity.this, Ex15SharedPreferenceActivity.class);
                    startActivity(ex15);
                    break;
                case R.id.btnEx16:
                    Intent ex16 = new Intent(MainActivity.this, Ex16SharedPreference2Activity.class);
                    startActivity(ex16);
                    break;
                case R.id.btnEx17:
                    Intent ex17 = new Intent(MainActivity.this, Ex17ViewPaperActivity.class);
                    startActivity(ex17);
                    break;
                case R.id.btnEx18:
                    Intent ex18 = new Intent(MainActivity.this, Ex18FragmentActivity.class);
                    startActivity(ex18);
                    break;
                case R.id.btnEx19:
                    Intent ex19= new Intent(MainActivity.this, Ex19GpsActivity.class);
                    startActivity(ex19);
                    break;
                case R.id.btnEx20:
                    Intent ex20= new Intent(MainActivity.this, Ex20SQLiteExLogin.class);
                    startActivity(ex20);
                    break;
                case R.id.btnEx21:
                    Intent ex21= new Intent(MainActivity.this, Ex21DDayEx.class);
                    startActivity(ex21);
                    break;
                case R.id.btnEx22:
                    Intent ex22= new Intent(MainActivity.this, Ex22RecyclerViewEx.class);
                    startActivity(ex22);
                    break;
            }
        }
    };
}