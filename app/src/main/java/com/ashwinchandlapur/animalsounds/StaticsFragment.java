package com.ashwinchandlapur.animalsounds;

import android.graphics.Typeface;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;


public class StaticsFragment extends Fragment {
    TextView t,t1,t2,t3,t4,t5,t6,t7,t8;
    TextToSpeech tts;
    String nose,eyes,ears,mouth,hands,legs;
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
        // TTS Engine

        nose = t1.getText().toString();
        eyes = t2.getText().toString();
        ears = t3.getText().toString();
        mouth = t4.getText().toString();
        hands = t5.getText().toString();
        legs = t6.getText().toString();




//TTS Engine End


        ImageButton i=(ImageButton)view.findViewById(R.id.noser);
        ImageButton j=(ImageButton)view.findViewById(R.id.eyer);
        ImageButton k=(ImageButton)view.findViewById(R.id.earer);
        ImageButton l=(ImageButton)view.findViewById(R.id.mouther);
        ImageButton m=(ImageButton)view.findViewById(R.id.hander);
        ImageButton n=(ImageButton)view.findViewById(R.id.leger);

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartSpeak(nose);
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // jsound.start();
                StartSpeak(eyes);
            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // ksound.start();
                StartSpeak(ears);

            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lsound.start();
                StartSpeak(mouth);

            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartSpeak(hands);

              //  msound.start();
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartSpeak(legs);
                //nsound.start();
            }
        });






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