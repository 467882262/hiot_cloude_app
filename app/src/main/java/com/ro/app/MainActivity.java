package com.ro.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.btn_1);
//        mBtnTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //跳转到TextView演示页面
//                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
//                startActivity(intent);
//
//            }
//        });
        mBtnButton = findViewById(R.id.btn_2);
//        mBtnButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //跳转到Button
//                Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
//                startActivity(intent);
//            }
//        });
        mBtnEditText = findViewById(R.id.btn_EditText);
//        mBtnEditText.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //跳转到EditText界面
//                Intent intent = new Intent(MainActivity.this, EditTextActivity.class);
//                startActivity(intent);
//            }
//        });
        mBtnRadioButton = findViewById(R.id.btn_radioButton);
        mBtnCheckBox = findViewById(R.id.btn_mBtnCheckBox);
        mBtnImageView = findViewById(R.id.btn_mBtnImageView);
        setListener();
    }
    private void setListener(){
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);

    }

    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_1:
                    //跳转到TextView演示页面
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_2:
                    //跳转到Button
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_EditText:
                    //跳转到EditText界面
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radioButton:
                    //跳转到RadiuButton
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_mBtnCheckBox:
                    intent = new Intent(MainActivity.this, check_boxActivity.class);
                    break;
                case R.id.btn_mBtnImageView:
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;


            }
            startActivity(intent);//初始化
        }
    }
}
