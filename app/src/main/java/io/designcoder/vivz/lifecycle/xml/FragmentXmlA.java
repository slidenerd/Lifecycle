package io.designcoder.vivz.lifecycle.xml;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.designcoder.vivz.lifecycle.R;

/**
 * Created by vivz on 26/12/15.
 */
public class FragmentXmlA extends Fragment {
    public FragmentXmlA() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_xml_a, container, false);
    }
}
