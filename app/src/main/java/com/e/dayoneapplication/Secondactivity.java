package com.e.dayoneapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Secondactivity extends AppCompatActivity {
     int index=0;
     int[] images=new int[] {R.drawable.image1,R.drawable.images2,R.drawable.image4,R.drawable.lava1};
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
    }
    public void Slide(View view){
         imageView = findViewById(R.id.imageView5);


        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_animation);
        imageView.startAnimation(animation);
        imageView.setImageResource(images[index]);
        index++;


        if (index==images.length){
            index=0;
        }

    }
}

