package com.example.intenttask3java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();
    }

    void initViews() {

        TextView textView = findViewById(R.id.tv_detail);

        User user = getIntent().getParcelableExtra("user");
        textView.setText(user.toString());
    }
}