package com.ashwinchandlapur.animalsounds;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


public class StaticsFragment extends Fragment {
    TextView t,t1,t2,t3,t4,t5,t6,t7,t8;
    private static final String TAG = "StaticFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater
                .inflate(R.layout.fragment_statics, container, false);

        t1=(TextView)view.findViewById(R.id.nose2);
        t2=(TextView)view.findViewById(R.id.eyes2);
        t3=(TextView)view.findViewById(R.id.ears2);
        t4=(TextView)view.findViewById(R.id.mouth2);
        t5=(TextView)view.findViewById(R.id.hands2);
        t6=(TextView)view.findViewById(R.id.legs2);
        t7=(TextView)view.findViewById(R.id.click);
        t8=(TextView)view.findViewById(R.id.name);
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(),"fonts/Kaushan.otf");
        t1.setTypeface(myFont);
        t2.setTypeface(myFont);
        t3.setTypeface(myFont);
        t4.setTypeface(myFont);
        t5.setTypeface(myFont);
        t6.setTypeface(myFont);
        t7.setTypeface(myFont);
        t8.setTypeface(myFont);



        final MediaPlayer isound= MediaPlayer.create(view.getContext(),R.raw.nose);
        final MediaPlayer jsound= MediaPlayer.create(view.getContext(),R.raw.eyes);
        final MediaPlayer ksound= MediaPlayer.create(view.getContext(),R.raw.ears);
        final MediaPlayer lsound= MediaPlayer.create(view.getContext(),R.raw.mouth);
        final MediaPlayer msound= MediaPlayer.create(view.getContext(),R.raw.hands);
        final MediaPlayer nsound= MediaPlayer.create(view.getContext(),R.raw.legs);


        ImageButton i=(ImageButton)view.findViewById(R.id.noser);
        ImageButton j=(ImageButton)view.findViewById(R.id.eyer);
        ImageButton k=(ImageButton)view.findViewById(R.id.earer);
        ImageButton l=(ImageButton)view.findViewById(R.id.mouther);
        ImageButton m=(ImageButton)view.findViewById(R.id.hander);
        ImageButton n=(ImageButton)view.findViewById(R.id.leger);

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isound.start();
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jsound.start();
            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksound.start();
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lsound.start();
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msound.start();
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nsound.start();
            }
        });






        return view;
    }

}