package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
        String pos=intent.getStringExtra("position");
        String loc=intent.getStringExtra("loc");
        String company=intent.getStringExtra("company");
        String date=intent.getStringExtra("date");
        String sal=intent.getStringExtra("sal");
        setTitle(company);

        TextView position=findViewById(R.id.textView9);
        position.setText(pos);
        TextView location=findViewById(R.id.textView10);
        location.setText(loc);
        TextView dt=findViewById(R.id.textView11);
        dt.setText(date);
        TextView salary=findViewById(R.id.textView15);
        salary.setText(sal);

        ImageView img=findViewById(R.id.imageView6);
        int resId=intent.getIntExtra("resId",1);
        img.setImageResource(resId);

    }

}
