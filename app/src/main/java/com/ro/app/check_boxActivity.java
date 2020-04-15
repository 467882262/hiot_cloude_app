package com.ro.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class check_boxActivity extends AppCompatActivity {
private CheckBox mCb1,mCb2,mCb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        mCb1 = findViewById(R.id.cb_1);
        mCb2 = findViewById(R.id.cb_2);
        mCb3 = findViewById(R.id.cb_3);
        mCb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(check_boxActivity.this,isChecked?"选中":"未选中",Toast.LENGTH_SHORT) .show();
            }
        });
        mCb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(check_boxActivity.this,isChecked?"选中":"未选中",Toast.LENGTH_SHORT) .show();
            }
        });
        mCb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(check_boxActivity.this,isChecked?"选中":"未选中",Toast.LENGTH_SHORT) .show();
            }
        });
    }
}
