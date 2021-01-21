package com.pavan.accordeur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    private static final int RECORD_AUDIO_PERMISSION_REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // There is no layout to inflate for this screen.
        // The layout is the Activity Theme's background drawable attribute.
        // So, simply check if the user has granted permissions or not and send
        // them to the correct Activity.
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED) {
            // Permission was already granted so go to the main Guitar Tuner Activity
            startActivity(GuitarTunerActivity.newIntent(this));
        } else {
            // Permission was not granted so go to the Permission Activity
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO}, RECORD_AUDIO_PERMISSION_REQUEST_CODE);
            startActivity(GuitarTunerActivity.newIntent(this));
            finish();
        }

        // Finish this Activity so it doesn't appear in the back stack
        finish();
    }
}