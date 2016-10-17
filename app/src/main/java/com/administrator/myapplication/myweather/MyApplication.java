package com.administrator.myapplication.myweather;

import android.app.Application;
import android.util.Log;

/**
 * Created by Administrator on 2016/10/12.
 */
public class MyApplication extends Application {
    private static final String TAG = "MyAPP";

    private static Application mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "MyApplication->oncreate");
        mApplication = this;
    }

    public static Application getInstance() {
        return mApplication;
    }

}
