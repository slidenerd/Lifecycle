package io.designcoder.vivz.lifecycle.code;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import io.designcoder.vivz.lifecycle.R;

public class ActivityFragmentCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_code);
        FragmentCodeA objA = new FragmentCodeA();
        FragmentCodeB objB = new FragmentCodeB();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.ll1,objA,"A");
        fragmentTransaction.add(R.id.ll2,objB,"B");
        fragmentTransaction.commit();
    }
}
