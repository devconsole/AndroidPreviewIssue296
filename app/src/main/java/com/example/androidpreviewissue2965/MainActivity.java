package com.example.androidpreviewissue2965;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Issue2965", "MainActivity.onCreate() called");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.text);

        Application application = getApplication();
        if (application instanceof MyApplication) {
            text.setText("Everything is OK");
        } else {
            text.setText("ERROR! Application class is " + application.getClass());
        }

        // provide something to backup
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        preferences.edit().putLong("time", System.currentTimeMillis()).apply();
    }
}
