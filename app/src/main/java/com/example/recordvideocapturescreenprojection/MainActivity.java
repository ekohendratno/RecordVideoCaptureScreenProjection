package com.example.recordvideocapturescreenprojection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.a).setOnClickListener(v->{
            startActivity(new Intent(this,ScreenCaptureActivity.class));
        });

        findViewById(R.id.b).setOnClickListener(v->{
            startActivity(new Intent(this,ScreenRecordActivity.class));
        });
    }
}