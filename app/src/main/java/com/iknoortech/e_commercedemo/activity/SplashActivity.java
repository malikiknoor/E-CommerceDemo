package com.iknoortech.e_commercedemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.iknoortech.e_commercedemo.R;
import com.iknoortech.e_commercedemo.utils.AppUtils;

import static com.iknoortech.e_commercedemo.utils.AppUtils.isInternetAvailable;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView imageView = findViewById(R.id.imageView5);
        AppUtils.getNewFirebaseToken(this);

        Animation leftToRight = AnimationUtils
                .loadAnimation(this, R.anim.fade_in);
        imageView.setAnimation(leftToRight);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                finish();
            }
        }, 1500);

    }

    @Override
    protected void onResume() {
        super.onResume();
        if(!isInternetAvailable(this)){
            Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
        }
    }
}
