package com.example.cuyo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button2 = findViewById(R.id.button2);
            button2.setOnClickListener(view -> opensrch());
        Button button3 = findViewById(R.id.button3);
            button3.setOnClickListener(view -> openalphabet());
        Button button4 = findViewById(R.id.button4);
            button4.setOnClickListener(view -> opencategory());
        Button button5 = findViewById(R.id.button5);
            button5.setOnClickListener(view -> openaboutCuyo());
        Button button6 = findViewById(R.id.button6);
            button6.setOnClickListener(view -> openMainActivity());

        img = findViewById(R.id.img);

        img.setOnClickListener(view -> {
            openPopupWindow();
        });


    }

    private void openMainActivity() {
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }


    private void openPopupWindow() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_main3);

        // Apply the blur effect to the background (MainActivity2)
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND, WindowManager.LayoutParams.FLAG_BLUR_BEHIND);

        dialog.show();
    }

    private void opensrch() {
        Intent intent = new Intent(MainActivity2.this,srch.class);
        startActivity(intent);

    }

    private void openalphabet() {
        Intent intent = new Intent(MainActivity2.this,alphabet.class);
        startActivity(intent);
    }

    private void opencategory() {
        Intent intent = new Intent(MainActivity2.this,category.class);
        startActivity(intent);
    }

    private void openaboutCuyo() {
        Intent intent = new Intent(MainActivity2.this,aboutCuyo.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Remove the blur effect from MainActivity2 when MainActivity3 is closed
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
    }


}