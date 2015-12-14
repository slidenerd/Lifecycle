package io.designcoder.vivz.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }
}
