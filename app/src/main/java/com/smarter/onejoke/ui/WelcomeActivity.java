package com.smarter.onejoke.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.smarter.onejoke.R;

public class WelcomeActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        mTintManager.setStatusBarDarkMode(true,this);

        jumpToMain();

    }

    private void jumpToMain(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1500);
    }
}
