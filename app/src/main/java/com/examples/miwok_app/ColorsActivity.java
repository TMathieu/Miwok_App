package com.examples.miwok_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
    }

    public void openColorsActivity(View view) {
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }


}
