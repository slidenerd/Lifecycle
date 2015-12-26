package io.designcoder.vivz.lifecycle.xml;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.designcoder.vivz.lifecycle.R;

public class ActivityFragmentXml extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_fragment_xml);
    }
}
