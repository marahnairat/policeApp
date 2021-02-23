package com.example.policeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button yolobtn;
        yolobtn=findViewById(R.id.yolobtn);
        yolobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
            runYOLOAlgo();
            }

            private void runYOLOAlgo() {
            }
        });
    
}
    }