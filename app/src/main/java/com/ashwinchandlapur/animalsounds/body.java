package com.ashwinchandlapur.animalsounds;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class body extends Fragment {
    TextView t,t1;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    //private static final String TAG = "FirstFragment";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.body_fragment, container, false);
        AdRequest adRequest = new AdRequest.Builder().build();

        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(getActivity());
// Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));

        interstitial.loadAd(adRequest);
// Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
// Call displayInterstitial() function
                if (interstitial.isLoaded() && Math.random()>0.69) {
                    interstitial.show();
                }

            }
        });

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




        final MediaPlayer hair= MediaPlayer.create(view.getContext(),R.raw.hair);
        final MediaPlayer eyebrow= MediaPlayer.create(view.getContext(),R.raw.eyebrows);
        final MediaPlayer nose= MediaPlayer.create(view.getContext(),R.raw.nose);
        final MediaPlayer mouth= MediaPlayer.create(view.getContext(),R.raw.mouth);
        final MediaPlayer finger= MediaPlayer.create(view.getContext(),R.raw.finger);
        final MediaPlayer eyes= MediaPlayer.create(view.getContext(),R.raw.eyes);
        final MediaPlayer ears= MediaPlayer.create(view.getContext(),R.raw.ears);
        final MediaPlayer neck= MediaPlayer.create(view.getContext(),R.raw.neck);
        final MediaPlayer hands= MediaPlayer.create(view.getContext(),R.raw.hands);
        final MediaPlayer legs= MediaPlayer.create(view.getContext(),R.raw.legs);


        //ear.start();


        t=(TextView)view.findViewById(R.id.tv);
        t1=(TextView)view.findViewById(R.id.handles);
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(),"fonts/Kaushan.otf");
        t.setTypeface(myFont);
        t1.setTypeface(myFont);



        hairs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                hair.start();
            }
        });
        eyebrows.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                eyebrow.start();
            }
        });
        noses.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                nose.start();
            }
        });
        mouths.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mouth.start();
            }
        });
        fingerss.setOnClickListener(new OnClickListener() {
            @Override
           public void onClick(View v) {
                finger.start();}
       });
        eyess.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                eyes.start();
            }
        });
        earss.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ears.start();
            }
        });
        necks.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                neck.start();
            }
        });

        handss.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                hands.start();
            }
        });
        legss.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                legs.start();
            }
        });

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