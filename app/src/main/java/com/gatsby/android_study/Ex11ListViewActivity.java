package com.gatsby.android_study;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gatsby.android_study.R;

import java.util.ArrayList;

public class Ex11ListViewActivity extends AppCompatActivity {
    private String TAG = "리스트뷰예제";
    private ListView listview = null;
    private ListViewAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex11_listview_layout1);

        listview = (ListView) findViewById(R.id.listview);
        adapter = new ListViewAdapter();

        //Adapter 안에 아이템의 정보 담기
        adapter.addItem(new Ex11Chicken("1", "황금올리브", R.drawable.bbq));
        adapter.addItem(new Ex11Chicken("2", "뿌링클", R.drawable.bbo));
        adapter.addItem(new Ex11Chicken("3", "지코바", R.drawable.gcova));
        adapter.addItem(new Ex11Chicken("4", "호랑이치킨", R.drawable.horang2));
        adapter.addItem(new Ex11Chicken("5", "레드콤보", R.drawable.red));
        adapter.addItem(new Ex11Chicken("6", "신호등치킨", R.drawable.sin));
        adapter.addItem(new Ex11Chicken("7", "양념치킨", R.drawable.yang));
        adapter.addItem(new Ex11Chicken("8", "볼케이노", R.drawable.volcaino1));
        adapter.addItem(new Ex11Chicken("9", "kfc", R.drawable.kfc));

        //리스트뷰에 Adapter 설정
        listview.setAdapter(adapter);
    }


    /* 리스트뷰 어댑터 */
    public class ListViewAdapter extends BaseAdapter {
        ArrayList<Ex11Chicken> items = new ArrayList<Ex11Chicken>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(Ex11Chicken item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            final Context context = viewGroup.getContext();
            final Ex11Chicken chicken = items.get(position);

            if(convertView == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.ex11_listview_layout, viewGroup, false);

            } else {
                View view = new View(context);
                view = (View) convertView;
            }

            TextView tv_num = (TextView) convertView.findViewById(R.id.tvNum);
            TextView tv_name = (TextView) convertView.findViewById(R.id.tvName);
            ImageView iv_icon = (ImageView) convertView.findViewById(R.id.ivIcon);

            tv_num.setText(chicken.getNum());
            tv_name.setText(chicken.getName());
            iv_icon.setImageResource(chicken.getResId());
            Log.d(TAG, "getView() - [ "+position+" ] "+chicken.getName());

            //각 아이템 선택 event
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, chicken.getNum()+" 번 - "+chicken.getName()+" 입니당! ", Toast.LENGTH_SHORT).show();
                }
            });

            return convertView;  //뷰 객체 반환
        }
    }

}
