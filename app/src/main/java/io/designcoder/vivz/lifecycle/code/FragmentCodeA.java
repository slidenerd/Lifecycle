package io.designcoder.vivz.lifecycle.code;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.designcoder.vivz.lifecycle.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCodeA extends Fragment {


    public FragmentCodeA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_code_a, container, false);
    }

}
