package com.example.asus.catagoryproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numberClick(View view) {
        Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
        startActivity(intent);
    }

    public void familyClick(View view) {
        Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
        startActivity(intent);
    }

    public void daysClick(View view) {
        Intent intent = new Intent(MainActivity.this, DaysActivity.class);
        startActivity(intent);
    }
}
