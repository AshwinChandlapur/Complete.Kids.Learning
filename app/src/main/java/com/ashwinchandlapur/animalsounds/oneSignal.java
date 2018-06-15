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

import com.squareup.picasso.Picasso;

public class oneSignal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_signal);


        Typeface myFont = Typeface.createFromAsset(this.getAssets(), "fonts/quicksand.otf");
        Button feedback=(Button)findViewById(R.id.feedback) ;
        ImageView imageView =(ImageView)findViewById(R.id.imgView);
        TextView textView = (TextView)findViewById(R.id.message);
        textView.setTypeface(myFont);
        Intent intent = getIntent();
        String bigText = intent.getExtras().getString("bigText");
        textView.setText(bigText);

        String imgUrl = intent.getExtras().getString("imgUrl");
        Picasso.with(this).load(imgUrl).into(imageView);

        final MaterialStyledDialog dialogHeader_1 = new MaterialStyledDialog.Builder(this)
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
                        intent.putExtra(Intent.EXTRA_SUBJECT, "Kids Complete Learning Feedback");
                        startActivity(intent);
                        dialog.dismiss();
                    }
                })
                .build();

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogHeader_1.show();
            }
        });

    }

}