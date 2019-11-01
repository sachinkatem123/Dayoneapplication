package com.e.dayoneapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.VolumeShaper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wellcomeactivity extends AppCompatActivity {
    Button show_images,show_sliders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcomeactivity);

        show_images=findViewById(R.id.show_image);
        show_sliders=findViewById(R.id.image_slider);


        show_images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent images=new Intent(Wellcomeactivity.this,Secondactivity.class);
                startActivity(images);
            }
        });


        show_sliders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent images=new Intent(Wellcomeactivity.this,Dayoneimage.class);
                startActivity(images);
            }
        });

    }


}
