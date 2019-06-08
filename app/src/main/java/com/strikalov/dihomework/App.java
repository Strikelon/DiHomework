package com.strikalov.dihomework;

import android.app.Application;

import com.strikalov.dihomework.Dagger.AppComponent;
import com.strikalov.dihomework.Dagger.DaggerAppComponent;

public class App extends Application {

    private static App instance;

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        appComponent = DaggerAppComponent.create();
    }

    public static App getInstance(){
        return instance;
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
