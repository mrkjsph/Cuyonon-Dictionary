package com.example.cuyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> opentagphrase());

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(view -> opentagphrase2());

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(view -> openemergency());

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view -> openMainActivity2());

    }

    private void openemergency() {
        Intent intent = new Intent(category.this,emergency.class);
        startActivity(intent);
    }

    private void opentagphrase2() {
        Intent intent = new Intent(category.this,tagphrase2.class);
        startActivity(intent);
    }

    private void opentagphrase() {
        Intent intent = new Intent(category.this,tagphrase.class);
        startActivity(intent);
    }

    private void openMainActivity2() {
        Intent intent = new Intent(category.this,MainActivity2.class);
        startActivity(intent);
    }
}