package io.designcoder.vivz.lifecycle.xml;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.designcoder.vivz.lifecycle.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentXmlB extends Fragment {


    public FragmentXmlB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_xml_b, container, false);
    }

}
