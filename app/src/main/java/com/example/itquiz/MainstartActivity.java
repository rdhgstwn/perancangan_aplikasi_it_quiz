package com.example.itquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainstartActivity extends AppCompatActivity {
    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainstart);

        start = (Button) findViewById(R.id.btn_start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DashboardActivity();
            }
        });
    }
    public void DashboardActivity() {
        Intent intent = new Intent(MainstartActivity.this, DashboardActivity.class);
        startActivity(intent);
    }
}