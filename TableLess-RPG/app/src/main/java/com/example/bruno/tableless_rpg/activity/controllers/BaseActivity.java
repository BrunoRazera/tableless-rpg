package com.example.bruno.tableless_rpg.activity.controllers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.bruno.tableless_rpg.R;

import java.io.File;

public class BaseActivity extends AppCompatActivity{

    public static Intent launchActivity(Context context) {
        Intent intent = new Intent(context, BaseActivity.class);
        return intent;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}
