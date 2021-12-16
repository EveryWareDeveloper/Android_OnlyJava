package com.cookandroid.project5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);  //xml파일을 쓰지 않겠다!
//        실습예제 5-1
          //레이아웃 만들기!

          //레이아웃 옵션 정하기(param = 너비, 높이)
//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.MATCH_PARENT);

          //레이아웃 객체 생성(리니어 레이아웃)
//        LinearLayout baseLayout = new LinearLayout(this);
          //레이아웃 객체 속성 설정)
//        baseLayout.setOrientation(LinearLayout.VERTICAL);
//        baseLayout.setBackgroundColor(Color.rgb(0, 255, 0));

          //레이아웃 객체를 옵션과 함께 view에 꽂는다.
//        setContentView(baseLayout,params);
//
//        Button btn = new Button(this);
//        btn.setText("버튼입니다");
//        btn.setBackgroundColor(Color.MAGENTA);
//        baseLayout.addView(btn);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View arg0) {
//                Toast.makeText(getApplicationContext(),
//                        "코드로 생성한 버튼입니다", Toast.LENGTH_SHORT).show();
//            }
//        });

        //직접 풀어보기
          LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                  LinearLayout.LayoutParams.MATCH_PARENT,
                  LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(255, 255, 255));
        setContentView(baseLayout,params);

        //에딧텍스트 추가
        EditText editText = new EditText(this);
        editText.setHint("입력바람!");
        baseLayout.addView(editText);

        Button btn = new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(btn);

        TextView textView = new TextView(this);
        textView.setText("결과출력!");
        textView.setTextSize(20);
        baseLayout.addView(textView);

        //뷰 객체의 이벤트 처리(온클릭리스너)
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String str = editText.getText().toString();
                textView.setText(str);
            }
        });

    }


}