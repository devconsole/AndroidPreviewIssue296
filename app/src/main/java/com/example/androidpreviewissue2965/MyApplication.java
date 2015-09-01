package com.example.androidpreviewissue2965;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Log.i("Issue2965", "MyApplication.onCreate() called");
    }
}
