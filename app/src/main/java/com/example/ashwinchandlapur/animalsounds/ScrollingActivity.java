package com.example.ashwinchandlapur.animalsounds;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




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
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void pets(View view)
    {
        Intent intent=new Intent(ScrollingActivity.this,PetActivity.class);
        startActivity(intent);
    }

    public void wild(View view)
    {
        Intent intent=new Intent(ScrollingActivity.this,WildActivity.class);
        startActivity(intent);
    }

   public void farm(View view)
    {
        Intent intent=new Intent(ScrollingActivity.this,XarmActivity.class);
        startActivity(intent);
    }

    public void bird(View view)
    {
        Intent intent=new Intent(ScrollingActivity.this,YbirdActivity.class);
        startActivity(intent);
    }






}
