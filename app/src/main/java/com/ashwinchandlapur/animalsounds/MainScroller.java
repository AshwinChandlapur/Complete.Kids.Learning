package com.ashwinchandlapur.animalsounds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.NativeExpressAdView;



public class MainScroller extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_scroller);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        NativeExpressAdView adView = (NativeExpressAdView)findViewById(R.id.adView);
//
//
//        Bundle extras = new Bundle();
//        extras.putBoolean("is_designed_for_families", true);
//
//       AdRequest request = new AdRequest.Builder()
//               .tagForChildDirectedTreatment(true)
//                //.addTestDevice("E1C583B224120C3BEF4A3DB0177A7A37")
//               .build();
//        adView.loadAd(request);

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
     //   intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
    public void alphabets(View view)
    {
        Intent intent=new Intent(MainScroller.this,alphabet.class);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void animals(View view)
    {
        Intent intent=new Intent(MainScroller.this,ScrollingActivity.class);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void bodyparts(View view)
    {
        Intent intent=new Intent(MainScroller.this,BodyActivity.class);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void numbers(View view)
    {
        Intent intent=new Intent(MainScroller.this,NumberActivity.class);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void flags(View view)
    {
        Intent intent=new Intent(MainScroller.this,FlagsActivity.class);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }


    public void credits(View view)
    {
        Intent intent=new Intent(MainScroller.this,feedbacks.class);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

   /* public void bird(View view)
    {
        Intent intent=new Intent(MainScroller.this,YbirdActivity.class);
        startActivity(intent);
    }

    public void ocean(View view)
    {
        Intent intent=new Intent(MainScroller.this,OceanActivity.class);
        startActivity(intent);
    }
*/





}
