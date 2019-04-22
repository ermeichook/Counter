package com.example.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = MainActivity.class.getName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.plus).setOnClickListener(v -> {
            Log.d(TAG, "plus: ");

        });
        findViewById(R.id.minus).setOnClickListener(v -> {
            Log.d(TAG, "minus ");

        });
    }
}
