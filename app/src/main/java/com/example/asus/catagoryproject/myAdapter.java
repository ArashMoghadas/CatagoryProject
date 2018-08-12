package com.example.asus.catagoryproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class myAdapter extends ArrayAdapter<catagories> {
    private int color;
    private List<catagories> list;


    public myAdapter(@NonNull Context context, @NonNull List<catagories> objects , int color) {
        super(context, 0, objects);
        this.color=color;
        list = objects;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }

        RelativeLayout container = convertView.findViewById(R.id.container);
        container.setBackgroundColor(getContext().getResources().getColor(color));

        catagories current = list.get(position);

        TextView textview = convertView.findViewById(R.id.text);
        textview.setText(current.getName());

        ImageView imageview = convertView.findViewById(R.id.image);

        if (current.getImage_visible()== 1){
            imageview.setImageResource(current.getImage());
        }
        else{
            imageview.setVisibility(View.INVISIBLE);
        }

        return convertView;
    }
}

