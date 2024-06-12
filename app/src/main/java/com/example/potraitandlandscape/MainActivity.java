package com.example.potraitandlandscape;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getdata();
    }

    public void getdata() {
        Toast.makeText(this, "Hello Dada", Toast.LENGTH_SHORT).show();
    }
}