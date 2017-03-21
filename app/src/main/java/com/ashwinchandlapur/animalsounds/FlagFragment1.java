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

import java.util.Locale;


public class FlagFragment1 extends Fragment {
    TextView t;
    MediaPlayer sound;
    TextToSpeech tts;
    //private static final String TAG = "FirstFragment";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.flag1_fragment, container, false);


        ImageButton btn=(ImageButton)view.findViewById(R.id.btno1);
        ImageButton btn1=(ImageButton)view.findViewById(R.id.btn1o1);
        ImageButton home=(ImageButton)view.findViewById(R.id.home);
        // Button btn = (Button) view.findViewById(R.id.btn);



        t=(TextView)view.findViewById(R.id.tv);
        TextView info = (TextView)view.findViewById(R.id.info);
        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(),"fonts/Kaushan.otf");
        t.setTypeface(myFont);
        info.setTypeface(myFont);




       /* tts=new TextToSpeech(getActivity().getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    tts.setLanguage(Locale.UK);
                }
            }
        });*/

        String toSpeak = t.getText().toString();
        //Toast.makeText(getActivity().getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
        StartSpeak(toSpeak);





        // final MediaPlayer sound= MediaPlayer.create(view.getContext(),R.raw.india);
        //sound.start();






        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();
				/*
				 * IMPORTANT: We use the "root frame" defined in
				 * "root_fragment.xml" as the reference to replace fragment
				 */
                trans.replace(R.id.root_framen, new FlagFragment2());
                tts.stop();
                tts.shutdown();
                //sound.stop();
               // sound.release();
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
                trans.replace(R.id.root_framen, new FlagFragment11());
                tts.stop();
                tts.shutdown();
              //  sound.stop();

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
                tts.stop();
                tts.shutdown();
                //sound.pause();
               // sound.release();
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
                    tts.stop();
                    tts.shutdown();
                   // sound.pause();
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