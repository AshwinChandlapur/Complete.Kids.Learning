package com.ashwinchandlapur.animalsounds;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;




public class StaticFragment extends Fragment {
TextView t,t1,t2;
    private static final String TAG = "StaticFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater
                .inflate(R.layout.static_fragment, container, false);
        t=(TextView)view.findViewById(R.id.support);
        t1=(TextView)view.findViewById(R.id.request);
        t2=(TextView)view.findViewById(R.id.keep);



        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(),"fonts/Kaushan.otf");
        t.setTypeface(myFont);
        t1.setTypeface(myFont);
        t2.setTypeface(myFont);
        return view;
    }

}