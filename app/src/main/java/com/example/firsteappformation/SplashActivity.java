package com.example.firsteappformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        linearLayout=(LinearLayout)findViewById(R.id.latoutSplashId);
        linearLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent splashintent=new Intent(this,MainActivity.class);
        startActivity(splashintent);
    }
}
