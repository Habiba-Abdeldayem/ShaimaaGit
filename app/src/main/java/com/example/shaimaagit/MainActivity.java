package com.example.shaimaagit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast myToast = Toast.makeText(this, "I'm a toast!", Toast.LENGTH_LONG);
        myToast.show();
    }
}