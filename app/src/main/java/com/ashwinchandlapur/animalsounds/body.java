package com.ashwinchandlapur.animalsounds;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class body extends Fragment {
    TextView t,t1;

    //private static final String TAG = "FirstFragment";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.body_fragment, container, false);

//        Bundle extras = new Bundle();
//        extras.putBoolean("is_designed_for_families", true);
//
//        AdRequest adRequest = new AdRequest.Builder()
//                .addNetworkExtrasBundle(getActivity(), extras)
//                .tagForChildDirectedTreatment(true)
//                .build();
//
//        // Prepare the Interstitial Ad
//        interstitial = new InterstitialAd(getActivity());
//
//// Insert the Ad Unit ID
//        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
//
//        interstitial.loadAd(adRequest);
//// Prepare an Interstitial Ad Listener
//        interstitial.setAdListener(new AdListener() {
//            public void onAdLoaded() {
//// Call displayInterstitial() function
//                if (interstitial.isLoaded() && Math.random()>0.69) {
//                    interstitial.show();
//                }
//
//            }
//        });

        ImageButton btn=(ImageButton)view.findViewById(R.id.btno1);
        ImageButton btn1=(ImageButton)view.findViewById(R.id.btn1o1);

        ImageButton home=(ImageButton)view.findViewById(R.id.home);


        ImageButton hairs=(ImageButton)view.findViewById(R.id.hairs);
       // hairs.setX(270);
      //  hairs.setY(250);

        ImageButton eyebrows=(ImageButton)view.findViewById(R.id.eyebrows);
      //  eyebrows.setX(270);
      //  eyebrows.setY(415);


        ImageButton noses=(ImageButton)view.findViewById(R.id.noses);
      //  noses.setX(270);
      //  noses.setY(500);

        ImageButton mouths=(ImageButton)view.findViewById(R.id.mouths);
      //  mouths.setX(270);
     //   mouths.setY(560);

       ImageButton fingerss=(ImageButton)view.findViewById(R.id.fingerss);
       // fingerss.setX(270);
      //  fingerss.setY(810);

        ImageButton eyess=(ImageButton)view.findViewById(R.id.eyess);
      //  eyess.setX(-270);
      //  eyess.setY(455);

        ImageButton earss=(ImageButton)view.findViewById(R.id.earss);
       // earss.setX(-270);
      //  earss.setY(520);

        ImageButton necks=(ImageButton)view.findViewById(R.id.necks);
     //   necks.setX(-270);
     //   necks.setY(625);

        ImageButton handss=(ImageButton)view.findViewById(R.id.handss);
      //  handss.setX(-275);
      //  handss.setY(800);


        ImageButton legss=(ImageButton)view.findViewById(R.id.legss);
     //   legss.setX(-270);
      //  legss.setY(885);







        //ear.start();


        t=(TextView)view.findViewById(R.id.tv);
        t1=(TextView)view.findViewById(R.id.handles);
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(),"fonts/Kaushan.otf");
        t.setTypeface(myFont);
        t1.setTypeface(myFont);





       /* btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();

                trans.replace(R.id.root_frameo, new c());

                sound.stop();

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

                trans.replace(R.id.root_frameo, new a());
                sound.stop();

                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                trans.addToBackStack(null);

                trans.commit();
            }
        }); */


        home.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //sound.pause();
                Intent intent=new Intent(getActivity(),MainScroller.class);
               // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
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
                  //  sound.pause();
                    Intent intent=new Intent(getActivity(),MainScroller.class);
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        } );
        return view;
    }


}