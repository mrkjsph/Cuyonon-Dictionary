package com.example.cuyo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class aboutCuyo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_cuyo);
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view -> openMainActivity());
    }

    private void openMainActivity() {
        Intent intent = new Intent(aboutCuyo.this,MainActivity2.class);
        startActivity(intent);
    }

}