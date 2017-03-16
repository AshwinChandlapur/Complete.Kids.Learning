package com.ashwinchandlapur.animalsounds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class MainScroller extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_scroller);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



//Toggle notification button
       // ToggleButton toggle = (ToggleButton) findViewById(R.id.toggle);
//Set checked status
      //  toggle.setChecked(Pushbots.sharedInstance().isNotificationEnabled());
       // toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
         //   public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
       //         Pushbots.sharedInstance().toggleNotifications(isChecked);
      //      }
       // });

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
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
