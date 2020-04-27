package com.example.ceee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static java.lang.Math.abs;
/*Use Async task for background notification
*Do xp win, make it kind of a game
* we passed the first day!!!!
*Watch out for your watch, or better, watch in...

* */

public class MainActivity extends AppCompatActivity implements SensorEventListener{
private TextView mDetails;
public TextView tipTextView;
private Random random = new Random();
public String[] myTips;
public int i;
private ProgressBar progressBar;
private SensorManager sensorManager;
private final float[] accelerometerReading = new float[3];
private final float[] magnetometerReading = new float[3];
private final float[] rotationMatrix = new float[9];
private final float[] orientationAngles = new float[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Home");

        tipTextView = findViewById(R.id.tip_of_the_day);
        progressBar = findViewById(R.id.progress_bar);
        Resources res = getResources();
        myTips = res.getStringArray(R.array.tips);
        i = random.nextInt(myTips.length);
        tipTextView.setText(myTips[i]);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mDetails = findViewById(R.id.details);

            }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true; }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {     // Handle item selection
        switch (item.getItemId()) {
            case R.id.home_menu:
                return true;
            case R.id.self_test:
                Intent f = new Intent(MainActivity.this, SelfTest.class);
                startActivity(f);
                return true;
            case R.id.FAQ:
                Intent i = new Intent(MainActivity.this, FAQ.class);
                startActivity(i);
                return true;
            case R.id.support:
                Intent q = new Intent(MainActivity.this, Support.class);
                startActivity(q);
                return true;
            case R.id.about_us:
               Intent w = new Intent(MainActivity.this, About.class);
               startActivity(w);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
            @Override
    protected void onStart() {
        super.onStart();
        Sensor accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        if (accelerometer != null) {
            sensorManager.registerListener((SensorEventListener) this, accelerometer,SensorManager.SENSOR_DELAY_NORMAL, SensorManager.SENSOR_DELAY_UI);
        }
        Sensor magneticField = sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        if (magneticField != null) {
            sensorManager.registerListener((SensorEventListener) this, magneticField,SensorManager.SENSOR_DELAY_NORMAL, SensorManager.SENSOR_DELAY_UI);
        }
    }

        @Override
        protected void onStop() {
            super.onStop();
            sensorManager.unregisterListener((SensorEventListener) this);
    }




    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Do something here if sensor accuracy changes.
        // You must implement this callback in your code.
    }
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            System.arraycopy(event.values, 0, accelerometerReading,
                    0, accelerometerReading.length);
            int progress;
            progress=abs(12*(int)accelerometerReading[1]);
            progressBar.getProgressDrawable().setColorFilter(Color.rgb( 255*(100-progress)/100,255*progress/100,0),
                    PorterDuff.Mode.MULTIPLY);

            progressBar.setProgress(progress);
            if(progress <= 50){
                mDetails.setText(R.string.bad_condition);

            }
            else if (progress <= 75)
            {
                mDetails.setText(R.string.average);
            }else mDetails.setText(R.string.optimal);
        } else if (event.sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD) {
            System.arraycopy(event.values, 0, magnetometerReading,
                    0, magnetometerReading.length);
        }
    }
    private ColorStateList colorConvert(int p)
    {
        int[][] states = new int[][] {
                new int[] { android.R.attr.state_enabled}, // enabled
                new int[] {-android.R.attr.state_enabled}, // disabled
                new int[] {-android.R.attr.state_checked}, // unchecked
                new int[] { android.R.attr.state_pressed}  // pressed
        };
        int x = progressBar.getProgress();
        int[] colors = new int[] {
                255,255*(100-x)/100,255*x/100
        };

        ColorStateList myList = new ColorStateList(states, colors);
        return myList;
    }
    public void updateOrientationAngles() {
        // Update rotation matrix, which is needed to update orientation angles.
        SensorManager.getRotationMatrix(rotationMatrix, null,
                accelerometerReading, magnetometerReading);
        SensorManager.getOrientation(rotationMatrix, orientationAngles);

    }
    public void writeTip(View view)
    {
        i = random.nextInt(myTips.length);
        tipTextView.setText(myTips[i]);
    }

    public void access_detail(View view) {
        Intent i = new Intent(MainActivity.this, DetailActivity.class);
        startActivity(i);
    }
}
