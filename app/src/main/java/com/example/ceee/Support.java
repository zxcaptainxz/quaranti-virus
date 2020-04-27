package com.example.ceee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Support extends AppCompatActivity {
    Button callMeEgypt;
    Button callMeLebanon;
    Button callMeSaudiArabia;
    Button callMeSyria;
    Button callMeUSA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        if (checkCallPermission()) {
        } else {
            requestCallPermission();
        }
        getSupportActionBar().setTitle("Support");

        callMeEgypt = findViewById(R.id.button_callEgypt);
        callMeLebanon = findViewById(R.id.button_callLebanon);
        callMeSaudiArabia = findViewById(R.id.button_callSaudiArabia);
        callMeSyria = findViewById(R.id.button_callSyria);
        callMeUSA = findViewById(R.id.button_callUSA);
    }


    public void callEgypt(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:20225985555"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        startActivity(intent);
    }public void callLebanon(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:140"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        startActivity(intent);
    }public void callSaudiArabia(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:997"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        startActivity(intent);
    }public void callSyria(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:133"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        startActivity(intent);
    }
    public void callUSA(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:0012023034498"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        startActivity(intent);
    }
    public void visitWHO(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.who.int/emergencies/diseases/novel-coronavirus-2019")));
    }
    private boolean checkCallPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {
            // Permission is not granted
            return false;
        }
        return true;
    }

    private void requestCallPermission() {

        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE}, 30);
    }
}
