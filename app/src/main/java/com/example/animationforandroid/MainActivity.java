package com.example.animationforandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_main);

        tv = findViewById(R.id.tv);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scalefile);
        tv.startAnimation(animation);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1, 1.4f, 1, 1.4f, 0.5f, 0.5f);
        scaleAnimation.setDuration(1000);
        scaleAnimation.setRepeatCount(4);
        scaleAnimation.setRepeatMode(Animation.REVERSE);
        tv.startAnimation(scaleAnimation);
    }
}
