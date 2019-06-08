package com.strikalov.dihomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.strikalov.dihomework.common.Green;
import com.strikalov.dihomework.common.Red;
import com.strikalov.dihomework.common.White;

import javax.inject.Inject;

public class DaggerActivity extends AppCompatActivity {

    @Inject
    Green green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        App.getInstance().getAppComponent().injectDaggerActivity(this);

        White white = new White(green);
        Red red = new Red(green);
    }
}
