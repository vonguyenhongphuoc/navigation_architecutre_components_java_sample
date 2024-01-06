package com.devhp.navigationarchietecturesample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    public static final String KEY_BUNDLE = "key_bundle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getLifecycle().addObserver(new DemoAppComponent("MainActivity"));
    }
}