package com.example.shbash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeviceActivity extends AppCompatActivity {

    Button blagBtn, vneshBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);

        blagBtn = findViewById(R.id.blagBtn);
        vneshBtn = findViewById(R.id.vneshBtn);

        blagBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DeviceActivity.this, VidActivity.class));
            }
        });

    }
}