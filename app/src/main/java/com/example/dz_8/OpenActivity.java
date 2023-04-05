package com.example.dz_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OpenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);
        String open = getIntent().getStringExtra("key1");
        TextView textView = findViewById(R.id.current);
        textView.setText(open);
    }
}