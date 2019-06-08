package com.strikalov.dihomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.strikalov.dihomework.common.Green;
import com.strikalov.dihomework.common.Red;
import com.strikalov.dihomework.common.White;

public class DiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_di);

        Green green = new Green();

        Red red = new Red(green);
        White white = new White(green);
    }
}
