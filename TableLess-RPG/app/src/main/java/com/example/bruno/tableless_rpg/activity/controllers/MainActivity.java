package com.example.bruno.tableless_rpg.activity.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bruno.tableless_rpg.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.charInfo);

        View.OnClickListener listnr = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(MainActivity.this, CharacterActivity.class);
                //MainActivity.this.startActivity(i);

                startActivity(CharacterActivity.launchActivity(MainActivity.this));
            }
        };
        assert btn != null;
        btn.setOnClickListener(listnr);
    }


}