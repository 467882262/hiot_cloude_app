package com.ro.app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {
    private TextView mtv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mtv1 = findViewById(R.id.id_1);
        mtv1.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        mtv1.getPaint().setAntiAlias(true);//去除锯齿
    }
}
