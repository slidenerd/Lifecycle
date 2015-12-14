package io.designcoder.vivz.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }
}
