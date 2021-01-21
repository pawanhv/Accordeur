package com.pavan.accordeur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class GuitarTunerActivity extends AppCompatActivity {
    public static Intent newIntent(final Context context) {
        return new Intent(context, GuitarTunerActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar_tuner);
    }
}