package com.example.javie.foxapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class SplashScreenAtivity extends AppCompatActivity {

    TextView txtfadein;
    private final int DURACION_SPLASH = 3000;
    private final int DURACION = 1000;
    private final int TIEMPO_DESPUES = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);

        txtfadein = findViewById(R.id.tvTitle);


        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
        fadeIn.setDuration(DURACION);
        fadeIn.setStartOffset(TIEMPO_DESPUES);
        fadeIn.setFillAfter(true);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        txtfadein.startAnimation(fadeIn);
        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(SplashScreenAtivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}
