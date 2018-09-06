package com.jetlee.lauchmodedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * @author：Jet啟思
 * @date:2018/9/6 10:40
 */
public class SecondActivity extends AppCompatActivity {

    private static String Tag = "SecondActivity.class";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e(Tag, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(Tag, "onNewIntent");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(Tag, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(Tag, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(Tag, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(Tag, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(Tag, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(Tag, "onDestroy");
    }
}
