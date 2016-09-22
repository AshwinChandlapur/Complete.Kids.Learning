package com.ashwinchandlapur.animalsounds;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;


public class feedbacks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar AB = getSupportActionBar();
        AB.hide();
       // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_feedbacks);


        final MaterialStyledDialog dialogHeader_2 = new MaterialStyledDialog(this)
                .setIcon(R.mipmap.ic_launcher)
                .withIconAnimation(true)
                .setDescription("What can we improve? Your feedback is always welcome.")
                .setHeaderColor(R.color.colorAccent)
                .setPositive("Feedback", new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(MaterialDialog dialog, DialogAction which) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "ashwinchandlapur@gmail.com"));
                        startActivity(intent);
                    }
                })
                .setNegative("Not now", new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(MaterialDialog dialog, DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .build();

        final MaterialStyledDialog dialogHeader_1 = new MaterialStyledDialog(this)
                .setIcon(R.mipmap.ic_launcher)
                .withDialogAnimation(true)
                .setTitle("Awesome!")
                .setDescription("Glad to see you like Kids Complete Learning")
                .setHeaderColor(R.color.colorgreen)
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
                .setNegative("Later", new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(MaterialDialog dialog, DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .build();

        Button butt=(Button)findViewById(R.id.feed);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogHeader_2.show();
            }
        });

        Button butts=(Button)findViewById(R.id.rate);
        butts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogHeader_1.show();
            }
        });

        TextView t=(TextView)findViewById(R.id.tv);
        TextView t1=(TextView)findViewById(R.id.tv1);
        TextView t4=(TextView)findViewById(R.id.tv2);
        TextView t2=(TextView)findViewById(R.id.support);
        TextView t3=(TextView)findViewById(R.id.keep);
        TextView t5=(TextView)findViewById(R.id.ourusers);
        Typeface myFont = Typeface.createFromAsset(this.getAssets(),"fonts/Kaushan.otf");
        t.setTypeface(myFont);
        t1.setTypeface(myFont);
        t2.setTypeface(myFont);
        t3.setTypeface(myFont);
        t4.setTypeface(myFont);
        t5.setTypeface(myFont);
    

    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(feedbacks.this,MainScroller.class);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void freepik(View view) {
        String url = "http://www.freepik.com/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void flaticon(View view) {
        String url = "http://www.flaticon.com/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void pixabay(View view) {
        String url = "https://pixabay.com/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
