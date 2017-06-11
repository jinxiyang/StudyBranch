package com.yang.studybranch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String[] strings = new String[]{
            "first edit",
            "dev add str_master",
            "dev add str_feature1",
            "after stash",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
