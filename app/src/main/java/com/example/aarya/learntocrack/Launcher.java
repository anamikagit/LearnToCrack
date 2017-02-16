package com.example.aarya.learntocrack;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Launcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

       new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Launcher.this,MainActivity.class);
                Launcher.this.startActivity(i);
                Launcher.this.finish();
            }
        },5000);

      /* new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                                final Intent mainIntent = new Intent(Launcher.this, MainActivity.class);
                                Launcher.this.startActivity(mainIntent);
                                Launcher.this.finish();
                            }
                 }, 5000);*/

    }
}