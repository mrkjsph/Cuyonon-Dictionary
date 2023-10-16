package com.example.cuyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class alphabet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(view -> openMainActivity());

    }

    private void openMainActivity() {
        Intent intent = new Intent(alphabet.this,MainActivity2.class);
        startActivity(intent);
    }
}