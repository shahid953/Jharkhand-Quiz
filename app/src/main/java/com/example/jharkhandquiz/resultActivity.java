package com.example.jharkhandquiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;




    public class resultActivity extends AppCompatActivity {

        TextView textView ;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_result);
            textView = findViewById(R.id.textView);
            int score = getIntent().getIntExtra("Result",0);
            textView.setText("Score : " + score);

            findViewById(R.id.btn_restart).setOnClickListener(
                    restart->{
                        Intent intent  = new Intent(resultActivity .this , MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
            );
        }
    }

