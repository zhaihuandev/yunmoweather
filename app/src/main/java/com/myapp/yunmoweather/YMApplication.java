package com.myapp.yunmoweather;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

public class YMApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePal.initialize(context);
    }

    public Context getContext(){
        return context;
    }
}
