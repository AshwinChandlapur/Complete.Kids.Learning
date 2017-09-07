package com.ashwinchandlapur.animalsounds;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Locale;


public class FlagFragment11 extends Fragment {
    TextView t;
    MediaPlayer sound;
    TextToSpeech tts;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    //private static final String TAG = "FirstFragment";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.flag11_fragment, container, false);


//        Bundle extras = new Bundle();
//        extras.putBoolean("is_designed_for_families", true);
//
//        AdRequest adRequest = new AdRequest.Builder()
//                .addNetworkExtrasBundle(MainScroller.class, extras)
//                .tagForChildDirectedTreatment(true)
//                .build();
//        interstitial = new InterstitialAd(getActivity());
//// Insert the Ad Unit ID
//        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
//
//        interstitial.loadAd(adRequest);
//// Prepare an Interstitial Ad Listener
//        interstitial.setAdListener(new AdListener() {
//            public void onAdLoaded() {
//// Call displayInterstitial() function
//                if (interstitial.isLoaded()) {
//                    interstitial.show();
//                }
//
//            }
//        });


        ImageButton btn=(ImageButton)view.findViewById(R.id.btno1);
        ImageButton btn1=(ImageButton)view.findViewById(R.id.btn1o1);
        ImageButton home=(ImageButton)view.findViewById(R.id.home);
        // Button btn = (Button) view.findViewById(R.id.btn);



        t=(TextView)view.findViewById(R.id.tv);
        TextView info = (TextView)view.findViewById(R.id.info);
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(),"fonts/Kaushan.otf");
        t.setTypeface(myFont);
        info.setTypeface(myFont);


        String toSpeak = t.getText().toString();
        //Toast.makeText(getActivity().getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
        StartSpeak(toSpeak);




        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();
				/*
				 * IMPORTANT: We use the "root frame" defined in
				 * "root_fragment.xml" as the reference to replace fragment
				 */
                trans.replace(R.id.root_framen, new FlagFragment1());
                //sound.stop();
               // sound.release();
                tts.stop();

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
                trans.replace(R.id.root_framen, new FlagFragment10());
              //  sound.stop();
                tts.stop();


				/*
				 * IMPORTANT: The following lines allow us to add the fragment
				 * to the stack and return to it later, by pressing back
				 */
                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                trans.addToBackStack(null);

                trans.commit();
            }
        });


        home.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //sound.pause();
               // sound.release();
                tts.stop();

                Intent intent=new Intent(getActivity(),MainScroller.class);
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
                   // sound.pause();
                    tts.stop();

                    Intent intent=new Intent(getActivity(),MainScroller.class);
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        } );
        return view;
    }
    private void StartSpeak(final String data) {

        tts=new TextToSpeech(getActivity().getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int initStatus) {
                if (initStatus == TextToSpeech.SUCCESS) {
                    if(tts.isLanguageAvailable(Locale.US)==TextToSpeech.LANG_AVAILABLE)
                        tts.setLanguage(Locale.US);
                    tts.setPitch(1.1f);
                    tts.setSpeechRate(0.85f);
                    // start speak
                    speakWords(data);
                }
                else if (initStatus == TextToSpeech.ERROR) {
                    Toast.makeText(getActivity().getApplicationContext(), "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
                }
            }


        });
    }

    private void speakWords(String speech) {
        tts.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
    }


}