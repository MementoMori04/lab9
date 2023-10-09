package com.example.a5;

import androidx.appcompat.app.AppCompatActivity;

import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Animation sunRiseAnimation;
    private Animation clockTurnAnim;
    private Animation hourTurnAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image2);
        sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
        imageView.startAnimation(sunRiseAnimation);

        imageView = findViewById(R.id.image4);
        clockTurnAnim = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
        imageView.startAnimation(clockTurnAnim);

        imageView = findViewById(R.id.image5);
        hourTurnAnim = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
        imageView.startAnimation(hourTurnAnim);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restartAnimation();
            }
        });
    }

    private void restartAnimation() {
        if (sunRiseAnimation != null && sunRiseAnimation.hasStarted()) {
            imageView.clearAnimation();
            imageView.startAnimation(sunRiseAnimation);
        }
        if (clockTurnAnim != null && clockTurnAnim.hasStarted()) {
            imageView.clearAnimation();
            imageView.startAnimation(clockTurnAnim);
        }
        if (hourTurnAnim != null && hourTurnAnim.hasStarted()) {
            imageView.clearAnimation();
            imageView.startAnimation(hourTurnAnim);
        }
    }
}