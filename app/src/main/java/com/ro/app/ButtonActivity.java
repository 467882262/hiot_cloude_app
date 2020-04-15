package com.ro.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
private Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        btn3 = findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ButtonActivity.this,"按钮1被点击了",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void show(View view){
        Toast.makeText(this,"按钮2被点击了",Toast.LENGTH_SHORT).show();
    }
}
