package io.designcoder.vivz.lifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class E extends AppCompatActivity {
    public static final String TAG = "VIVZ";

    public E(){
        Log.d(TAG, "E: CONSTRUCTOR");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e);
        Log.d(TAG, "onCreate: ACTIVITY");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ACTIVITY");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ACTIVITY");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ACTIVITY");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ACTIVITY");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ACTIVITY");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ACTIVITY");
    }
}
