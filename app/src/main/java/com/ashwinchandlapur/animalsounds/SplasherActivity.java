package com.ashwinchandlapur.animalsounds;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.pushbots.push.Pushbots;


public class SplasherActivity extends AppCompatActivity {

    TextView t, t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splasher);

        Pushbots.sharedInstance().init(this);
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.move_up);
        ImageView img=(ImageView)findViewById(R.id.logo);
        img.setAnimation(anim);


      //  t = (TextView) findViewById(R.id.tv);
      //  t1 = (TextView) findViewById(R.id.tvs);


        final SharedPreferences sharedPreferences = getSharedPreferences("FeedbackSettings", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putInt("nameSet", 0);
        editor.commit();


        Typeface myFont = Typeface.createFromAsset(this.getAssets(), "fonts/Kaushan.otf" );
       // t.setTypeface(myFont);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplasherActivity.this, MainScroller.class);
              //  intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                SplasherActivity.this.finish();
            }
        }, 2500);


    }

}
