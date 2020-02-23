package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
    ImageView imgOne, imgTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        setTitle("Mehar's Portfolio");

        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imgOne=(ImageView)findViewById(R.id.imageView3);
        imgTwo=(ImageView)findViewById(R.id.imageView2);
        imgOne.setOnClickListener(this);
        imgTwo.setOnClickListener(this);

        Button homeButton=(Button) findViewById(R.id.button3);
        homeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main3Activity.this,MainActivity.class);
                startActivityForResult(intent,3);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    @Override
    public void onClick(View v){
        int id=v.getId();

        switch (id){
            case R.id.imageView3:
                imgOne.setVisibility(View.GONE);
                imgTwo.setVisibility(View.VISIBLE);
                break;

            case R.id.imageView2:
                imgOne.setVisibility(View.VISIBLE);
                imgTwo.setVisibility(View.GONE);
                break;


        }
    }
}
