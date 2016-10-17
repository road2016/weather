package com.administrator.myapplication.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;

/**
 * Created by Administrator on 2016/10/1.
 */
public class NetUtil {
    public static final int NETWORK_NONE = 0;
    public static final int NETWORK_WIFI = 1;
    public static final int NETWORK_MOBILE = 2;

    public static int getNetworkState(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        //NETWORK_NONE
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo == null ) {
            return NETWORK_NONE;
        }

        int nType = networkInfo.getType();
        //MOBILE
        if (nType == ConnectivityManager.TYPE_MOBILE) {
            return NETWORK_MOBILE;
        }else if (nType == ConnectivityManager.TYPE_WIFI){
            return NETWORK_WIFI;
        }
        return NETWORK_NONE;
    }

}
