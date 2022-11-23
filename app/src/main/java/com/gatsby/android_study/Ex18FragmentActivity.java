package com.gatsby.android_study;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.gatsby.android_study.R;

public class Ex18FragmentActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private Ex18Fragment_1Activity fragmentA;
    private Ex18Fragment_2Activity fragmentB;
    private FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex18_fragment_layout);

        fragmentManager = getSupportFragmentManager();

        fragmentA = new Ex18Fragment_1Activity();
        fragmentB = new Ex18Fragment_2Activity();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();

        findViewById(R.id.button).setOnClickListener(mClick);
        findViewById(R.id.button2).setOnClickListener(mClick);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            transaction = fragmentManager.beginTransaction();

            switch(v.getId())
            {
                case R.id.button:
                    transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
                    break;
                case R.id.button2:
                    transaction.replace(R.id.frameLayout, fragmentB).commitAllowingStateLoss();
                    break;
            }

        }
    };

}