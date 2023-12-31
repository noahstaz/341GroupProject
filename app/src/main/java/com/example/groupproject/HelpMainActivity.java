package com.example.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class HelpMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_main);
Intent intent1=getIntent();

        Spinner spinner=findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.my_array,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ImageButton add = findViewById(R.id.add);
        ImageButton map = findViewById(R.id.map);
        ImageButton home = findViewById(R.id.home);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(HelpMainActivity.this, MapActivity.class);
                startActivity(intent1);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(HelpMainActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(HelpMainActivity.this, SellActivity.class);
                startActivity(intent1);
            }
        });

        Button button = (Button) findViewById(R.id.q1_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HelpMainActivity.this, HelpMainActivity2.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.q2_button);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(HelpMainActivity.this, HelpMainActivity3.class);
                startActivity(intent2);
            }
        });

        Button button3 = (Button) findViewById(R.id.q3_button);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent3 = new Intent(HelpMainActivity.this, HelpMainActivity4.class);
                startActivity(intent3);
            }
        });

        Button button4 = (Button) findViewById(R.id.submit_button);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent4 = new Intent(HelpMainActivity.this, HelpMainActivity5.class);
                startActivity(intent4);
            }
        });


    }
}