package com.ashwinchandlapur.animalsounds;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


public class YbirdFragment1 extends Fragment {
    TextView t;

    private static final String TAG = "FirstFragment";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.ybird1_fragment, container, false);


        ImageButton btn=(ImageButton)view.findViewById(R.id.btn);
        ImageButton btn1=(ImageButton)view.findViewById(R.id.btn1);
        ImageButton homes=(ImageButton)view.findViewById(R.id.home);
        // Button btn = (Button) view.findViewById(R.id.btn);
        final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.woodpekker);
        sound.start();


        t=(TextView)view.findViewById(R.id.tv);

        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(),"fonts/Kaushan.otf");
        t.setTypeface(myFont);



        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();
				/*
				 * IMPORTANT: We use the "root frame" defined in
				 * "root_fragment.xml" as the reference to replace fragment
				 */
                trans.replace(R.id.root_framey, new YbirdFragment2());
                sound.stop();sound.release();
				/*
				 * IMPORTANT: The following lines allow us to add the fragment
				 * to the stack and return to it later, by pressing back
				 */
                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                trans.addToBackStack(null);

                trans.commit();
            }
        });

        btn1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();
				/*
				 * IMPORTANT: We use the "root frame" defined in
				 * "root_fragment.xml" as the reference to replace fragment
				 */
                trans.replace(R.id.root_framey, new YbirdFragment6());
                sound.stop();sound.release();
				/*
				 * IMPORTANT: The following lines allow us to add the fragment
				 * to the stack and return to it later, by pressing back
				 */
                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                trans.addToBackStack(null);

                trans.commit();
            }
        });


        homes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.pause();
                Intent intent=new Intent(getActivity(),ScrollingActivity.class);
                startActivity(intent);
            }
        });


        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener( new View.OnKeyListener()
        {
            @Override
            public boolean onKey( View v, int keyCode, KeyEvent event )
            {
                if( keyCode == KeyEvent.KEYCODE_BACK )
                {
                    sound.pause();
                    Intent intent=new Intent(getActivity(),ScrollingActivity.class);
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        } );
        return view;
    }



}