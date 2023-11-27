package com.example.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ProductActivity2 extends AppCompatActivity {
    ImageButton toMainPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product1);

        toMainPage = findViewById(R.id.backMain);

        toMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMain = new Intent(ProductActivity2.this, MainActivity.class);
                startActivity(toMain);
            }
        });
    }
}