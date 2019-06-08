package com.strikalov.dihomework.common;

import android.util.Log;

public class Red {

    private static final String TAG = "RedLog";

    public Red(){
        Green green = new Green();
        Log.i(TAG, green.show());
    }

    public Red(Green green){
        Log.i(TAG, green.show());
    }

}
