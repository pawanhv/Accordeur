package com.pavan.accordeur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class PermissionActivity extends AppCompatActivity {
    public static Intent newIntent(final Context context) {
        return new Intent(context, PermissionActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission);
    }
}