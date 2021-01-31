package com.example.linear_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  EditText nameId,phoneId;
  TextView displayTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameId = findViewById(R.id.nameId);
        phoneId = findViewById(R.id.phoneId);
        displayTextView = findViewById(R.id.displayTextView);
    }

    public void displayFunction(View view) {
    }
}