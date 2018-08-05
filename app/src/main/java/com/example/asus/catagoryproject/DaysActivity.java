package com.example.asus.catagoryproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DaysActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days);

        ArrayList<catagories> days = new ArrayList<>();

        days.add(new catagories("Friday",0));
        days.add(new catagories("Saturday",0));
        days.add(new catagories("Sunday",0));
        days.add(new catagories("Monday",0));
        days.add(new catagories("Tuesday",0));
        days.add(new catagories("Wednesday",0));
        days.add(new catagories("Thursday",0));




        ListView lv_number = findViewById(R.id.lv_day);

        myAdapter adapter = new myAdapter(this, days, R.color.myYellow);
        lv_number.setAdapter(adapter);
    }
}
