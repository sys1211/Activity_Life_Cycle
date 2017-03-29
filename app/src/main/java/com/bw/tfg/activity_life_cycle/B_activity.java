package com.bw.tfg.activity_life_cycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by tfg on 2017/3/29.
 */

public class B_activity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_activity);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("sys","B页面onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("sys","B页面onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("sys","B页面onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("sys","B页面onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("sys","B页面onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("sys","B页面onDestroy");
    }
}
