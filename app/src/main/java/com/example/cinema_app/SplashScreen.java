package com.example.cinema_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.cinema_app.ui.login.LoginActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Thread background = new Thread() {
            public void run() {
                try {
                    // Thread will sleep for 5 seconds
                    sleep(1*1000);

                    // After 5 seconds redirect to another intent
                    Intent i=new Intent(getBaseContext(), LoginActivity.class);
                    startActivity(i);

                    //Remove activity
                    finish();
                } catch (Exception e) {
                }
            }
        };
        // start thread
        background.start();


    }
}