package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
        final String position=intent.getStringExtra("position");
        final String age=intent.getStringExtra("age");
        final String name=intent.getStringExtra("name");
        setTitle("About Mehar");

        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        TextView position2=findViewById(R.id.textView2);
        position2.setText(position);
        TextView age2=findViewById(R.id.textView1);
        age2.setText(age);
        TextView name2=findViewById(R.id.textView);
        name2.setText(name);

        ImageView img=findViewById(R.id.imageView);
        int resId=intent.getIntExtra("resId",1);
        img.setImageResource(resId);

        Button applyButton=(Button) findViewById(R.id.button2);
        applyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                intent.putExtra("position",position);
                intent.putExtra("name",name);
                intent.putExtra("age",age);
                intent.putExtra("resId", R.drawable.me);
                startActivityForResult(intent,2);
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
