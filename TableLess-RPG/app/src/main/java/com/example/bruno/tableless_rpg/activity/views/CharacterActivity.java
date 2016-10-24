package com.example.bruno.tableless_rpg.activity.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.bruno.tableless_rpg.R;

public class CharacterActivity extends AppCompatActivity {

    public static Intent launchActivity(Context context, String characterId) {
        Intent intent = new Intent(context, CharacterActivity.class);
        intent.putExtra("charId", characterId);
        return intent;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
    }
}
