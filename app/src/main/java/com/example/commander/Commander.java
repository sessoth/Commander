package com.example.commander;

import android.app.Application;

import androidx.appcompat.app.AppCompatDelegate;

public class Commander extends Application {

    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_YES);
    }
}
