package com.example.ktr3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textviewSontung = findViewById(R.id.textviewdatg);
        TextView textViewttsontung = findViewById(R.id.textViewttdatg);
        Button buttonback1 = findViewById(R.id.buttonback2);

        buttonback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}