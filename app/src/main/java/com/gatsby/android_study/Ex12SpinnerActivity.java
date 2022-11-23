package com.gatsby.android_study;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gatsby.android_study.R;

public class Ex12SpinnerActivity extends AppCompatActivity {
    TextView textView;
    ImageView ivPhoto;

    String[] items = {"페리카나", "대전의", "치킨은", "페리카나"};
    Integer[] photos = {R.drawable.chi,R.drawable.chi,R.drawable.chi,R.drawable.chi};

    String temp = "";//스피너 선택값 저장변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex12_spinner_layout);

        textView = (TextView) findViewById(R.id.tvSelect);
        ivPhoto = (ImageView) findViewById(R.id.ivPhoto);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, items
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // 스피너에 어댑터 설정
        spinner.setAdapter(adapter);

        // 스피너에서 선택 했을 경우 이벤트 처리
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(items[position]);
                ivPhoto.setImageResource(photos[position]);
                ((TextView) parent.getChildAt(0)).setTextColor(Color.rgb(0,0,0));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
