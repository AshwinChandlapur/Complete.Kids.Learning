package com.ashwinchandlapur.animalsounds;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

import com.onesignal.OSNotification;
import com.onesignal.OSNotificationAction;
import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;

import org.json.JSONObject;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //OneSignal.startInit(this).init();
        OneSignal.startInit(this)
                .setNotificationOpenedHandler(new ExampleNotificationOpenedHandler())
                .init();

        // Call syncHashedEmail anywhere in your app if you have the user's email.
        // This improves the effectiveness of OneSignal's "best-time" notification scheduling feature.
        // OneSignal.syncHashedEmail(userEmail);
    }


    class ExampleNotificationReceivedHandler implements OneSignal.NotificationReceivedHandler {
        @Override
        public void notificationReceived(OSNotification notification) {
            JSONObject data = notification.payload.additionalData;
            String bigText;
            String imgUrl;

            if (data != null) {
                bigText = data.optString("bigText", null);
                imgUrl = data.optString("imgUrl",null);
                if(bigText!=null && imgUrl!=null) {
                    Intent intent = new Intent(getApplicationContext(), oneSignal.class);
                    intent.putExtra("bigText", bigText);
                    intent.putExtra("imgUrl", imgUrl);
                    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if (bigText != null)
                    Log.i("OneSignalExample", "customkey set with value: " + bigText);
                if (imgUrl != null)
                    Log.i("OneSignalExample", "customkey set with value: " + imgUrl);
                data.remove(bigText);//This is mandatory, because the Old JSON data will still be stored that causes error while opening newest notification
                data.remove(imgUrl);//
            }

        }
    }



    private class ExampleNotificationOpenedHandler implements OneSignal.NotificationOpenedHandler {
        // This fires when a notification is opened by tapping on it.
        @Override
        public void notificationOpened(OSNotificationOpenResult result) {
            OSNotificationAction.ActionType actionType = result.action.type;
            JSONObject data = result.notification.payload.additionalData;
            String bigText;
            String imgUrl;

            if (data != null) {
                bigText = data.optString("bigText", null);
                imgUrl = data.optString("imgUrl",null);
                if(bigText!=null && imgUrl!=null) {
                    Intent intent = new Intent(getApplicationContext(), oneSignal.class);
                    intent.putExtra("bigText", bigText);
                    intent.putExtra("imgUrl", imgUrl);
                    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                if (bigText != null)
                    Log.i("OneSignalExample", "customkey set with value: " + bigText);
                if (imgUrl != null)
                    Log.i("OneSignalExample", "customkey set with value: " + imgUrl);
                data.remove(bigText);//This is mandatory, because the Old JSON data will still be stored that causes error while opening newest notification
                data.remove(imgUrl);//
            }

        }
    }
}