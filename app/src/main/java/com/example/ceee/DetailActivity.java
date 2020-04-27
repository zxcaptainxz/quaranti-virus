package com.example.ceee;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
private TextView mTemperature;
private TextView mPressure;
private TextView mWarning;
private String tempWarning;
private String pressWarning;

//although we don't yet have readings of temperature and pressure, this procedure is just a prototype
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setTitle("Health details");
        mTemperature = findViewById(R.id.value_temperature);
        mPressure = findViewById(R.id.value_pressure);
        mWarning = findViewById(R.id.text_warning);
        float a = Float.parseFloat(mTemperature.getText().toString());
        float b = Float.parseFloat(mPressure.getText().toString());
        mTemperature.setTextColor(tempColor(a));
        mPressure.setTextColor(pressureColor(b));
        mWarning.setText(tempWarning + " and " + pressWarning + getString(R.string.reconciliation1));
    }

    private int tempColor(float temperature)
    {
        int c;
        c=Color.RED;
        tempWarning = "Your body temperature is scaringly high.";
        if(temperature<37.5&&temperature>36.5)
        {c=Color.GREEN;
        tempWarning = "Your body temperature is perfect.";
        }
        else if(temperature<38.5&&temperature>=37.5)
        {
            c=Color.YELLOW;
            tempWarning = "Your body temperature seems suspicious, maybe from workout";
        }




        return c;

    }
    private int pressureColor(float pressure)
    {
        int c;
        c=Color.RED;
        pressWarning = "Your blood pressure is dangerous.";
        if(pressure<12&&pressure>9)
        {
            c=Color.GREEN;
            pressWarning = "Your blood pressure is perfect.";
        }
        else if((pressure<9&&pressure>7.5)||(pressure>12&&pressure<15)) {
            c = Color.YELLOW;
            pressWarning = "Your body pressure is a bit worrying.";
        }
        return c;
    }

}
