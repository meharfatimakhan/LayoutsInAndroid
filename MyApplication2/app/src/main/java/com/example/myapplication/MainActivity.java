package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView name;
    public TextView age;
    public TextView position;
    public ImageView mydp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.textView1);
        age=findViewById(R.id.textView2);
        position=findViewById(R.id.textView3);
        mydp=findViewById(R.id.imageView2);

        Button applyButton=(Button) findViewById(R.id.button);
        applyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name2=name.getText().toString();
                String age2=age.getText().toString();
                String position2=position.getText().toString();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("position",position2);
                intent.putExtra("name",name2);
                intent.putExtra("age",age2);
                intent.putExtra("resId", R.drawable.me);
                startActivityForResult(intent,1);
            }
        });
    }
}
