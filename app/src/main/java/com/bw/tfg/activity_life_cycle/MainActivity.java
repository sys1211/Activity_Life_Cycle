package com.bw.tfg.activity_life_cycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button bt,bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt= (Button) findViewById(R.id.bt);
        bt.setOnClickListener(this);
        bt1= (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(this);
        Log.e("sys","A页面oncreat");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("sys","A页面onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("sys","A页面onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("sys","A页面onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("sys","A页面onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("sys","A页面onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("sys","A页面onDestroy");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt:
                Intent i=new Intent(this,B_activity.class);
                startActivity(i);
                break;
            case R.id.bt1:
                finish();
                break;
            default:
                break;
        }

    }
}
