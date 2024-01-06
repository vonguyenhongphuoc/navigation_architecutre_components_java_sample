package com.devhp.navigationarchietecturesample;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class DemoAppComponent implements LifecycleObserver {
    private final String activityName;
    private static final String TAG = "DemoAppComponent";

    public DemoAppComponent(String activityName) {
        this.activityName = activityName;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    protected void onCreate() {
        Log.d(TAG, "DemoAppComponent " + "onCreate: " + activityName);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    protected void onPause() {
        Log.d(TAG, "DemoAppComponent " + "onPause: " + activityName);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    protected void onResume() {
        Log.d(TAG, "DemoAppComponent " + "onResume: " + activityName);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    protected void onDestroy() {
        Log.d(TAG, "DemoAppComponent " + "onDestroy: " + activityName);
    }


}

