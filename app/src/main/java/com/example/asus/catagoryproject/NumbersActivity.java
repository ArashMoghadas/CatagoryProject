package com.example.asus.catagoryproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<catagories> number = new ArrayList<>();

        number.add(new catagories(R.drawable.one,"One",1));
        number.add(new catagories(R.drawable.two,"Two",1));
        number.add(new catagories(R.drawable.three,"Three",1));
        number.add(new catagories(R.drawable.four,"Four",1));
        number.add(new catagories(R.drawable.five,"Five",1));
        number.add(new catagories(R.drawable.six,"Six",1));
        number.add(new catagories(R.drawable.seven,"Seven",1));
        number.add(new catagories(R.drawable.eight,"Eight",1));
        number.add(new catagories(R.drawable.nine,"Nine",1));
        number.add(new catagories(R.drawable.ten,"Ten",1));



        ListView lv_number = findViewById(R.id.lv_number);

        myAdapter adapter = new myAdapter(this, number, R.color.myBlue);
        lv_number.setAdapter(adapter);
    }
}
