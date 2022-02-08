package com.example.intenttask3java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews() {
        Button buttonSend = findViewById(R.id.btn_send);
        User user = new User("Kamron", "Qobilov");

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity(user);
            }
        });
    }

    void openDetailActivity(User user) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }
}