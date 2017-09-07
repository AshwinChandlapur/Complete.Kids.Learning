package com.ashwinchandlapur.animalsounds;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.NativeExpressAdView;
import com.squareup.picasso.Picasso;


public class NotifHandler extends AppCompatActivity {


    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    ImageView imgView;
    String sr,messageTitle,savesd;
    String storage = ".jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_general);



        Typeface myFont = Typeface.createFromAsset(this.getAssets(),"fonts/Kaushan.otf");
        TextView heading=(TextView)findViewById(R.id.heading);
        heading.setTypeface(myFont);
        Button feedback=(Button)findViewById(R.id.feedback) ;


        NativeExpressAdView adView = (NativeExpressAdView)findViewById(R.id.adView);

        AdRequest request = new AdRequest.Builder()
                .tagForChildDirectedTreatment(true)
                .build();
        adView.loadAd(request);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //interstial ad space
                Bundle extras = new Bundle();
                extras.putBoolean("is_designed_for_families", true);

                AdRequest adRequests = new AdRequest.Builder()
                        .tagForChildDirectedTreatment(true)
                        .build();
                // Prepare the Interstitial Ad
                interstitial = new InterstitialAd(NotifHandler.this);
// Insert the Ad Unit ID
                interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
                interstitial.loadAd(adRequests);
// Prepare an Interstitial Ad Listener
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
// Call displayInterstitial() function
                        displayInterstitial();
                    }
                });
//interstital finished
                //Do something after 100ms
            }
        }, 6789);
        final MaterialStyledDialog dialogHeader_1 = new MaterialStyledDialog(this)
                .setIcon(R.mipmap.ic_launcher)
                .withDialogAnimation(true)
                .setTitle("Awesome!")
                .setDescription("Glad to see you liked Kids Complete Learning! Your 5 Star Rating will help us Serve Better.")
                .setHeaderColor(R.color.colorPrimary)
                .setPositive("Give Us a Five", new MaterialDialog.SingleButtonCallback() {

                    @Override
                    public void onClick(MaterialDialog dialog, DialogAction which) {
                        final String appPackageName = getPackageName();
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                        } catch (android.content.ActivityNotFoundException anfe) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                        }
                    }
                })
                .setNegative("Suggestions", new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(MaterialDialog dialog, DialogAction which) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "ashwinchandlapur@gmail.com"));
                        startActivity(intent);
                        dialog.dismiss();
                    }
                })
                .build();


        Bundle extras = getIntent().getExtras();

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogHeader_1.show();
            }
        });

        // extras.getString("imgUrl");
        if (null != extras && getIntent().getExtras().containsKey("message") || getIntent().getExtras().containsKey("bigPicture")
                ||getIntent().getExtras().containsKey("bigText")
                ) {
            TextView message = (TextView) findViewById(R.id.message);
            message.setTypeface(myFont);
            message.setText(extras.getString("bigText"));
            imgView=(ImageView)findViewById(R.id.imgView);
            sr= extras.getString("bigPicture");
            Picasso.with(this).load(sr).into(imgView);
            messageTitle = extras.getString("message");
            //imgUrl.setText(extras.getString("imgUrl"));
            // Picasso.with(this).load(String.valueOf(imgUrl)).into(imgView);}
        }

        savesd=messageTitle+storage;
        //Download Images

       /* BitmapDrawable drawable = (BitmapDrawable) imgView.getDrawable();
        Bitmap bitmap = drawable.getBitmap();
        File sdCardDirectory = new File("/sdcard/KidsLearning/");
        sdCardDirectory.mkdirs();
        //File sdCardDirectory = Environment.getExternalStorageDirectory();
        File image = new File(sdCardDirectory, savesd);
        MediaScannerConnection.scanFile(this, new String[] { image.getPath() }, new String[] { "image/jpeg" }, null);
        boolean success = false;

        // Encode the file as a PNG image.
        FileOutputStream outStream;
        try {

            outStream = new FileOutputStream(image);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outStream);


            outStream.flush();
            outStream.close();
            success = true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }if (success) {
            Toast.makeText(getApplicationContext(), "Image saved with success",
                    Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(),
                    "Error during image saving", Toast.LENGTH_LONG).show();
        }
*/
        //Download Images Code  ends here

    }

    void displayInterstitial(){
        if (interstitial.isLoaded()  ) {
            interstitial.show();
        }
    }
}