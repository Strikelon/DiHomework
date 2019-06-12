package com.strikalov.dihomework.common;

import android.util.Log;

public class White {

    private static final String TAG = "WhiteLog";

    public White(){
        Green green = new Green();
        Log.i(TAG, green.show());
    }

    public White(Green green){
        Log.i(TAG, green.show());
    }

}
