package com.example.asus.catagoryproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<catagories> family = new ArrayList<>();

        family.add(new catagories(R.drawable.mom,"Mom",1));
        family.add(new catagories(R.drawable.dad,"Dad",1));
        family.add(new catagories(R.drawable.brother,"Brother",1));
        family.add(new catagories(R.drawable.granny,"Grandmother",1));
        family.add(new catagories(R.drawable.grandfather,"Grandfather",1));

        ListView lv_number = findViewById(R.id.lv_family);

        myAdapter adapter = new myAdapter(this, family, R.color.myGreen);
        lv_number.setAdapter(adapter);
    }
}
