package com.ashwinchandlapur.animalsounds;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class BodymaActivity extends AppCompatActivity {

    CarouselView carouselView;

    int[] sampleImages = {R.drawable.bodyname, R.drawable.bodyname, R.drawable.frog, R.drawable.cat, R.drawable.dog};
    int[] sampleSounds={R.raw.hair,R.raw.eyebrows,R.raw.nose,R.raw.mouth,R.raw.eyes};
    MediaPlayer m = MediaPlayer.create(this, sampleSounds[0]);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyma);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
      //  MediaPlayer mp = MediaPlayer.create(BodymaActivity.this, sampleSounds[sampleSounds.length-1]);
        carouselView.setImageListener(imageListener);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);


        }
    };

}