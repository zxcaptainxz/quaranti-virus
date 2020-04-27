package com.example.ceee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setTitle("About us");
    }

    public void goToSupport(View view) {
        Intent i = new Intent(About.this, Support.class);
        startActivity(i);
    }
}
