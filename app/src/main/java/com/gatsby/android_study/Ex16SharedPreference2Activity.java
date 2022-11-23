package com.gatsby.android_study;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gatsby.android_study.R;

public class Ex16SharedPreference2Activity extends AppCompatActivity {

    SharedPreferences pref;          // 프리퍼런스
    SharedPreferences.Editor editor; // 에디터

    String myStr;                   // 문자 변수
    CheckBox checkBox;

    EditText etId;          // 레이아웃 변수 EditText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex16_sharedpreference2_layout);

        // 1. Shared Preference 초기화
        pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        editor = pref.edit();

        // 2. 저장해둔 값 불러오기 ("식별값", 초기값) -> 식별값과 초기값은 직접 원하는 이름과 값으로 작성.
        myStr = pref.getString("MyStr", "A");   // String 불러오기 (저장해둔 값 없으면 초기값인 A으로 불러옴)

        // 3. 레이아웃 변수 초기화
        etId = findViewById(R.id.etId);

        // 4. 앱을 새로 켜면 이전에 저장해둔 값이 표시됨
        etId.setText(myStr);


        // 5. 각 버튼 클릭시 새로운 값 저장
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked()) {
                    myStr = etId.getText().toString();
                    editor.putString("MyStr", myStr);
                    editor.apply(); // 저장
                    Toast.makeText(getApplication(), myStr + " 값이 저장되었습니다.", Toast.LENGTH_SHORT).show();
                } else {

                }
            }
        });
    }
}