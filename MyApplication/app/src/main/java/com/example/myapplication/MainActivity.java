package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {
    public TextView position;
    public TextView company;
    public TextView location;
    public TextView salary;
    public TextView postDate;
    public ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        position = findViewById(R.id.textView2);
        company = findViewById(R.id.textView3);
        location = findViewById(R.id.textView4);
        salary = findViewById(R.id.textView5);
        postDate = findViewById(R.id.textView8);
        logo=findViewById(R.id.imageView4);

        Button applyButton=(Button) findViewById(R.id.button);
        applyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String position2=position.getText().toString();
                String company2=company.getText().toString();
                String loc=location.getText().toString();
                String sal=salary.getText().toString();
                String date=postDate.getText().toString();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("position",position2);
                intent.putExtra("company",company2);
                intent.putExtra("loc",loc);
                intent.putExtra("sal",sal);
                intent.putExtra("date",date);
                intent.putExtra("resId", R.drawable.download);
                startActivityForResult(intent,1);
            }
        });

    }
}
