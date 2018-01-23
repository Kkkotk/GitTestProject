package com.example.a17246.gittestproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mButton = (Button) findViewById(R.id.activity_main_bt_test);
        /**
         * 测试文件
         */
    }

    @Override
    public void onClick(View v) {
        
    }
}
