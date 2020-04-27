package com.example.ceee;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class SelfTest extends AppCompatActivity {
    private int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_test);
        getSupportActionBar().setTitle("Test yourself");
        ageText=findViewById(R.id.age);
        maleRadio=findViewById(R.id.male);
        femaleRadio=findViewById((R.id.female));
        feverBox=findViewById(R.id.fever);
        coughBox=findViewById(R.id.cough);
        sobBox=findViewById(R.id.sob);
        nauseaBox=findViewById(R.id.nausea);
        runnyBox=findViewById(R.id.runny);
        travelBox=findViewById(R.id.travel);
        contactBox=findViewById(R.id.contact);
    }
    public EditText ageText;
    public RadioButton maleRadio;
    public RadioButton femaleRadio;
    public CheckBox feverBox;
    public CheckBox coughBox;
    public CheckBox sobBox;
    public CheckBox nauseaBox;
    public CheckBox runnyBox;
    public CheckBox travelBox;
    public CheckBox contactBox;

    public void execClicked(View view) {
        if(ageText.getText().toString().trim().length()==0)
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Please enter your age first!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            if((Integer.parseInt(ageText.getText().toString())>50))
            {
                score+=5;
            }
            if(maleRadio.isChecked())
            {
                score+=5;
            }
            if(feverBox.isChecked())
            {
                score+=50;
            }
            if(coughBox.isChecked())
            {
                score+=15;
            }
            if(runnyBox.isChecked())
            {
                score+=10;
            }
            if(sobBox.isChecked())
            {
                score+=10;
            }
            if(nauseaBox.isChecked())
            {
                score+=15;
            }
            if(travelBox.isChecked())
            {
                score+=50;
            }
            if(contactBox.isChecked())
            {
                score+=50;
            }
            if(score<100)
            {

                AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
                builder1.setTitle("No need to worry!");
                builder1.setMessage("You are probably safe for now!");
                builder1.setCancelable(true);
                builder1.setNeutralButton(android.R.string.ok,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                startActivity(new Intent(SelfTest.this, MainActivity.class));
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();

            }
            else if(score<150)
            {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
                builder1.setTitle("Alert!");
                builder1.setMessage("You should probably test yourself for COVID-19!");
                builder1.setCancelable(true);
                builder1.setNeutralButton(android.R.string.ok,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                startActivity(new Intent(SelfTest.this, MainActivity.class));
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();

            }else {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("It is very likely that you will be diagnosed with COVID-19, should we redirect you to the support page to call for help?");
                alertDialogBuilder.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                startActivity(new Intent(SelfTest.this, Support.class));
                            }
                        });

                alertDialogBuilder.setNegativeButton("NO",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(SelfTest.this, "Please do not ignore your symptoms, get tested as soon as possible!", Toast.LENGTH_LONG).show();

                        startActivity(new Intent(SelfTest.this, MainActivity.class));
                    }

                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

        }
        score=0;
    }
}