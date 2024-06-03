package com.example.jharkhandquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void main_btn(View view) {

        int View = view.getId();

        if (View ==  R.id.btn_play)
        {
            startActivity(new Intent(MainActivity.this,playActivity.class));
        } else if (View == R.id.btn_setting) {
            startActivity(new Intent(MainActivity.this , settingActivity.class));
        } else if (View == R.id.btn_exit) {
            this.finishAffinity();
        }

    }
}