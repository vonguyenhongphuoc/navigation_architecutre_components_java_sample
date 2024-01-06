package com.devhp.navigationarchietecturesample;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class DemoAppComponent implements DefaultLifecycleObserver {
    private final String activityName;
    private static final String TAG = "DemoAppComponent";

    public DemoAppComponent(String activityName) {
        this.activityName = activityName;
    }

    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onCreate(owner);
        Log.d(TAG, "DemoAppComponent " + "onCreate: " + activityName);
    }


    @Override
    public void onPause(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onPause(owner);
        Log.d(TAG, "DemoAppComponent " + "onPause: " + activityName);
    }

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onResume(owner);
        Log.d(TAG, "DemoAppComponent " + "onResume: " + activityName);
    }

    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onDestroy(owner);
        Log.d(TAG, "DemoAppComponent " + "onDestroy: " + activityName);
    }
}

