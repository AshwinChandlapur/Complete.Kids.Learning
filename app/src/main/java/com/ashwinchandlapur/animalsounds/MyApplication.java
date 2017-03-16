package com.ashwinchandlapur.animalsounds;

/**
 * Created by ${Ashwin_Chandlapur} on 3/15/2017.
 */

import android.app.Application;

import com.pushbots.push.Pushbots;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize Pushbots Library
        Pushbots.sharedInstance().init(this);
    }
}