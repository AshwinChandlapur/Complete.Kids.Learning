package com.ashwinchandlapur.animalsounds;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.OSNotificationAction;
import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;

import org.json.JSONObject;


public class SplasherActivity extends AppCompatActivity {

    TextView t, t1;
    private FirebaseAnalytics mFirebaseAnalytics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splasher);
        OneSignal.startInit(this)
                .setNotificationOpenedHandler(new ExampleNotificationOpenedHandler())
                .init();

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
       // Pushbots.sharedInstance().registerForRemoteNotifications();
        //Pushbots.sharedInstance().setAlias("ashwin");
       // Pushbots.sharedInstance().setCustomHandler(CustomHandler.class);

        //Pushbots.sharedInstance().init(this);
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.move_up);
        ImageView img=(ImageView)findViewById(R.id.logo);
        img.setAnimation(anim);


      //  t = (TextView) findViewById(R.id.tv);
      //  t1 = (TextView) findViewById(R.id.tvs);


        /*final SharedPreferences sharedPreferences = getSharedPreferences("FeedbackSettings", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putInt("nameSet", 0);
        editor.commit();*/


       // Typeface myFont = Typeface.createFromAsset(this.getAssets(), "fonts/Kaushan.otf" );
        // t.setTypeface(myFont);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplasherActivity.this, MainScroller.class);
                  intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                SplasherActivity.this.finish();
            }
        }, 1700);


    }

    private class ExampleNotificationOpenedHandler implements OneSignal.NotificationOpenedHandler {
        // This fires when a notification is opened by tapping on it.
        @Override
        public void notificationOpened(OSNotificationOpenResult result) {
            OSNotificationAction.ActionType actionType = result.action.type;
            JSONObject data = result.notification.payload.additionalData;
            String bigText;
            // bigText = data.optString("bigText", null);
            String imgUrl;
            //imgUrl = data.optString("imgUrl",null);

            if (data != null) {
                bigText = data.optString("bigText", null);
                imgUrl = data.optString("imgUrl",null);
                Intent intent = new Intent(getApplicationContext(), oneSignal.class);
                intent.putExtra("bigText", bigText);
                intent.putExtra("imgUrl", imgUrl);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                if (bigText != null)
                    Log.i("OneSignalExample", "customkey set with value: " + bigText);
                if (imgUrl != null)
                    Log.i("OneSignalExample", "customkey set with value: " + imgUrl);
                data.remove(bigText);//This is mandatory, because the Old JSON data will still be stored that causes error while opening newest notification
                data.remove(imgUrl);//
            }

            if (actionType == OSNotificationAction.ActionType.ActionTaken)
                Log.i("OneSignalExample", "Button pressed with id: " + result.action.actionID);

            // The following can be used to open an Activity of your choice.



            // Add the following to your AndroidManifest.xml to prevent the launching of your main Activity
            //  if you are calling startActivity above.
         /*
            <application ...>
              <meta-data android:name="com.onesignal.NotificationOpened.DEFAULT" android:value="DISABLE" />
            </application>
         */
        }
    }




}
