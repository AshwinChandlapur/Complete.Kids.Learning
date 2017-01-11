package com.ashwinchandlapur.animalsounds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.google.android.gms.ads.InterstitialAd;


public class NumberActivity extends AppCompatActivity {
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    // For this example, only two pages
    static final int NUM_ITEMS = 1;

    ViewPager mPager;
    SlidePagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar AB = getSupportActionBar();
        AB.hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //  this.supportrequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.number_activity);





		/* Instantiate a ViewPager and a PagerAdapter. */
        mPager = (ViewPager) findViewById(R.id.pagerno);
        mPagerAdapter = new SlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);

    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(NumberActivity.this,MainScroller.class);
      //  intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    /*  @Override
      public boolean onKeyDown(int keyCode, KeyEvent event)
      {
          if ((keyCode == KeyEvent.KEYCODE_BACK))
          {
              finish();
          }
          return super.onKeyDown(keyCode, event);
      }*/
    /* PagerAdapter class */
    public class SlidePagerAdapter extends FragmentPagerAdapter {
        public SlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
			/*
			 * IMPORTANT: This is the point. We create a RootFragment acting as
			 * a container for other fragments
			 */
            if (position == 0)
                return new NumberrootFragment();
            else
                return new StaticFragment();

        }

        @Override
        public int getCount() {
            return 1;
        }
    }
   /* public void home(View v)
    {
        Intent intent=new Intent(OceanActivity.this,ScrollingActivity.class);
        startActivity(intent);
    }*/
}
