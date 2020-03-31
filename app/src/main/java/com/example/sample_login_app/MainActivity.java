package com.example.sample_login_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sample_login_app.Dhaka.dashboard_dhaka;
import com.example.sample_login_app.Login_and_signup.Login;
import com.example.sample_login_app.nevigation_ui.home.HomeFragment;

public class MainActivity extends AppCompatActivity {
    private ImageView Image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Image= (ImageView) findViewById(R.id.imageLogo);

        Animation anime= AnimationUtils.loadAnimation(this,R.anim.splash);

        Image.startAnimation(anime);

        final Intent intent=new Intent(MainActivity.this, Login.class);

        Thread timer=new Thread(){
            public void run(){
                try{

                    sleep(5000);
                }catch (InterruptedException e){

                    e.printStackTrace();
                }

                finally {
                    startActivity(intent);
                    finish();
                }
            }

        };
        timer.start();

    }
    }

