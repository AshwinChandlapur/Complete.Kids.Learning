package com.ashwinchandlapur.animalsounds;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.rm.freedraw.FreeDrawView;
import com.rm.freedraw.PathDrawnListener;
import com.rm.freedraw.PathRedoUndoCountChangeListener;
import com.rm.freedraw.ResizeBehaviour;

import java.util.Locale;

import petrov.kristiyan.colorpicker.ColorPicker;


public class z extends Fragment {
    TextView t;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    FreeDrawView mSignatureView;
    TextToSpeech tts;
    ColorPicker colorPicker;
    //private static final String TAG = "FirstFragment";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_z, container, false);


        ImageButton btn=(ImageButton)view.findViewById(R.id.btno1);
        ImageButton btn1=(ImageButton)view.findViewById(R.id.btn1o1);
        ImageButton home=(ImageButton)view.findViewById(R.id.home);
        // Button btn = (Button) view.findViewById(R.id.btn);


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




        t=(TextView)view.findViewById(R.id.tv);

        Typeface myFont = Typeface.createFromAsset(getActivity().getAssets(),"fonts/Kaushan.otf");
        t.setTypeface(myFont);


        // TTS Engine
        String toSpeak = t.getText().toString();
        //Toast.makeText(getActivity().getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
        StartSpeak(toSpeak);
        //TTS Engine End


//Free Draw View

        mSignatureView = (FreeDrawView) view.findViewById(R.id.your_id);

        // Setup the View
        mSignatureView.setPaintColor(Color.BLACK);
        mSignatureView.setPaintWidthPx(getResources().getDimensionPixelSize(R.dimen.paint_width));
        //mSignatureView.setPaintWidthPx(12);
        mSignatureView.setPaintWidthDp(getResources().getDimension(R.dimen.paint_width));
        //mSignatureView.setPaintWidthDp(6);
        mSignatureView.setPaintAlpha(255);// from 0 to 255
        mSignatureView.setResizeBehaviour(ResizeBehaviour.CROP);// Must be one of ResizeBehaviour
        // values;

        // This listener will be notified every time the path done and undone count changes
        mSignatureView.setPathRedoUndoCountChangeListener(new PathRedoUndoCountChangeListener() {
            @Override
            public void onUndoCountChanged(int undoCount) {
                // The undoCount is the number of the paths that can be undone
            }

            @Override
            public void onRedoCountChanged(int redoCount) {
                // The redoCount is the number of path removed that can be redrawn
            }
        });
        // This listener will be notified every time a new path has been drawn
        mSignatureView.setOnPathDrawnListener(new PathDrawnListener() {
            @Override
            public void onNewPathDrawn() {

            }
        });

        // This will take a screenshot of the current drawn content of the view
        mSignatureView.getDrawScreenshot(new FreeDrawView.DrawCreatorListener() {
            @Override
            public void onDrawCreated(Bitmap draw) {
                // The draw Bitmap is the drawn content of the View
            }

            @Override
            public void onDrawCreationError() {
                // Something went wrong creating the bitmap, should never
                // happen unless the async task has been canceled
            }
        });

        Button mBtnUndo = (Button) view.findViewById(R.id.btn_undo);
        Button mBtnRedo = (Button) view.findViewById(R.id.btn_redo);
        Button mBtnRandomColor = (Button) view.findViewById(R.id.btn_color);
        mBtnUndo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mSignatureView.undoLast();
            }
        });
        mBtnRedo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mSignatureView.redoLast();
            }
        });
        mBtnRandomColor.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor();
            }
        });
        //FreeDraw view Code ends here
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction trans = getFragmentManager()
                        .beginTransaction();
				/*
				 * IMPORTANT: We use the "root frame" defined in
				 * "root_fragment.xml" as the reference to replace fragment
				 */
                trans.replace(R.id.root_frameo, new a());
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
                trans.replace(R.id.root_frameo, new y());
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
    public void changeColor() {

        colorPicker = new petrov.kristiyan.colorpicker.ColorPicker(getActivity());
        colorPicker.show();
        colorPicker.setOnChooseColorListener(new petrov.kristiyan.colorpicker.ColorPicker.OnChooseColorListener() {
            @Override
            public void onChooseColor(int position, int color) {
                mSignatureView.setPaintColor(color);
            }

            @Override
            public void onCancel() {
                colorPicker.dismissDialog();
            }
        });


        //  colorPicker.show();

        // Random rnd = new Random();
        // int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        // mSignatureView.setPaintColor(color);
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
        tts.speak("Z for Zebra", TextToSpeech.QUEUE_FLUSH, null);
    }

}