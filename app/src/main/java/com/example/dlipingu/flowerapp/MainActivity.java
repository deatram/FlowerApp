package com.example.dlipingu.flowerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast msg = Toast.makeText(this, "Welcome to our app", Toast.LENGTH_LONG);
        msg.show();
    }
    @Override
    {
    }
}
