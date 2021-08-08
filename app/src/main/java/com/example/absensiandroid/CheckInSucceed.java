package com.example.absensiandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CheckInSucceed extends AppCompatActivity {
    public Button btnDone;
    public TextView tvGeotag;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in_succeed);
        tvGeotag = findViewById(R.id.tv_geotag);
        btnDone = findViewById(R.id.btn_done);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CheckInSucceed.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
